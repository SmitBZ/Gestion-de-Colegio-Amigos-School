package Clases;

import java.time.LocalDate;

/**
 *
 * @author Smit
 */

public class CPension {
    private int idPension;
    private int idMatricula;
    private LocalDate Fecha;
    private double Monto;
    private String Cuota;
    private String Estado;
    
    public CPension() {
    }

    public CPension(int idPension, int idMatricula, LocalDate Fecha, double Monto, String Cuota, String Estado) {
        this.idPension = idPension;
        this.idMatricula = idMatricula;
        this.Fecha = Fecha;
        this.Monto = Monto;
        this.Cuota = Cuota;
        this.Estado = Estado;
    }

    public int getIdPension() {
        return idPension;
    }

    public void setIdPension(int idPension) {
        this.idPension = idPension;
    }

    public int getIdMatricula() {
        return idMatricula;
    }

    public void setIdMatricula(int idMatricula) {
        this.idMatricula = idMatricula;
    }

    public LocalDate getFecha() {
        return Fecha;
    }

    public void setFecha(LocalDate Fecha) {
        this.Fecha = Fecha;
    }

    public double getMonto() {
        return Monto;
    }

    public void setMonto(double Monto) {
        this.Monto = Monto;
    }

    public String getCuota() {
        return Cuota;
    }

    public void setCuota(String Cuota) {
        this.Cuota = Cuota;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }


}
