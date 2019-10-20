/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfazGrafica;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;

/**
 *
 * @author Mati
 */
public class mainWindowController implements Initializable{
    @FXML
    public Label myLabel;
    
    @FXML
    public ComboBox<String> tipo; //se crea una variable llamada combobox
    public ComboBox<String> marca;
    public ComboBox<String> modelo;
    public ComboBox<String> anoMin;
    public ComboBox<String> anoMax;
    public ComboBox<String> precioMin;
    public ComboBox<String> precioMax;
    public ComboBox<String> combustible;
    public ComboBox<String> transmicion;
    
    
    
    
    
    ObservableList<String> listTipo = FXCollections.observableArrayList("Sedan","Comercial","Camioneta","Hatchback","Van","Suv","Cabriolet","Motor Home","Motos","Cuadrimoto"); 
    //ObservableList<String> listMarca = FXCollections.observableArrayList(new IntentoCOMBOBO().getArrayList());
    ObservableList<String> listMarca = FXCollections.observableArrayList("Suzuki","CHEVROLET");
    ObservableList<String> listModelo = FXCollections.observableArrayList("P16","UNO","CX5"); 
    ObservableList<String> listAnoMin = FXCollections.observableArrayList("$250.000","$500.000","$1.000.000"); 
    ObservableList<String> listAnoMax = FXCollections.observableArrayList("$250.000","$500.000","$1.000.000"); 
    ObservableList<String> listPrecioMin = FXCollections.observableArrayList("$250.000","$500.000","$1.000.000"); 
    ObservableList<String> listPrecioMax = FXCollections.observableArrayList("$250.000","$500.000","$1.000.000"); 
    ObservableList<String> listCombustible = FXCollections.observableArrayList("DIESEL","ELECTRICO"); 
    ObservableList<String> listTransmicion = FXCollections.observableArrayList("MECANICO","AUTOMATICO"); 
    
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        tipo.setItems(listTipo);
        //marca.setItems(listMarca);
        modelo.setItems(listModelo);
        anoMin.setItems(listAnoMin);
        anoMax.setItems(listAnoMax);
        precioMin.setItems(listPrecioMin);
        precioMax.setItems(listPrecioMax);
        
        
        
        combustible.setItems(listCombustible);
        transmicion.setItems(listTransmicion);
        
        
        
        
    }    
    
    public void comboChanged(ActionEvent event){
        //myLabel.setText(combobox.getValue());  esto cambia el label por el mismo valor del combobox
        //marca.Items.Clear();
        marca.getItems().clear();
        marca.getItems().addAll("NISSAN","MAZDA","SUZUKI");
    }    
}
