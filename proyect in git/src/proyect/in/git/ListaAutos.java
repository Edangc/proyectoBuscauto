
package proyect.in.git;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeMap;

/**
 *
 * @author lalo
 */

public class ListaAutos {
    private ArrayList<Auto> listaAuto;
    
    private HashMap<String,Auto> mapMarca;
    private HashMap<String,Auto> mapTipo;
    private HashMap<String,Auto> mapModelo;
    private HashMap<String,Auto> mapCodigoUnico;
    private TreeMap<String,Auto> treeMapYear;
    private TreeMap<String,Auto> treeMapPrecioPatente;
    private TreeMap<String,Auto> treeMapPrecioVehiculo;
    

    public void agregarAuto(){
        
    }
    
    public void cargarDatos(){
        //push arrayList & mapas
        BufferedReader bufferedLectura = null;
        try{
        bufferedLectura = new BufferedReader(new FileReader("basededatos.csv")); 
        
        String linea = bufferedLectura.readLine();
        
        while(linea != null){
            String[] campos = linea.split(";");
            
            linea = bufferedLectura.readLine();
        }
        
        }catch(IOException ex){
            System.out.println("Error: Archivo no encontrado");
        }
        
        
    }
}
