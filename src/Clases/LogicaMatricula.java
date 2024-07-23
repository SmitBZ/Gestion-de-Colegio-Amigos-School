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
 * La clase LogicaMatricula proporciona métodos para interactuar con la base de datos
 * en relación con la gestión de matrículas. Incluye operaciones para guardar, 
 * mostrar, buscar, eliminar y editar registros de matrícula.
 * 
 * @autor smit1
 */
public class LogicaMatricula {
    private final Conexion mysql = new Conexion();
    private final Connection cn = mysql.conectar();
    private String sSQL = "";
    public Integer totalregistros;
    
    /**
     * Guarda un nuevo registro de matrícula en la base de datos.
     * 
     * @param matricula Objeto CMatricula que contiene la información de la matrícula a guardar.
     * @return true si el registro se guarda exitosamente, false en caso contrario.
     */
    public boolean Guardar(CMatricula matricula) {
        String sSQL = "{ call InsertarMatricula(?, ?, ?, ?, ?, ?, ?) }";
        try {
            PreparedStatement ps = cn.prepareStatement(sSQL);
            ps.setInt(1, matricula.getIdAlumno());
            ps.setDate(2, Date.valueOf(matricula.getFecha()));
            ps.setDouble(3, matricula.getMontoMatricula());
            ps.setString(4, matricula.getEstado());
            ps.setString(5, matricula.getSeccion());
            ps.setInt(6, matricula.getIdGrado());
            ps.setInt(7, matricula.getIdDocente());
            int n = ps.executeUpdate();
            return n != 0;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            return false;
        }
    }

