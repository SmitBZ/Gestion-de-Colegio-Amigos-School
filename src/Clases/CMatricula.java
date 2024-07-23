package Clases;

import java.time.LocalDate;

/**
 *
 * @author Smit
 */

public class CMatricula {
    private int idMatricula;
    private int idAlumno;
    private LocalDate fecha;
    private double montoMatricula;
    private int idGrado;
    private String Seccion;
    private String Estado;
    private int idDocente;

    public CMatricula() {
    }

    public CMatricula(int idMatricula, int idAlumno, LocalDate fecha, double montoMatricula, int idGrado, String Seccion, String Estado, int idDocente) {
        this.idMatricula = idMatricula;
        this.idAlumno = idAlumno;
        this.fecha = fecha;
        this.montoMatricula = montoMatricula;
        this.idGrado = idGrado;
        this.Seccion = Seccion;
        this.Estado = Estado;
        this.idDocente = idDocente;
    }
    
    public int getIdMatricula() {
        return idMatricula;
    }

    public void setIdMatricula(int idMatricula) {
        this.idMatricula = idMatricula;
    }

    public int getIdAlumno() {
        return idAlumno;
    }

    public void setIdAlumno(int idAlumno) {
        this.idAlumno = idAlumno;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public double getMontoMatricula() {
        return montoMatricula;
    }

    public void setMontoMatricula(double montoMatricula) {
        this.montoMatricula = montoMatricula;
    }

    public int getIdGrado() {
        return idGrado;
    }

    public void setIdGrado(int idGrado) {
        this.idGrado = idGrado;
    }

    public String getSeccion() {
        return Seccion;
    }

    public void setSeccion(String Seccion) {
        this.Seccion = Seccion;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    public int getIdDocente() {
        return idDocente;
    }

    public void setIdDocente(int idDocente) {
        this.idDocente = idDocente;
    }

}
