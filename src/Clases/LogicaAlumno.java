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
 * La clase LogicaAlumno proporciona métodos para interactuar con la base de datos
 * en relación con la gestión de alumnos. Incluye operaciones para guardar, 
 * mostrar, buscar, eliminar y editar registros de alumnos.
 * 
 * @author smit1
 */
public class LogicaAlumno {
    private final Conexion mysql = new Conexion();
    private final Connection cn = mysql.conectar();
    private String sSQL="";
    public  Integer totalregistros;
    
    /**
     * Guarda un nuevo alumno en la base de datos.
     * 
     * @param al Objeto CAlumno que contiene la información del alumno a guardar.
     * @return true si el registro se guarda exitosamente, false en caso contrario.
     */
    public boolean Guardar(CAlumno al) {
        String sql = "{CALL InsertarAlumno(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)}";
        try {
            PreparedStatement ps = cn.prepareStatement(sql);

            ps.setString(1, al.getNombre());
            ps.setString(2, al.getApellido());
            ps.setString(3, al.getDNI());
            ps.setString(4, al.getSexo());
            ps.setString(5, al.getDirección());
            ps.setDate(6, Date.valueOf(al.getFecha()));
            ps.setString(7, al.getTutor());
            ps.setString(8, al.getNombreApoderado());
            ps.setString(9, al.getApellidoApoderado());
            ps.setString(10, al.getDNIApoderado());
            ps.setString(11, al.getTelefono());
            ps.setDate(12, Date.valueOf(al.getFechaApoderado()));

            int n = ps.executeUpdate();
            return n != 0;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            return false;
        }
    }
    
