
package concesionariacrud.logica;

import concesionariacrud.persistencia.ControlPersistencia;



public class ControlLogica {
    
    ControlPersistencia controlP = new ControlPersistencia();
    
    public void agregarAutomovil(String modelo, String marca, String motor, String color, String patente, int cantPuertas) {
        Automovil auto = new Automovil();//(modelo,marca,motor,color,patente,cantPuertas); 
        //si lo paso por parametros modelo solo me lo tomo ma es un numero por que? no se
        // ya descubri lo que estaba mal, fue mi culpara equisde
        auto.setModelo(modelo);
        auto.setMarca(marca);
        auto.setMotor(motor);
        auto.setColor(color);
        auto.setPatente(patente);
        auto.setCantPuertas(cantPuertas);
        controlP.agregarAutomovil(auto);
        
    }
    
}
