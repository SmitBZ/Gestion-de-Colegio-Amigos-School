package Clases;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 * Maneja las operaciones relacionadas con los profesores.
 */
public class LogicaProfesor {
    private final Conexion mysql = new Conexion();
    private final Connection cn = mysql.conectar();
    private String sSQL = "";
    public int totalregistros;

    /**
     * Inserta un nuevo profesor en la base de datos.
     * 
     * @param pr Objeto CProfesor que contiene la información del profesor.
     * @return true si la operación es exitosa, false en caso contrario.
     */
    public boolean Guardar(CProfesor pr) {
        String sSQL = "{CALL InsertarDocente(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)}";
        try {
            PreparedStatement ps = cn.prepareStatement(sSQL);
            ps.setString(1, pr.getNombre());
            ps.setString(2, pr.getApellidos());
            ps.setString(3, pr.getDireccion());
            ps.setString(4, pr.getDNI());
            ps.setString(5, pr.getSexo());
            ps.setString(6, pr.getTelefono());
            ps.setString(7, pr.getCorreo());
            ps.setString(8, pr.getEspecialidad());
            ps.setDate(9, Date.valueOf(pr.getFecha()));
            ps.setDate(10, Date.valueOf(pr.getContrato()));
            int n = ps.executeUpdate();
            return n != 0;
        
        } catch (SQLException e) {
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }
    }

    /**
     * Recupera y muestra todos los profesores.
     * 
     * @return DefaultTableModel con todos los profesores.
     */
    public DefaultTableModel Mostrar() {
        DefaultTableModel modelo;
        String[] titulos = {"idDocente", "Nombre", "Apellido", "Direccion", "DNI", "Sexo", "Telefono", "Correo", "Especialidad", "Fecha", "Fecha de Contrato"};
        modelo = new DefaultTableModel(null, titulos);
        String quer = "call ListarDocentes();";

        try {
            PreparedStatement pst = cn.prepareStatement(quer);
            ResultSet rs = pst.executeQuery();
        
            while (rs.next()) {
                String[] registros = new String[11];
                registros[0] = rs.getString("idDocente");
                registros[1] = rs.getString("Nombre");
                registros[2] = rs.getString("Apellido");
                registros[3] = rs.getString("Direccion");
                registros[4] = rs.getString("DNI");
                registros[5] = rs.getString("Sexo");
                registros[6] = rs.getString("Telefono");
                registros[7] = rs.getString("Correo");
                registros[8] = rs.getString("Especialidad");
                registros[9] = rs.getString("Fecha");
                registros[10] = rs.getString("Contrato");
            
                totalregistros++;
                modelo.addRow(registros);
            }
            return modelo;
        } catch (SQLException e) {
            System.out.print(e);
            return null;
        }
    }

    /**
     * Busca profesores basados en el DNI.
     * 
     * @param dni DNI del profesor a buscar.
     * @return DefaultTableModel con los resultados de la búsqueda.
     */
    public DefaultTableModel Buscar(String dni) {
        DefaultTableModel modelo;
        String[] titulos = {"idDocente", "Nombre", "Apellido", "Direccion", "DNI", "Sexo", "Telefono", "Correo", "Especialidad", "Fecha", "Fecha de Contrato"};
        modelo = new DefaultTableModel(null, titulos);
        String quer = "call BuscarDocente(?);";

        try {
            PreparedStatement pst = cn.prepareStatement(quer);
            pst.setString(1, dni);
            ResultSet rs = pst.executeQuery();
        
            while (rs.next()) {
                String[] registros = new String[11];
                registros[0] = rs.getString("idDocente");
                registros[1] = rs.getString("Nombre");
                registros[2] = rs.getString("Apellido");
                registros[3] = rs.getString("Direccion");
                registros[4] = rs.getString("DNI");
                registros[5] = rs.getString("Sexo");
                registros[6] = rs.getString("Telefono");
                registros[7] = rs.getString("Correo");
                registros[8] = rs.getString("Especialidad");
                registros[9] = rs.getString("Fecha");
                registros[10] = rs.getString("Contrato");
            
                totalregistros++;
                modelo.addRow(registros);
            }
            return modelo;
        } catch (SQLException e) {
            System.out.print(e);
            return null;
        }
    }

    /**
     * Muestra una vista simplificada de los profesores.
     * 
     * @return DefaultTableModel con una vista simplificada de los profesores.
     */
    public DefaultTableModel MostrarVista() {
        DefaultTableModel modelo;
        String[] titulos = {"Codigo", "Nombres", "Apellidos", "Especialidad"};
        String[] registros = new String[6];
        modelo = new DefaultTableModel(null, titulos);
        String quer = "call VistaDocente();";

        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(quer);
            while (rs.next()) {
                registros[0] = rs.getString("idDocente");
                registros[1] = rs.getString("Nombre");
                registros[2] = rs.getString("Apellido");
                registros[3] = rs.getString("Especialidad");
                modelo.addRow(registros);
            }
            return modelo;
        } catch (SQLException e) {
            System.out.print(e);
            return null;
        }
    }

    /**
     * Elimina un profesor de la base de datos.
     * 
     * @param al Objeto CProfesor que contiene el DNI del profesor a eliminar.
     * @return true si la eliminación es exitosa, false en caso contrario.
     */
    public boolean Eliminar(CProfesor al) {
        sSQL = "DELETE FROM docente WHERE DNI = ?";
        PreparedStatement pst = null;

        try {
            pst = cn.prepareStatement(sSQL);
            pst.setString(1, al.getDNI());

            int n = pst.executeUpdate();

            if (n > 0) {
                JOptionPane.showMessageDialog(null, "El profesor con DNI " + al.getDNI() + " fue eliminado.");
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró el profesor con DNI " + al.getDNI());
                return false;
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al eliminar el profesor: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    /**
     * Actualiza la información de un profesor existente en la base de datos.
     * 
     * @param pr Objeto CProfesor que contiene la información actualizada del profesor.
     * @return true si la actualización es exitosa, false en caso contrario.
     */
    public boolean Editar(CProfesor pr) {
        sSQL = "UPDATE docente SET Nombre=?, Apellido=?, Direccion=?, DNI=?, Sexo=?, Telefono=?, Correo=?, Especialidad=?, Fecha=?, Contrato=? WHERE DNI=?";
        try {
            PreparedStatement ps = cn.prepareStatement(sSQL);
            ps.setString(1, pr.getNombre());
            ps.setString(2, pr.getApellidos());
            ps.setString(3, pr.getDireccion());
            ps.setString(4, pr.getDNI());
            ps.setString(5, pr.getSexo());
            ps.setString(6, pr.getTelefono());
            ps.setString(7, pr.getCorreo());
            ps.setString(8, pr.getEspecialidad());
            ps.setDate(9, Date.valueOf(pr.getFecha()));
            ps.setDate(10, Date.valueOf(pr.getContrato()));
            ps.setString(11, pr.getDNI());
            int n = ps.executeUpdate();
            
            return n != 0;
            
        } catch (SQLException e) {
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }
    }
}
