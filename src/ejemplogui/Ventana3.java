/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplogui;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author hquiroga
 */
public class Ventana3 {
    private Scene scene;
    private Button returnWindow1;
    private Button returnWindow2;
    private MenuBar menubar;
    private StackPane layout;
    private HBox hbox;
    private Menu menu1;
    private MenuItem menuItem11;

    public Ventana3() {
        this.returnWindow1 = new Button("Volver a 1");
        this.returnWindow2 = new Button("Volver a 2");
        
        
        this.menu1.getItems().add(menuItem11);
        this.menubar.getMenus().add(menu1);
        
        this.hbox = new HBox();
        this.hbox.setSpacing(10);
        this.hbox.setPadding(new Insets(25, 25, 25, 25));
        this.hbox.setAlignment(Pos.CENTER);
        this.hbox.getChildren().add(returnWindow1);
        this.hbox.getChildren().add(returnWindow2);
        
        this.layout = new StackPane();
        this.layout.getChildren().add(menubar);
        this.layout.getChildren().add(hbox);
        
        this.scene = new Scene(layout);
    }

    public Scene getScene() {
        return scene;
    }

    public Button getReturnWindow1() {
        return returnWindow1;
    }

    public Button getReturnWindow2() {
        return returnWindow2;
    }

    public HBox getHbox() {
        return hbox;
    }

    public MenuBar getMenubar() {
        return menubar;
    }

    public StackPane getLayout() {
        return layout;
    }

    

    void mostrar(Stage stage) {
        stage.setTitle("Ventana 3");
        stage.setScene(scene);
        stage.show();
    }
    
    
}
