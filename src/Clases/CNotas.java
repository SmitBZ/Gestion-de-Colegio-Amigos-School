package Clases;

/**
 *
 * @author Smit
 */

public class CNotas {
    private int idCalificaciones;
    private int idMatricula;
    private String Unidad;
    private double Nota;
    private String Estado;

    public CNotas() {
    }

    public CNotas(int idCalificaciones, int idMatricula, String Unidad, double Nota, String Estado) {
        this.idCalificaciones = idCalificaciones;
        this.idMatricula = idMatricula;
        this.Unidad = Unidad;
        this.Nota = Nota;
        this.Estado = Estado;
    }

    public int getIdCalificaciones() {
        return idCalificaciones;
    }

    public void setIdCalificaciones(int idCalificacioens) {
        this.idCalificaciones = idCalificacioens;
    }

    public int getIdMatricula() {
        return idMatricula;
    }

    public void setIdMatricula(int idMatricula) {
        this.idMatricula = idMatricula;
    }

    public String getUnidad() {
        return Unidad;
    }

    public void setUnidad(String Unidad) {
        this.Unidad = Unidad;
    }

    public double getNota() {
        return Nota;
    }

    public void setNota(double Nota) {
        this.Nota = Nota;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }
    
}
