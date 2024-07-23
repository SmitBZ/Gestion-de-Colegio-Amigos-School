package Clases;

import com.mysql.cj.jdbc.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class LogicaUsuario {
    private final Conexion mysql = new Conexion();
    private final Connection cn = mysql.conectar();
    private String quer;
    
    /**
     * Autentica un usuario en el sistema.
     * 
     * @param us Objeto CUsuario que contiene el nombre de usuario y la contraseña.
     * @return Objeto CUsuario con el nombre completo si la autenticación es exitosa, null en caso contrario.
     */
    public CUsuario Autenticar(CUsuario us) {
        String quer = "CALL AutenticarUsuario(?, ?, ?);";
        try {
            CallableStatement cst = (CallableStatement) cn.prepareCall(quer);
            cst.setString(1, us.getUser());
            cst.setString(2, us.getClave());
            cst.registerOutParameter(3, java.sql.Types.VARCHAR);
            
            cst.execute();
            String nombreCompleto = cst.getString(3);
            
            if (nombreCompleto != null) {
                us.setNombre(nombreCompleto);
                return us;
            } else {
                return null;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
}
