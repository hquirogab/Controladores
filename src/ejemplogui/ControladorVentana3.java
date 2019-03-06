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
class ControladorVentana3 {
    private Ventana3 ventana3;
    private Modelo modelo;

    public ControladorVentana3(Modelo modelo) {
        this.ventana3 = new Ventana3();
        this.modelo = modelo;
        
        this.ventana3.getReturnWindow1().setOnAction(new ReturnButton1());
        this.ventana3.getReturnWindow2().setOnAction(new ReturnButton2());
    }
    
    public void mostrarVista() {
        Singleton singleton = Singleton.getSingleton();
        this.ventana3.mostrar(singleton.getStage());
    }
    
    class ReturnButton1 implements EventHandler<ActionEvent> {

        @Override
        public void handle(ActionEvent event) {
            System.out.println("Pressed return to 1");
            ControladorVentana1 controlador = new ControladorVentana1(modelo);
            controlador.mostrarVista();
        }
        
    }
    
    class ReturnButton2 implements EventHandler<ActionEvent> {

        @Override
        public void handle(ActionEvent event) {
            System.out.println("Pressed return to 2");
            ControladorVentana2 controlador = new ControladorVentana2(modelo);
            controlador.mostrarVista();
        }
        
    }
}
