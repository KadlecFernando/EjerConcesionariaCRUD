
package concesionariacrud;

import concesionariacrud.logica.Automovil;
import concesionariacrud.persistencia.AutomovilData;
import concesionariacrud.vistas.Principal;


public class ConcesionariaCRUD {

   
    public static void main(String[] args) {
        
       // Principal princ = new Principal();
       // princ.setVisible(true);
       // princ.setLocationRelativeTo(null);
        
        Automovil auto = new Automovil("Fiesta", "ford", "tremendo", "blanco", "lll 343", 4);
        
        AutomovilData ad= new AutomovilData();
        
        ad.guardarAutomovil(auto);
        
        
    }
    
}
