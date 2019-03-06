/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplogui;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;

/**
 *
 * @author hquiroga
 */
public class ControladorVentana1 {
    private Ventana1 ventana1;
    private Modelo modelo;
    
    public ControladorVentana1(Modelo modelo) {
        this.modelo = modelo;
        this.ventana1 = new Ventana1();
        
        this.ventana1.getButton().setOnAction(new EventoBoton());
    }

    public void mostrarVista() {
        Singleton singleton = Singleton.getSingleton();
        this.ventana1.mostrar(singleton.getStage());
    }
    
    class EventoBoton implements EventHandler<ActionEvent> {
        @Override
        public void handle(ActionEvent event) {
            System.out.println("Pressed next! (1)");
            ControladorVentana2 controladorVentana2 = new ControladorVentana2(modelo);
            controladorVentana2.mostrarVista();
        }     
    }
    
    class EventoFieldText implements EventHandler<ActionEvent> {

        @Override
        public void handle(ActionEvent event) {
            
        }
        
    }
}
