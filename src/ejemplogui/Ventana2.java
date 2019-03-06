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
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author hquiroga
 */
public class Ventana2 {
    private Scene scene;
    private Label name;
    private TextField nameInput;
    private Label address;
    private TextField addressInput;
    private Button button;
    private GridPane layout;
    
    
    public Ventana2() {
        this.layout = new GridPane();
        this.layout.setHgap(20);
        this.layout.setVgap(20);
        this.layout.setPadding(new Insets(25, 25, 25, 25));
        this.layout.setAlignment(Pos.CENTER);
        
        this.name = new Label("Name");
        this.nameInput = new TextField();
        this.address = new Label("Address");
        this.addressInput = new TextField();
        this.button = new Button("Next");
        this.button.setMaxWidth(200);
        
        this.layout.add(name, 0, 0);
        this.layout.add(nameInput, 1, 0);
        this.layout.add(address, 0, 1);
        this.layout.add(addressInput, 1, 1);
        this.layout.add(button, 1, 2);
        
        this.scene = new Scene(layout);
    }

    public Scene getScene() {
        return scene;
    }

    public void setScene(Scene scene) {
        this.scene = scene;
    }

    public Label getName() {
        return name;
    }

    public void setName(Label name) {
        this.name = name;
    }

    public TextField getNameInput() {
        return nameInput;
    }

    public void setNameInput(TextField nameInput) {
        this.nameInput = nameInput;
    }

    public Label getAddress() {
        return address;
    }

    public void setAddress(Label address) {
        this.address = address;
    }

    public TextField getAddressInput() {
        return addressInput;
    }

    public void setAddressInput(TextField addressInput) {
        this.addressInput = addressInput;
    }

    public Button getButton() {
        return button;
    }

    public void setButton(Button button) {
        this.button = button;
    }

    public GridPane getLayout() {
        return layout;
    }

    public void setLayout(GridPane layout) {
        this.layout = layout;
    }
    
    public void mostrar(Stage stage) {
        stage.setTitle("Ventana 2");
        stage.setScene(scene);
        stage.show();
    }
    
}
