package Clases;

import java.time.LocalDate;

/**
 *
 * @author smit1
 */
public class CAlumno {
    private int idalumno;
    private String Nombre;
    private String Apellido;
    private String DNI;
    private String Sexo;
    private String Dirección;
    private LocalDate Fecha;
    private String Tutor;
    private String NombreApoderado;
    private String ApellidoApoderado;
    private String DNIApoderado;
    private String Telefono;
    private LocalDate FechaApoderado;
    

    public CAlumno() {
    }

    public CAlumno(int idalumno, String Nombre, String Apellido, String DNI, String Sexo, String Dirección, LocalDate Fecha, String Tutor, String NombreApoderado, String ApellidoApoderado, String DNIApoderado, String Telefono, LocalDate FechaApoderado) {
        this.idalumno = idalumno;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.DNI = DNI;
        this.Sexo = Sexo;
        this.Dirección = Dirección;
        this.Fecha = Fecha;
        this.Tutor = Tutor;
        this.NombreApoderado = NombreApoderado;
        this.ApellidoApoderado = ApellidoApoderado;
        this.DNIApoderado = DNIApoderado;
        this.Telefono = Telefono;
        this.FechaApoderado = FechaApoderado;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }

    public String getDirección() {
        return Dirección;
    }

    public void setDirección(String Dirección) {
        this.Dirección = Dirección;
    }

    public LocalDate getFecha() {
        return Fecha;
    }

    public void setFecha(LocalDate Fecha) {
        this.Fecha = Fecha;
    }

    public int getIdAlumno() {
        return idalumno;
    }

    public void setIdAlumno(int id) {
        this.idalumno = id;
    }

    public String getTutor() {
        return Tutor;
    }

    public void setTutor(String Tutor) {
        this.Tutor = Tutor;
    }

    public String getNombreApoderado() {
        return NombreApoderado;
    }

    public void setNombreApoderado(String NombreApoderado) {
        this.NombreApoderado = NombreApoderado;
    }

    public String getApellidoApoderado() {
        return ApellidoApoderado;
    }

    public void setApellidoApoderado(String ApellidoApoderado) {
        this.ApellidoApoderado = ApellidoApoderado;
    }

    public String getDNIApoderado() {
        return DNIApoderado;
    }

    public void setDNIApoderado(String DNIApoderado) {
        this.DNIApoderado = DNIApoderado;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public LocalDate getFechaApoderado() {
        return FechaApoderado;
    }

    public void setFechaApoderado(LocalDate FechaApoderado) {
        this.FechaApoderado = FechaApoderado;
    }
    
}
