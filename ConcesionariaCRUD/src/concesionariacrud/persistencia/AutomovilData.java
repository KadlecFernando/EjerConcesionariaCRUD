
package concesionariacrud.persistencia;

import concesionariacrud.logica.Automovil;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class AutomovilData {
    
    private Connection con=null;

    public AutomovilData() {
        
        con=Conexion.getConnection();
        
    }
    
    public void guardarAutomovil(Automovil automovil){
        
        String sql= "INSERT INTO automovil (modelo,marca,motor,color,patente,cantidadPuertas) VALUES (?,?,?,?,?,?)";
        try {
            PreparedStatement ps= con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, automovil.getModelo());
            ps.setString(2, automovil.getMarca());
            ps.setString(3, automovil.getMotor());
            ps.setString(4, automovil.getColor());
            ps.setString(5, automovil.getPatente());
            ps.setInt(6, automovil.getCantPuertas());
            ps.executeUpdate();
            ResultSet rs=ps.getGeneratedKeys();
            if(rs.next()){
                automovil.setIdAutomovil(1);
                 JOptionPane.showMessageDialog(null,"Automovil agregado con exito");
                 System.out.println(automovil.toString());
            }
            
            ps.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(AutomovilData.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    
    
    
}
