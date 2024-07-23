package Clases;

import java.io.InputStream;
import java.sql.Connection;

public class CUsuario {
  int idUsuario;
  String User;
  String Nombre;
  String Apellido;
  String Clave;
  InputStream img;
  String ruta;
  
  private final Conexion mysql=new Conexion();
  private final Connection cn=mysql.conectar();

    public CUsuario() {
    }

    public CUsuario(int idUsuario, String User, String Nombre, String Apellido, String Clave, InputStream img, String ruta) {
        this.idUsuario = idUsuario;
        this.User = User;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Clave = Clave;
        this.img = img;
        this.ruta = ruta;
    }
    
    public CUsuario(String User, String Clave) {
        this.User = User;
        this.Clave = Clave;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getUser() {
        return User;
    }

    public void setUser(String User) {
        this.User = User;
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

    public String getClave() {
        return Clave;
    }

    public void setClave(String Clave) {
        this.Clave = Clave;
    }

    public InputStream getImg() {
        return img;
    }

    public void setImg(InputStream img) {
        this.img = img;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }
}
