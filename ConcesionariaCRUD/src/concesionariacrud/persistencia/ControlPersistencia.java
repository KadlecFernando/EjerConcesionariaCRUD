
package concesionariacrud.persistencia;

import concesionariacrud.logica.Automovil;


public class ControlPersistencia {
    
    AutomovilData ad = new AutomovilData();

    public void agregarAutomovil(Automovil auto) {
        ad.guardarAutomovil(auto);
    }
    
    
    
}
