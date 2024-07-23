package Clases;

import java.time.LocalDate;

/**
 *
 * @author smit1
 */
public class CAsistencia {
    private int idAsistencia;
    private int idMatricula;
    private LocalDate fecha;
    private String Hora;
    private String Estado;

    public CAsistencia() {
    }

    public CAsistencia(int idAsistencia, int idMatricula, LocalDate fecha, String Hora, String Estado) {
        this.idAsistencia = idAsistencia;
        this.idMatricula = idMatricula;
        this.fecha = fecha;
        this.Hora = Hora;
        this.Estado = Estado;
    }

    public int getIdAsistencia() {
        return idAsistencia;
    }

    public void setIdAsistencia(int idAsistencia) {
        this.idAsistencia = idAsistencia;
    }

    public int getIdMatricula() {
        return idMatricula;
    }

    public void setIdMatricula(int idMatricula) {
        this.idMatricula = idMatricula;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return Hora;
    }

    public void setHora(String Hora) {
        this.Hora = Hora;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }
    
}