    /**
     * Muestra todos los registros de matrícula en un modelo de tabla.
     * 
     * @return DefaultTableModel que contiene todos los registros de matrícula.
     */
    public DefaultTableModel Mostrar() {
        DefaultTableModel modelo;
        String[] titulos = {"idA", "idD", "Codigo", "Nombre", "Apellido", "Fecha", "Monto Matricula", "Estado", "Grado", "Seccion", "Nombre del Docente", "Docente a Cargo"};
        modelo = new DefaultTableModel(null, titulos);
        totalregistros = 0;
        LinkedList<String[]> registrosList = new LinkedList<>();
        String quer = "call ListarMatriculas();";

        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(quer);
            while (rs.next()) {
                String[] registros = new String[12];
                registros[0] = rs.getString("idAlumno");
                registros[1] = rs.getString("idDocente");
                registros[2] = rs.getString("idMatricula");
                registros[3] = rs.getString("NombreAlumno");
                registros[4] = rs.getString("ApellidoAlumno");
                registros[5] = rs.getString("Fecha");
                registros[6] = rs.getString("MontoMatricula");
                registros[7] = rs.getString("Estado");
                registros[8] = rs.getString("Nombre_Grado");
                registros[9] = rs.getString("Seccion");
                registros[10] = rs.getString("NombreDocente");
                registros[11] = rs.getString("ApellidoDocente");
                registrosList.add(registros);
                totalregistros++;
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
     * Busca registros de matrícula por ID y muestra el resultado en un modelo de tabla.
     * 
     * @param id ID de la matrícula a buscar.
     * @return DefaultTableModel que contiene los registros de matrícula encontrados.
     */
    public DefaultTableModel Buscar(String id) {
        DefaultTableModel modelo;
        String[] titulos = {"idA", "idD", "Codigo", "Nombre", "Apellido", "Fecha", "MontoMatricula", "Estado", "Grado", "Seccion", "Nombre del Docente", "Docente a Cargo"};
        modelo = new DefaultTableModel(null, titulos);
        totalregistros = 0; 
        LinkedList<String[]> registrosList = new LinkedList<>();        
        String quer = "call BuscarMatriculas(?);";

        try {
            PreparedStatement pst = cn.prepareStatement(quer);
            pst.setString(1, id);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                String[] registros = new String[12];
                registros[0] = rs.getString("idAlumno");
                registros[1] = rs.getString("idDocente");
                registros[2] = rs.getString("idMatricula");
                registros[3] = rs.getString("NombreAlumno");
                registros[4] = rs.getString("ApellidoAlumno");
                registros[5] = rs.getString("Fecha");
                registros[6] = rs.getString("MontoMatricula");
                registros[7] = rs.getString("Estado");
                registros[8] = rs.getString("Nombre_Grado");
                registros[9] = rs.getString("Seccion");
                registros[10] = rs.getString("NombreDocente");
                registros[11] = rs.getString("ApellidoDocente");
                registrosList.add(registros);
                totalregistros++;
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
     * Busca registros de asistencia basados en el grado y la sección especificados.
     * 
     * @param grado Grado para filtrar los registros de asistencia.
     * @param seccion Sección para filtrar los registros de asistencia.
     * @return DefaultTableModel que contiene los registros de asistencia encontrados.
     */
    public DefaultTableModel Buscar_Asistencia(int grado, String seccion) {
        DefaultTableModel modelo;
        String[] titulos = {"Codigo", "Alumno", "Apellido", "Grado", "Seccion"};
        totalregistros = 0;
        modelo = new DefaultTableModel(null, titulos);
        String quer = "call ConsultaAsistencia(?, ?);";

        try {
            PreparedStatement pst = cn.prepareStatement(quer);
            pst.setInt(1, grado);
            pst.setString(2, seccion);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                String[] registros = new String[5];
                registros[0] = rs.getString("idMatricula");
                registros[1] = rs.getString("Nombre");
                registros[2] = rs.getString("Apellido");
                registros[3] = rs.getString("Seccion");
                registros[4] = rs.getString("idGrado");
                modelo.addRow(registros);
            }

            return modelo;
        } catch (SQLException e) {
            System.out.print(e);
            return null;
        }
    }

    /**
     * Busca registros de notas basados en el grado, la sección y el curso especificados.
     * 
     * @param grado Grado para filtrar los registros de notas.
     * @param seccion Sección para filtrar los registros de notas.
     * @param curso Curso para filtrar los registros de notas.
     * @return DefaultTableModel que contiene los registros de notas encontrados.
     */
    public DefaultTableModel Buscar_Notas(int grado, String seccion, String curso) {
        DefaultTableModel modelo;
        String[] titulos = {"Codigo", "Alumno", "Apellido", "Grado", "Seccion", "Curso"};
        totalregistros = 0;
        modelo = new DefaultTableModel(null, titulos);
        String quer = "call ConsultaCalificaciones(?, ?, ?);";

        try {
            PreparedStatement pst = cn.prepareStatement(quer);
            pst.setInt(1, grado);
            pst.setString(2, seccion);
            pst.setString(3, curso);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                String[] registros = new String[6];
                registros[0] = rs.getString("idMatricula");
                registros[1] = rs.getString("Nombre");
                registros[2] = rs.getString("Apellido");
                registros[3] = rs.getString("idGRado");
                registros[4] = rs.getString("Seccion");
                registros[5] = rs.getString("NombreCurso");
                modelo.addRow(registros);
            }

            return modelo;
        } catch (SQLException e) {
            System.out.print(e);
            return null;
        }
    }

    /**
     * Busca un reporte de matrícula basado en el código especificado.
     * 
     * @param codigo Código de la matrícula para el reporte.
     * @return DefaultTableModel que contiene el reporte de matrícula.
     */
    public DefaultTableModel Buscar_Reporte_Matricula(String codigo) {
        DefaultTableModel modelo;
        String[] titulos = {"id", "Codigo", "Alumno", "Apellido", "DNI", "Sexo", "Direccion", "Fecha N.", "Apoderado", "Nombre", "Apellido", "DNI", "Telefono", "Fecha", "Grado", "Seccion", "Docente", "Apelldo", "Curso"};
        modelo = new DefaultTableModel(null, titulos);
        String quer = "call ReporteAlumno(?);";

        try {
            PreparedStatement pst = cn.prepareStatement(quer);
            pst.setString(1, codigo);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                String[] registros = new String[19];
                registros[0] = rs.getString("idGrado");
                registros[1] = rs.getString("idMatricula");
                registros[2] = rs.getString("NombreAlumno");
                registros[3] = rs.getString("ApellidoAlumno");
                registros[4] = rs.getString("DniAlumno");
                registros[5] = rs.getString("SexoAlumno");
                registros[6] = rs.getString("DireccionAlumno");
                registros[7] = rs.getString("FechaNacimientoAlumno");
                registros[8] = rs.getString("Tutor");
                registros[9] = rs.getString("NombreApoderado");
                registros[10] = rs.getString("ApellidoApoderado");
                registros[11] = rs.getString("DNIApoderado");
                registros[12] = rs.getString("TelefonoApoderado");
                registros[13] = rs.getString("FechaNacimientoApoderado");
                registros[14] = rs.getString("Nombre_Grado");
                registros[15] = rs.getString("Seccion");
                registros[16] = rs.getString("NombreDocente");
                registros[17] = rs.getString("ApellidoDocente");
                registros[18] = rs.getString("NombreCurso");
                modelo.addRow(registros);
            }

            return modelo;
        } catch (SQLException e) {
            System.out.print(e);
            return null;
        }
    }

    /**
     * Muestra un reporte de matrícula basado en el grado y la sección especificados.
     * 
     * @param g Grado para el reporte.
     * @param r Sección para el reporte.
     * @return DefaultTableModel que contiene el reporte de matrícula.
     */
    public DefaultTableModel Mostrar_Reporte_Matricula(int g, String r) {
        DefaultTableModel modelo;
        String[] titulos = {"id", "Codigo", "Alumno", "Apellido", "DNI", "Sexo", "Direccion", "Fecha N.", "Apoderado", "Nombre", "Apellido", "DNI", "Telefono", "Fecha", "Grado", "Seccion", "Docente", "Apelldo", "Curso"};
        totalregistros = 0;
        modelo = new DefaultTableModel(null, titulos);
        String quer = "call ListarMaA(?, ?);";

        try {
            PreparedStatement pst = cn.prepareStatement(quer);
            pst.setInt(1, g);
            pst.setString(2, r);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                String[] registros = new String[19];
                registros[0] = rs.getString("idGrado");
                registros[1] = rs.getString("idMatricula");
                registros[2] = rs.getString("NombreAlumno");
                registros[3] = rs.getString("ApellidoAlumno");
                registros[4] = rs.getString("DniAlumno");
                registros[5] = rs.getString("SexoAlumno");
                registros[6] = rs.getString("DireccionAlumno");
                registros[7] = rs.getString("FechaNacimientoAlumno");
                registros[8] = rs.getString("Tutor");
                registros[9] = rs.getString("NombreApoderado");
                registros[10] = rs.getString("ApellidoApoderado");
                registros[11] = rs.getString("DNIApoderado");
                registros[12] = rs.getString("TelefonoApoderado");
                registros[13] = rs.getString("FechaNacimientoApoderado");
                registros[14] = rs.getString("Nombre_Grado");
                registros[15] = rs.getString("Seccion");
                registros[16] = rs.getString("NombreDocente");
                registros[17] = rs.getString("ApellidoDocente");
                registros[18] = rs.getString("NombreCurso");
                modelo.addRow(registros);
            }

            return modelo;
        } catch (SQLException e) {
            System.out.print(e);
            return null;
        }
    }

