package Clases;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 * Maneja las operaciones relacionadas con las calificaciones.
 */
public class LogicaNotas {
    private final Conexion mysql = new Conexion();
    private final Connection cn = mysql.conectar();
    private String quer;
    public Integer totalregistros;

    /**
     * Inserta una nueva calificación en la base de datos.
     * 
     * @param as Objeto CNotas que contiene la información de la calificación.
     * @param nombreCurso Nombre del curso.
     * @param idGrado ID del grado.
     * @return true si la operación es exitosa, false en caso contrario.
     */
    public boolean Guardar(CNotas as, String nombreCurso, int idGrado) {
        quer = "CALL InsertarCalificacion(?,?,?,?,?,?)";
        try {
            PreparedStatement pst = cn.prepareStatement(quer);
            pst.setString(1, as.getUnidad());
            pst.setDouble(2, as.getNota());
            pst.setString(3, as.getEstado());
            pst.setInt(4, as.getIdMatricula());
            pst.setString(5, nombreCurso);
            pst.setInt(6, idGrado);

            int n = pst.executeUpdate();
            return n != 0;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            return false;
        }
    }

    /**
     * Recupera y muestra todas las calificaciones.
     * 
     * @return DefaultTableModel con todas las calificaciones.
     */
    public DefaultTableModel Mostrar() {
        DefaultTableModel modelo;
        String[] titulos = {"id", "Codigo", "Nombre", "Apellido", "Curso", "Grado", "Unidad", "Nota", "Estado"};
        totalregistros = 0;
        modelo = new DefaultTableModel(null, titulos);

        LinkedList<String[]> registrosList = new LinkedList<>();

        String quer = "CALL ListarCalificaciones();";

        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(quer);

            while (rs.next()) {
                String[] registros = new String[9];
                registros[0] = rs.getString("idMatricula");
                registros[1] = rs.getString("idCalificaciones");
                registros[2] = rs.getString("NombreAlumno");
                registros[3] = rs.getString("ApellidoAlumno");
                registros[4] = rs.getString("NombreCurso");
                registros[5] = rs.getString("Grado");
                registros[6] = rs.getString("Unidad");
                registros[7] = rs.getString("Nota");
                registros[8] = rs.getString("Estado");

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
     * Busca calificaciones basadas en un criterio de búsqueda.
     * 
     * @param b Criterio de búsqueda.
     * @return DefaultTableModel con los resultados de la búsqueda.
     */
    public DefaultTableModel Buscar(String b) {
        DefaultTableModel modelo;
        String[] titulos = {"Codigo", "Nombre", "Apellido", "Curso", "Grado", "Unidad", "Nota", "Estado"};
        totalregistros = 0;
        modelo = new DefaultTableModel(null, titulos);

        LinkedList<String[]> registrosList = new LinkedList<>();

        String quer = "CALL BuscarCalificaciones(?);";

        try {
            PreparedStatement pst = cn.prepareStatement(quer);
            pst.setString(1, b);
            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                String[] registros = new String[8];
                registros[0] = rs.getString("idCalificaciones");
                registros[1] = rs.getString("NombreAlumno");
                registros[2] = rs.getString("ApellidoAlumno");
                registros[3] = rs.getString("NombreCurso");
                registros[4] = rs.getString("Grado");
                registros[5] = rs.getString("Unidad");
                registros[6] = rs.getString("Nota");
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
     * Actualiza una calificación existente en la base de datos.
     * 
     * @param nt Objeto CNotas que contiene la información actualizada de la calificación.
     * @param nombreCurso Nombre del curso.
     * @param idGrado ID del grado.
     * @return true si la actualización es exitosa, false en caso contrario.
     */
    public boolean editar(CNotas nt, String nombreCurso, int idGrado) {
        quer = "CALL EditarCalificacion(?, ?, ?, ?, ?, ?, ?);";
        try {
            PreparedStatement ps = cn.prepareStatement(quer);
            ps.setInt(1, nt.getIdCalificaciones());
            ps.setString(2, nt.getUnidad());
            ps.setDouble(3, nt.getNota());
            ps.setString(4, nt.getEstado());
            ps.setInt(5, nt.getIdMatricula());
            ps.setString(6, nombreCurso);
            ps.setInt(7, idGrado);

            int n = ps.executeUpdate();
            return n != 0;
        } catch (SQLException e) {
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }
    }

    /**
     * Elimina una calificación específica de la base de datos.
     * 
     * @param dts Objeto CNotas que representa la calificación a eliminar.
     * @return true si la eliminación es exitosa, false en caso contrario.
     */
    public boolean Eliminar(CNotas dts) {
        quer = "DELETE FROM calificaciones WHERE idCalificaciones = ?";
        PreparedStatement pst = null;

        try {
            pst = cn.prepareStatement(quer);
            pst.setInt(1, dts.getIdCalificaciones());

            int n = pst.executeUpdate();

            if (n > 0) {
                JOptionPane.showMessageDialog(null, "La calificación fue eliminada.");
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "La calificación no fue eliminada.");
                return false;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al eliminar la calificación: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    /**
     * Muestra un reporte de notas basado en el grado y la sección especificados.
     * 
     * @param g ID del grado.
     * @param r Sección.
     * @return DefaultTableModel con los detalles del reporte.
     */
    public DefaultTableModel Mostrar_Reporte_Notas(int g, String r) {
        DefaultTableModel modelo;
        String[] titulos = {"Codigo", "Doc", "docap", "Grado", "Sección", "Nombre", "Apellido", "DNI", "Curso", "1", "2", "3", "4", "Final"};
        modelo = new DefaultTableModel(null, titulos);

        String quer = "CALL ReporteNotas(?, ?);";

        try {
            PreparedStatement pst = cn.prepareStatement(quer);
            pst.setInt(1, g);
            pst.setString(2, r);
            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                String[] registros = new String[14];
                registros[0] = rs.getString("idMatricula");
                registros[1] = rs.getString("NombreProfesor");
                registros[2] = rs.getString("ApellidoProfesor");
                registros[3] = rs.getString("Grado");
                registros[4] = rs.getString("Seccion");
                registros[5] = rs.getString("NombreAlumno");
                registros[6] = rs.getString("ApellidoAlumno");
                registros[7] = rs.getString("DNI");
                registros[8] = rs.getString("NombreCurso");
                registros[9] = rs.getString("NotaPrimerBimestre");
                registros[10] = rs.getString("NotaSegundoBimestre");
                registros[11] = rs.getString("NotaTercerBimestre");
                registros[12] = rs.getString("NotaCuartoBimestre");
                registros[13] = rs.getString("PromedioFinal");
                modelo.addRow(registros);
            }
            return modelo;
        } catch (SQLException e) {
            System.out.print(e);
            return null;
        }
    }

    /**
     * Muestra un reporte de notas basado en el ID de matrícula.
     * 
     * @param idMatricula ID de matrícula.
     * @return DefaultTableModel con los detalles del reporte.
     */
    public DefaultTableModel Buscarr_Reporte_Notas(int idMatricula) {
        DefaultTableModel modelo;
        String[] titulos = {"Codigo", "Doc", "docap", "Grado", "Sección", "Apellido", "DNI", "Curso", "1", "2", "3", "4", "Final"};
        modelo = new DefaultTableModel(null, titulos);

        String quer = "CALL ReporteNotasPorIdMatricula(?);";

        try {
            PreparedStatement pst = cn.prepareStatement(quer);
            pst.setInt(1, idMatricula);
            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                String[] registros = new String[13];
                registros[0] = rs.getString("idMatricula");
                registros[1] = rs.getString("NombreProfesor");
                registros[2] = rs.getString("ApellidoProfesor");
                registros[3] = rs.getString("Grado");
                registros[4] = rs.getString("Sección");
                registros[5] = rs.getString("NombreAlumno");
                registros[6] = rs.getString("ApellidoAlumno");
                registros[7] = rs.getString("DNI");
                registros[8] = rs.getString("NombreCurso");
                registros[9] = rs.getString("NotaPrimerBimestre");
                registros[10] = rs.getString("NotaSegundoBimestre");
                registros[11] = rs.getString("NotaTercerBimestre");
                registros[12] = rs.getString("NotaCuartoBimestre");
                registros[13] = rs.getString("PromedioFinal");
                modelo.addRow(registros);
            }
            return modelo;
        } catch (SQLException e) {
            System.out.print(e);
            return null;
        }
    }
}
