/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfazGrafica;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 *
 * @author Lalo
 */
public class FXMLDocumentController {
    
    @FXML
    private Label label;
    
    @FXML
    private TextField txtUserName;
    
    @FXML
    private TextField txtPassword;
    
    public void login(ActionEvent event) throws Exception{ // throws Exception se agrega para que funcione la linea Parent root = ...
        if (txtUserName.getText().equals("user") && txtPassword.getText().equals("pass")){
            label.setText("Login Success");
            Stage stage = new Stage();
            Parent root = FXMLLoader.load(getClass().getResource("mainWindow.fxml"));
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
            
        }
        else{
            label.setText("Login Failed");
        }
    }
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }
    
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