    /**
     * Elimina un registro de matrícula de la base de datos.
     * 
     * @param ma Objeto CMatricula que representa la matrícula a eliminar.
     * @return true si el registro se elimina exitosamente, false en caso contrario.
     */
    public boolean Eliminar(CMatricula ma) {
        sSQL = "DELETE FROM matricula WHERE idMatricula = ?";
        try (PreparedStatement pst = cn.prepareStatement(sSQL)) {
            pst.setInt(1, ma.getIdMatricula());

            int n = pst.executeUpdate();

            return n > 0;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al eliminar la matrícula: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    /**
     * Edita un registro de matrícula en la base de datos.
     * 
     * @param ma Objeto CMatricula que contiene la información actualizada de la matrícula.
     * @return true si el registro se edita exitosamente, false en caso contrario.
     */
    public boolean Editar(CMatricula ma) {
        sSQL = "UPDATE matricula SET idAlumno=?, Fecha=?, MontoMatricula=?, idGrado=?, Seccion=?, Estado=?, idDocente=? WHERE idMatricula=?";
        try {
            PreparedStatement ps = cn.prepareStatement(sSQL);
            
            ps.setInt(1, ma.getIdAlumno());
            ps.setDate(2, Date.valueOf(ma.getFecha()));
            ps.setDouble(3, ma.getMontoMatricula());
            ps.setInt(4, ma.getIdGrado());
            ps.setString(5, ma.getSeccion());
            ps.setString(6, ma.getEstado());
            ps.setInt(7, ma.getIdDocente());
            ps.setInt(8, ma.getIdMatricula());

            int n = ps.executeUpdate();

            return n != 0;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            return false;
        }
    }
}