    /**
     * Muestra todos los registros de alumnos en un modelo de tabla.
     * 
     * @return DefaultTableModel que contiene todos los registros de alumnos.
     */
    public DefaultTableModel Mostrar() {
        DefaultTableModel modelo;
        String[] titulos = {"idalumno", "Nombres", "Apellidos", "Dni", "Sexo", "Direccion", 
                            "Fecha Nacimiento", "Tutor", "Nombre del Apoderado", 
                            "Apellido del Apoderado", "DNI del Apoderado", "Telefono",  
                            "Fecha Nacimiento Apoderado"};
        
        totalregistros = 0;
        modelo = new DefaultTableModel(null, titulos);
        String sql = "CALL ListarAlumnos();";

        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            while (rs.next()) {
                String[] registros = new String[13];
                registros[0] = rs.getString("idAlumno");
                registros[1] = rs.getString("Nombre");
                registros[2] = rs.getString("Apellido");
                registros[3] = rs.getString("DNI");
                registros[4] = rs.getString("Sexo");
                registros[5] = rs.getString("Direccion");
                registros[6] = rs.getString("Fecha");
                registros[7] = rs.getString("Tutor");
                registros[8] = rs.getString("NombreApoderado");
                registros[9] = rs.getString("ApellidoApoderado");
                registros[10] = rs.getString("DNIApoderado");
                registros[11] = rs.getString("Telefono");
                registros[12] = rs.getString("FechaApoderado");

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
     * Busca un alumno por su DNI y muestra el registro en un modelo de tabla.
     * 
     * @param dni DNI del alumno a buscar.
     * @return DefaultTableModel que contiene el registro del alumno encontrado.
     */
    public DefaultTableModel Buscar(String dni) {
        DefaultTableModel modelo;
        String[] titulos = {"idalumno", "Nombres", "Apellidos", "Dni", "Sexo", "Direccion", 
                            "Fecha Nacimiento", "Tutor", "Nombre del Apoderado", 
                            "Apellido del Apoderado", "DNI del Apoderado", "Telefono",  
                            "Fecha Nacimiento Apoderado"};
        String[] registros = new String[13];
        totalregistros = 0;
        modelo = new DefaultTableModel(null, titulos);
        
        String sql = "CALL BuscarAlumno(?);";
        try {
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setString(1, dni);  // Configurar el parámetro dni
            ResultSet rs = pst.executeQuery();
            
            while (rs.next()) {
                registros[0] = rs.getString("idAlumno");
                registros[1] = rs.getString("Nombre");
                registros[2] = rs.getString("Apellido");
                registros[3] = rs.getString("DNI");
                registros[4] = rs.getString("Sexo");
                registros[5] = rs.getString("Direccion");
                registros[6] = rs.getString("Fecha");
                registros[7] = rs.getString("Tutor");
                registros[8] = rs.getString("NombreApoderado");
                registros[9] = rs.getString("ApellidoApoderado");
                registros[10] = rs.getString("DNIApoderado");
                registros[11] = rs.getString("Telefono");
                registros[12] = rs.getString("FechaApoderado");

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
     * Muestra una vista simplificada de los alumnos en un modelo de tabla.
     * 
     * @return DefaultTableModel que contiene una vista simplificada de los alumnos.
     */
    public DefaultTableModel MostrarVista() {
        DefaultTableModel modelo;
        String[] titulos = {"Codigo", "Nombres", "Apellidos", "Dni", "Sexo"};
        String[] registros = new String[6];
        modelo = new DefaultTableModel(null, titulos);
        String sql = "call VistaAlumno();";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                registros[0] = rs.getString("idAlumno");
                registros[1] = rs.getString("Nombre");
                registros[2] = rs.getString("Apellido");
                registros[3] = rs.getString("Dni");
                registros[4] = rs.getString("Sexo");
                modelo.addRow(registros);
            }
            return modelo;
        } catch (SQLException e) {
            System.out.print(e);
            return null;
        }
    }
    
    /**
     * Elimina un alumno de la base de datos por su DNI.
     * 
     * @param al Objeto CAlumno que contiene el DNI del alumno a eliminar.
     * @return true si el alumno se elimina exitosamente, false en caso contrario.
     */
    public boolean Eliminar(CAlumno al) {
        sSQL = "DELETE FROM alumno WHERE Dni = ?";
        PreparedStatement pst = null;

        try {
            pst = cn.prepareStatement(sSQL);
            pst.setString(1, al.getDNI());

            int n = pst.executeUpdate();

            if (n > 0) {
                JOptionPane.showMessageDialog(null, "El alumno con DNI " + al.getDNI() + " fue eliminado.");
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró el alumno con DNI " + al.getDNI());
                return false;
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al eliminar el alumno: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            return false;

        }
    }
    
    /**
     * Actualiza la información de un alumno en la base de datos.
     * 
     * @param al Objeto CAlumno que contiene la información actualizada del alumno.
     * @return true si la actualización es exitosa, false en caso contrario.
     */
    public boolean Editar(CAlumno al) {
        sSQL = "update alumno set Nombre=?, Apellido=?, DNI=?, Sexo=?, Direccion=?, Fecha=?, Tutor=?, NombreApoderado=?, ApellidoApoderado=?, DNIApoderado=?, Telefono=?, FechaApoderado=? where Dni=?";
        try {           
            PreparedStatement ps = cn.prepareStatement(sSQL);
            ps.setString(1, al.getNombre());
            ps.setString(2, al.getApellido());
            ps.setString(3, al.getDNI());
            ps.setString(4, al.getSexo());
            ps.setString(5, al.getDirección());
            ps.setDate(6, Date.valueOf(al.getFecha()));
            ps.setString(7, al.getTutor());
            ps.setString(8, al.getNombreApoderado());
            ps.setString(9, al.getApellidoApoderado());
            ps.setString(10, al.getDNIApoderado());
            ps.setString(11, al.getTelefono());
            ps.setDate(12, Date.valueOf(al.getFechaApoderado()));
            ps.setString(13, al.getDNI());
            int n = ps.executeUpdate();
            return n != 0;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            return false;
        }
    }
}
