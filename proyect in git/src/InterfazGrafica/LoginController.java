/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfazGrafica;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 *
 * @author Mati
 */
public class LoginController {
    @FXML
    private TextField loginUserName;
    @FXML
    private TextField loginPassword;
    
    public void Login(ActionEvent event) throws IOException{
        if (loginUserName.getText().equals("user") && loginPassword.getText().equals("pass")){
            Stage stage = new Stage();
            Parent root = FXMLLoader.load(getClass().getResource("Ventana1.fxml"));
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }
    }
    
    public void Registro(ActionEvent event){
        
    }
}
