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
 * La clase LogicaAsistencia proporciona métodos para interactuar con la base de datos
 * en relación con la gestión de asistencias. Incluye operaciones para guardar, 
 * mostrar, buscar, eliminar, y editar registros de asistencia.
 * 
 * @autor smit1
 */
public class LogicaAsistencia {
    private final Conexion mysql = new Conexion();
    private final Connection cn = mysql.conectar();
    private String quer = "";
    public Integer totalregistros;

    /**
     * Guarda un nuevo registro de asistencia en la base de datos.
     * 
     * @param as Objeto CAsistencia que contiene la información de la asistencia a guardar.
     * @return true si el registro se guarda exitosamente, false en caso contrario.
     */
    public boolean Guardar(CAsistencia as) {
        quer = "CALL InsertarAsistencia(?, ?, ?, ?);";
        try {
            PreparedStatement pst = cn.prepareStatement(quer);
            pst.setDate(1, java.sql.Date.valueOf(as.getFecha()));
            pst.setString(2, as.getHora());
            pst.setString(3, as.getEstado());
            pst.setInt(4, as.getIdMatricula());

            int n = pst.executeUpdate();

            return n != 0;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            return false;
        }
    }

    /**
     * Muestra todos los registros de asistencia en un modelo de tabla.
     * 
     * @return DefaultTableModel que contiene todos los registros de asistencia.
     */
    public DefaultTableModel Mostrar() {
        DefaultTableModel modelo;
        String[] titulos = {"Id", "Codigo", "Nombre", "Apellido", "Fecha", "Hora", "Estado"};
        totalregistros = 0;
        modelo = new DefaultTableModel(null, titulos);

        LinkedList<String[]> registrosList = new LinkedList<>();

        quer = "call ListarAsistencia();";

        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(quer);

            while (rs.next()) {
                String[] registros = new String[7];
                registros[0] = rs.getString("idMatricula");
                registros[1] = rs.getString("idAsistencia");
                registros[2] = rs.getString("NombreAlumno");
                registros[3] = rs.getString("ApellidoAlumno");
                registros[4] = rs.getString("Fecha");
                registros[5] = rs.getString("Hora");
                registros[6] = rs.getString("Estado");

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
     * Busca registros de asistencia por un parámetro y muestra el resultado en un modelo de tabla.
     * 
     * @param b Parámetro de búsqueda para filtrar los registros de asistencia.
     * @return DefaultTableModel que contiene los registros de asistencia encontrados.
     */
    public DefaultTableModel Buscar(String b) {
        DefaultTableModel modelo;
        String[] titulos = {"Id", "Codigo", "Nombre", "Apellido", "Fecha", "Hora", "Estado"};
        totalregistros = 0;
        modelo = new DefaultTableModel(null, titulos);

        LinkedList<String[]> registrosList = new LinkedList<>();
        quer = "call BuscarAsistencia(?);";

        try {
            PreparedStatement pst = cn.prepareStatement(quer);
            pst.setString(1, b);
            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                String[] registros = new String[7];
                registros[0] = rs.getString("idMatricula");
                registros[1] = rs.getString("idAsistencia");
                registros[2] = rs.getString("NombreAlumno");
                registros[3] = rs.getString("ApellidoAlumno");
                registros[4] = rs.getString("Fecha");
                registros[5] = rs.getString("Hora");
                registros[6] = rs.getString("Estado");

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
     * Elimina un registro de asistencia de la base de datos por su ID.
     * 
     * @param dts Objeto CAsistencia que contiene el ID de la asistencia a eliminar.
     * @return true si el registro se elimina exitosamente, false en caso contrario.
     */
    public boolean Eliminar(CAsistencia dts) {
        quer = "DELETE FROM asistencia WHERE idAsistencia = ?";
        PreparedStatement pst = null;

        try {
            pst = cn.prepareStatement(quer);
            pst.setInt(1, dts.getIdAsistencia());

            int n = pst.executeUpdate();

            return n > 0;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al eliminar: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    /**
     * Actualiza la información de un registro de asistencia en la base de datos.
     * 
     * @param dts Objeto CAsistencia que contiene la información actualizada de la asistencia.
     * @return true si la actualización es exitosa, false en caso contrario.
     */
    public boolean Editar(CAsistencia dts) {
        quer = "update asistencia set Fecha=?, Hora=?, Estado=?, idMatricula=? WHERE idAsistencia=?";
        try {
            PreparedStatement pst = cn.prepareStatement(quer);
            pst.setString(1, dts.getFecha().toString());
            pst.setString(2, dts.getHora());
            pst.setString(3, dts.getEstado());
            pst.setInt(4, dts.getIdMatricula());
            pst.setInt(5, dts.getIdAsistencia());
            int n = pst.executeUpdate();

            return n != 0;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            return false;
        }
    }

    /**
     * Muestra un reporte de asistencia basado en el grado y la sección especificados.
     * 
     * @param g Grado para filtrar el reporte de asistencia.
     * @param r Sección para filtrar el reporte de asistencia.
     * @return DefaultTableModel que contiene el reporte de asistencia filtrado.
     */
    public DefaultTableModel Mostrar_Reporte_Asistencia(int g, String r) {
        DefaultTableModel modelo;
        String[] titulos = {"id", "Codigo", "Alumno", "Apellido", "DNI", "Grado", "Seccion", "Docente", "Apellido Docente", "Fecha", "Hora", "Estado"};
        totalregistros = 0;
        modelo = new DefaultTableModel(null, titulos);
        quer = "call ListaASI(?, ?);";

        try {
            PreparedStatement pst = cn.prepareStatement(quer);
            pst.setInt(1, g);
            pst.setString(2, r);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                String[] registros = new String[12];
                registros[0] = rs.getString("idAsistencia");
                registros[1] = rs.getString("idMatricula");
                registros[2] = rs.getString("NombreAlumno");
                registros[3] = rs.getString("ApellidoAlumno");
                registros[4] = rs.getString("Dni");
                registros[5] = rs.getString("Nombre_Grado");
                registros[6] = rs.getString("Seccion");
                registros[7] = rs.getString("NombreProfesor");
                registros[8] = rs.getString("ApellidoProfesor");
                registros[9] = rs.getString("Fecha");
                registros[10] = rs.getString("Hora");
                registros[11] = rs.getString("Estado");
                modelo.addRow(registros);
            }

            return modelo;
        } catch (SQLException e) {
            System.out.print(e);
            return null;
        }
    }

    /**
     * Busca un reporte de asistencia basado en el parámetro especificado.
     * 
     * @param g Parámetro de búsqueda para filtrar el reporte de asistencia.
     * @return DefaultTableModel que contiene el reporte de asistencia filtrado.
     */
    public DefaultTableModel Buscar_Reporte_Asistencia(String g) {
        DefaultTableModel modelo;
        String[] titulos = {"id", "Codigo", "Alumno", "Apellido", "DNI", "Grado", "Seccion", "Docente", "Apellido Docente", "Fecha", "Hora", "Estado"};
        totalregistros = 0;
        modelo = new DefaultTableModel(null, titulos);
        quer = "call ReporteAsistencia(?);";

        try {
            PreparedStatement pst = cn.prepareStatement(quer);
            pst.setString(1, g);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                String[] registros = new String[12];
                registros[0] = rs.getString("idAsistencia");
                registros[1] = rs.getString("idMatricula");
                registros[2] = rs.getString("NombreAlumno");
                registros[3] = rs.getString("ApellidoAlumno");
                registros[4] = rs.getString("Dni");
                registros[5] = rs.getString("Nombre_Grado");
                registros[6] = rs.getString("Seccion");
                registros[7] = rs.getString("NombreProfesor");
                registros[8] = rs.getString("ApellidoProfesor");
                registros[9] = rs.getString("Fecha");
                registros[10] = rs.getString("Hora");
                registros[11] = rs.getString("Estado");
                modelo.addRow(registros);
            }

            return modelo;
        } catch (SQLException e) {
            System.out.print(e);
            return null;
        }
    }
}
