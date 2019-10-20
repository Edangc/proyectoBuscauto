
package Automoviles;

import Automoviles.Auto;
import java.io.*;
import java.util.*;

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
    public void quitarAuto(String marca,String modelo,String year,String version){
        for(Auto it : listaAuto){
            
        }
    }
    
    public void cargarDatos() throws IOException{
        //push arrayList & mapas
        String lineaArchivo;
        int i = 1;
        try{
            File archivo = new File("src\\Automoviles\\basededatos.csv");
            BufferedReader bufferedLectura = new BufferedReader(new FileReader(archivo));
            while((lineaArchivo = bufferedLectura.readLine()) != null){
                Auto auto = new Auto();
                auto.setCodigoUnico(lineaArchivo.split(";")[0]);
                auto.setYear(Integer.parseInt(lineaArchivo.split(";")[1]));
                auto.setType(lineaArchivo.split(";")[2]);
                auto.setMarca(lineaArchivo.split(";")[3]);
                auto.setModelo(lineaArchivo.split(";")[4]);
                auto.setVersion(lineaArchivo.split(";")[5]);
                auto.setPuertas(Integer.parseInt(lineaArchivo.split(";")[6]));
                auto.setCombustible(lineaArchivo.split(";")[7]);
                auto.setTransmision(lineaArchivo.split(";")[8]);
                auto.setPrecioPatente(Integer.parseInt(lineaArchivo.split(";")[9]));
                auto.setTasacionFiscal(Integer.parseInt(lineaArchivo.split(";")[10]));
                //System.out.println(i+".-"+auto.getMarca()+" "+auto.getModelo()+" "+auto.getYear());
                i++;
        }
        
        }catch(FileNotFoundException e){
            System.out.println("te echaste el ramo");
        }
        
    }
}
