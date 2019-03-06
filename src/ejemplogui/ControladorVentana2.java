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
public class ControladorVentana2 {
    private Ventana2 ventana2;
    private Modelo modelo;
    
    public ControladorVentana2(Modelo modelo) {
        this.modelo = modelo;
        this.ventana2 = new Ventana2();
        
        this.ventana2.getButton().setOnAction(new EventoBoton());
    }
    
    public void mostrarVista() {
        Singleton singleton = Singleton.getSingleton();
        this.ventana2.mostrar(singleton.getStage());
    }
    
    class EventoBoton implements EventHandler<ActionEvent> {

        @Override
        public void handle(ActionEvent event) {
            System.out.println("Pressed next (2)");
            ControladorVentana3 controlador = new ControladorVentana3(modelo);
            controlador.mostrarVista();
        } 
    }
}
