package Clases;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 * Maneja las operaciones relacionadas con las pensiones.
 */
public class LogicaPension {
    private final Conexion mysql = new Conexion();
    private final Connection cn = mysql.conectar();
    private String quer = "";
    public Integer totalregistros;

    /**
     * Inserta una nueva entrada de pensión en la base de datos.
     * 
     * @param as Objeto CPension que contiene la información de la pensión.
     * @return true si la operación es exitosa, false en caso contrario.
     */
    public boolean Guardar(CPension as) {
        quer = "call InsertarPension(?,?,?,?,?);";
        try {
            PreparedStatement pst = cn.prepareStatement(quer);
            pst.setInt(1, as.getIdMatricula());
            pst.setDate(2, Date.valueOf(as.getFecha()));
            pst.setDouble(3, as.getMonto());
            pst.setString(4, as.getCuota());
            pst.setString(5, as.getEstado());
            int n = pst.executeUpdate();
            
            return n != 0;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            return false;
        }
    }

    /**
     * Recupera y muestra todas las pensiones.
     * 
     * @return DefaultTableModel con todas las pensiones.
     */
    public DefaultTableModel Mostrar() {
        DefaultTableModel modelo;
        String[] titulos = {"Id", "Codigo", "Nombre", "Apellido", "Fecha", "Monto", "Cuota", "Estado"};
        totalregistros = 0;
        modelo = new DefaultTableModel(null, titulos);
    
        LinkedList<String[]> registrosList = new LinkedList<>();
    
        String quer = "call ListarPension();";
    
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(quer);
        
            while (rs.next()) {
                String[] registros = new String[8];
                registros[0] = rs.getString("idMatricula");
                registros[1] = rs.getString("idPension");
                registros[2] = rs.getString("NombreAlumno");
                registros[3] = rs.getString("ApellidoAlumno");
                registros[4] = rs.getString("Fecha");
                registros[5] = rs.getString("Monto");
                registros[6] = rs.getString("Cuota");
                registros[7] = rs.getString("Estado");
            
                totalregistros++;
                registrosList.add(registros);
            }
            for (String[] registro : registrosList) {
                modelo.addRow(registro);
            }
            return modelo;
        } catch (SQLException e) {
            System.out.print(e);
            return null;
        }
    }

    /**
     * Busca pensiones basadas en un criterio de búsqueda.
     * 
     * @param b Criterio de búsqueda.
     * @return DefaultTableModel con los resultados de la búsqueda.
     */
    public DefaultTableModel Buscar(String b) {
        DefaultTableModel modelo;
        String[] titulos = {"Id", "Codigo", "Nombre", "Apellido", "Fecha", "Monto", "Cuota", "Estado"};
        totalregistros = 0;
        modelo = new DefaultTableModel(null, titulos);

        LinkedList<String[]> registrosList = new LinkedList<>();

        String quer = "call BuscarPension(?);";

        try {
            PreparedStatement pst = cn.prepareStatement(quer);
            pst.setString(1, b);
            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                
                String[] registros = new String[8];
                registros[0] = rs.getString("idMatricula");
                registros[1] = rs.getString("idPension");
                registros[2] = rs.getString("NombreAlumno");
                registros[3] = rs.getString("ApellidoAlumno");
                registros[4] = rs.getString("Fecha");
                registros[5] = rs.getString("Monto");
                registros[6] = rs.getString("Cuota");
                registros[7] = rs.getString("Estado");

                totalregistros = totalregistros + 1;
                registrosList.add(registros);
            }

            for (String[] registro : registrosList) {
                modelo.addRow(registro);
            }

            return modelo;
        } catch (SQLException e) {
            System.out.print(e);
            return null;
        }
    }

    /**
     * Actualiza una entrada de pensión existente en la base de datos.
     * 
     * @param nt Objeto CPension que contiene la información actualizada de la pensión.
     * @return true si la actualización es exitosa, false en caso contrario.
     */
    public boolean Editar(CPension nt) {
        String quer = "UPDATE pension set idMatricula=?, Fecha=?, Monto=?, Cuota=?, Estado=? WHERE idPension=?";
        try {
            PreparedStatement ps = cn.prepareStatement(quer);
            ps.setInt(1, nt.getIdMatricula());
            ps.setDate(2, Date.valueOf(nt.getFecha()));
            ps.setDouble(3, nt.getMonto());
            ps.setString(4, nt.getCuota());
            ps.setString(5, nt.getEstado());
            ps.setInt(6, nt.getIdPension());
            
            int n = ps.executeUpdate();
            return n != 0;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            return false;
        }
    }

    /**
     * Elimina una entrada de pensión específica de la base de datos.
     * 
     * @param dts Objeto CPension que representa la pensión a eliminar.
     * @return true si la eliminación es exitosa, false en caso contrario.
     */
    public boolean Eliminar(CPension dts) {
        quer = "DELETE FROM pension WHERE idPension = ?";
        PreparedStatement pst = null;

        try {
            pst = cn.prepareStatement(quer);
            pst.setInt(1, dts.getIdPension());

            int n = pst.executeUpdate();

            return n > 0;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al eliminar " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        } 
    }   
    
    /**
     * Muestra un reporte de pensiones basado en el grado y la sección especificados.
     * 
     * @param g ID del grado.
     * @param r Sección.
     * @return DefaultTableModel con los detalles del reporte.
     */
    public DefaultTableModel Mostrar_Reporte_Pensiones(int g, String r) {
        DefaultTableModel modelo;
        String[] titulos = {"Codigo", "Grado","Seccion","Docente" , "Apelldo", "Alumno", "Apellido", "Fecha", "Monto","Cuota", "Estado"};
        totalregistros = 0;
        modelo = new DefaultTableModel(null, titulos);
        String quer = "call ReportePension(?, ?);";

        try {
            PreparedStatement pst = cn.prepareStatement(quer);
            pst.setInt(1, g);
            pst.setString(2, r);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                String[] registros = new String[11];
                registros[0] = rs.getString("idMatricula");
                registros[1] = rs.getString("Nombre_Grado");
                registros[2] = rs.getString("Seccion");
                registros[3] = rs.getString("NombreProfesor");
                registros[4] = rs.getString("ApellidoProfesor");
                registros[5] = rs.getString("NombreAlumno");
                registros[6] = rs.getString("ApellidoAlumno");
                registros[7] = rs.getString("Fecha");
                registros[8] = rs.getString("Monto");
                registros[9] = rs.getString("Cuota");
                registros[10] = rs.getString("Estado");
                modelo.addRow(registros);
            }

            return modelo;
        } catch (SQLException e) {
            System.out.print(e);

            return null;
        }
    }

    /**
     * Muestra un reporte de pensiones basado en un criterio de búsqueda específico.
     * 
     * @param r Criterio de búsqueda.
     * @return DefaultTableModel con los detalles del reporte.
     */
    public DefaultTableModel Buscar_Reporte_Pensiones(String r) {
        DefaultTableModel modelo;
        String[] titulos = {"Codigo", "Grado","Seccion","Docente" , "Apelldo", "Alumno", "Apellido", "Fecha", "Monto","Cuota", "Estado"};
        totalregistros = 0;
        modelo = new DefaultTableModel(null, titulos);
        String quer = "call Buscar_Reporte_Pension(?);";

        try {
            PreparedStatement pst = cn.prepareStatement(quer);
            pst.setString(1, r);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                String[] registros = new String[11];
                registros[0] = rs.getString("idMatricula");
                registros[1] = rs.getString("Nombre_Grado");
                registros[2] = rs.getString("Seccion");
                registros[3] = rs.getString("NombreProfesor");
                registros[4] = rs.getString("ApellidoProfesor");
                registros[5] = rs.getString("NombreAlumno");
                registros[6] = rs.getString("ApellidoAlumno");
                registros[7] = rs.getString("Fecha");
                registros[8] = rs.getString("Monto");
                registros[9] = rs.getString("Cuota");
                registros[10] = rs.getString("Estado");
                modelo.addRow(registros);
            }

            return modelo;
        } catch (SQLException e) {
            System.out.print(e);

            return null;
        }
    }
}
