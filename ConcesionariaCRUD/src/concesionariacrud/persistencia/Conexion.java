
package concesionariacrud.persistencia;

import java.sql.*;
import javax.swing.JOptionPane;


public class Conexion {
    
    private static final String URL = "jdbc:mariadb://localhost/";
    private static final String DB = "concesionariapepito";
    private static final String USUARIO = "root";
    private static final String PASS = "";
    private static Connection connection;
    
    private Conexion() {
        
    }
    
    public static Connection getConnection (){
        if (connection==null){
            try {
                Class.forName("org.mariadb.jdbc.Driver");
                connection=DriverManager.getConnection(URL+DB+"?useLegacyDatetimeCode=false&serverTimezone=UTC"+"&user="+USUARIO+"&password="+PASS);
            } catch (ClassNotFoundException ex) {
                JOptionPane.showMessageDialog(null, "Error al cargar los drivers " + ex.getMessage());
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null,"Error al conectarse a la DB " + ex.getMessage());
            }    
        }
        return connection;
    }
    
    
}
