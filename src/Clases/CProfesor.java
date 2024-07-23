package Clases;


import java.time.LocalDate;
import java.util.Comparator;


public class CProfesor implements Comparable<CProfesor>{
    private int idDocente;
    private String Nombre;
    private String Apellido;
    private String Direccion;
    private String DNI;
    private String Sexo;
    private String Telefono;
    private String Correo;
    private String Especialidad;
    private LocalDate Fecha;
    private LocalDate Contrato;

    public CProfesor() {
    }
    
    public CProfesor(int id, String Nombre, String Apellidos, String Direccion, String DNI, String Sexo, String Telefono, String Correo, String Especialidad, LocalDate Fecha, LocalDate Contrato) {
        this.idDocente = id;
        this.Nombre = Nombre;
        this.Apellido = Apellidos;
        this.Direccion = Direccion;
        this.DNI = DNI;
        this.Sexo = Sexo;
        this.Telefono = Telefono;
        this.Correo = Correo;
        this.Especialidad = Especialidad;
        this.Fecha = Fecha;
        this.Contrato = Contrato;
    }

    public int getId() {
        return idDocente;
    }

    public void setId(int id) {
        this.idDocente = id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellidos() {
        return Apellido;
    }

    public void setApellidos(String Apellidos) {
        this.Apellido = Apellidos;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
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

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public String getEspecialidad() {
        return Especialidad;
    }

    public void setEspecialidad(String Especialidad) {
        this.Especialidad = Especialidad;
    }

    public LocalDate getFecha() {
        return Fecha;
    }

    public void setFecha(LocalDate Fecha) {
        this.Fecha = Fecha;
    }

    public LocalDate getContrato() {
        return Contrato;
    }

    public void setContrato(LocalDate Contrato) {
        this.Contrato = Contrato;
    }


    public Object[] Fila(){
        return new Object[]{idDocente,Nombre, Apellido, Direccion, DNI, Sexo, Telefono, Correo, Especialidad, Fecha, Contrato};
    }

    @Override
    public int compareTo(CProfesor otroPro){
        return Comparador_Profe.compare(this, otroPro);
    }
    
    public static final Comparator<CProfesor> Comparador_Profe = Comparator.comparing(CProfesor::getDNI);
    
}

