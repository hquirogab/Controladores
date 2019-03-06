/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplogui;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author hquiroga
 */
public class Main extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        //Registrar el stage en el singleton
        
        Singleton singleton = Singleton.getSingleton();
        singleton.setStage(primaryStage);
        
        //Modelo en memoria
        Modelo modelo = new Modelo();
        
        //Invocar el controlador de la vista
        ControladorVentana1 controladorVentana1 = new ControladorVentana1(modelo);
        
        controladorVentana1.mostrarVista();
    }
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
