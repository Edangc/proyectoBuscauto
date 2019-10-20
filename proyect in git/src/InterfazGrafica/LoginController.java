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
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import proyect.in.git.*;

/**
 *
 * @author Mati
 */
public class LoginController {
    @FXML
    private TextField loginUserName;
    @FXML
    private TextField loginPassword;
    @FXML
    private TextField registroUserName;
    @FXML
    private TextField registroPassword1;
    @FXML
    private TextField registroPassword2;
    @FXML
    private Label registroStatus;
    @FXML
    private Label inicioSesionStatus;
    //@FXML
    //private Button Confirmar;
    
    public void IniciarSesion(ActionEvent event) throws IOException{
        if (loginUserName.getText().equals("user") && loginPassword.getText().equals("pass")){
            Stage stage = new Stage();
            ((Node)event.getSource()).getScene().getWindow().hide();
            Parent root = FXMLLoader.load(getClass().getResource("mainWindow.fxml"));
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
            //new Owo().setInicioSesionStatus(true);
        }else if(loginUserName.getText().equals("admin") && loginPassword.getText().equals("pass")){
            Stage stage = new Stage();
            ((Node)event.getSource()).getScene().getWindow().hide();
            Parent root = FXMLLoader.load(getClass().getResource("VentanaAdmin.fxml"));
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
            //new Owo().setInicioSesionStatus(true);
        }else{
            inicioSesionStatus.setText("Nombre de usuario o contraseña incorrecto");
        }
    }
    
    public void Registro(ActionEvent event) throws IOException{
        Stage stage = new Stage();
        ((Node)event.getSource()).getScene().getWindow().hide();
        Parent root = FXMLLoader.load(getClass().getResource("VentanaRegistro.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        while(true){
            if (new proyect.in.git.infoEmpresa().validador(registroUserName.getText())){
                registroStatus.setText("Usuario ya registrado");
            }else{
                registroStatus.setText("");
            }
        }
    }
    
    public void ConfirmarRegistro(ActionEvent event) throws IOException{
        if (!registroPassword1.getText().equals("") && registroPassword1.getText().equals(registroPassword2.getText())){
            registroStatus.setText("Registro completado");
            new proyect.in.git.infoEmpresa().crearUsuario(registroUserName.getText(),registroPassword1.getText(),false);
            //new Owo().setRegistroStatus(true);
            ((Node)event.getSource()).getScene().getWindow().hide();
            Stage stage = new Stage();
            Parent root = FXMLLoader.load(getClass().getResource("Ventana Sign In.fxml"));
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }else{
            registroStatus.setText("Contraseñas no coinciden");
            //new Owo().setRegistroStatus(true);
        }
    }
}
