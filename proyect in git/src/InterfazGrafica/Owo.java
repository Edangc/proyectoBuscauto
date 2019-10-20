/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfazGrafica;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Lalo
 */
public class Owo extends Application {

    //private boolean inicioSesionStatus;
    //private boolean registroStatus;
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("Ventana Sign In.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        /*while(true){
            while(true){
                if (registroStatus){
                    break;
                }
            }
            if (inicioSesionStatus){
                break;
            }
        }*/
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
    /*void setInicioSesionStatus(boolean f){
        this.inicioSesionStatus=f;
    }
    void setRegistroStatus(boolean f){
        this.registroStatus=f;
    }*/
    
}
