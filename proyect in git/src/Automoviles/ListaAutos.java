
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
    
    private final HashMap<String,ArrayList<Auto>> mapMarca = new HashMap();
    private final HashMap<String,ArrayList<Auto>> mapTipo = new HashMap();
    private final HashMap<String,ArrayList<Auto>> mapModelo = new HashMap();
    private final HashMap<String,ArrayList<Auto>> mapCodigoUnico = new HashMap();
    private final TreeMap<String,ArrayList<Auto>> treeMapYear = new TreeMap();
    private final TreeMap<String,ArrayList<Auto>> treeMapPrecioPatente= new TreeMap();
    private final TreeMap<String,ArrayList<Auto>> treeMapTasacion = new TreeMap();
    

    public void agregarAuto(){
        
    }
    public void quitarAuto(String marca,String modelo,String year,String version){
        for(Auto it : listaAuto){
            
        }
    }
    
    public void cargarDatos() throws IOException{
        //push arrayList & mapas
        String lineaArchivo;
        try{
            File archivo = new File("src\\Automoviles\\basededatos.csv");
            BufferedReader bufferedLectura = new BufferedReader(new FileReader(archivo));
            while((lineaArchivo = bufferedLectura.readLine()) != null){
                Auto auto = new Auto();
                
                auto.setCodigoUnico(lineaArchivo.split(";")[0]);
                auto.setYear(lineaArchivo.split(";")[1]);
                auto.setType(lineaArchivo.split(";")[2]);
                auto.setMarca(lineaArchivo.split(";")[3]);
                auto.setModelo(lineaArchivo.split(";")[4]);
                auto.setVersion(lineaArchivo.split(";")[5]);
                auto.setPuertas((lineaArchivo.split(";")[6]));
                auto.setCombustible(lineaArchivo.split(";")[7]);
                auto.setTransmision(lineaArchivo.split(";")[8]);
                auto.setPrecioPatente(lineaArchivo.split(";")[9]);
                auto.setTasacionFiscal(lineaArchivo.split(";")[10]);
                
                //Marca
                if(mapMarca.getOrDefault(auto.getMarca(), null)==null){
                    ArrayList nueva = new ArrayList();
                    nueva.add(auto);
                    mapMarca.putIfAbsent(auto.getMarca(), nueva);
                }else{
                    ArrayList posicion = (ArrayList)mapMarca.get(auto.getMarca());
                    posicion.add(auto);
                }
                
                //Modelo
                if(mapModelo.getOrDefault(auto.getModelo(), null)==null){
                    ArrayList nueva = new ArrayList();
                    nueva.add(auto);
                    mapModelo.putIfAbsent(auto.getModelo(), nueva);
                }else{
                    ArrayList posicion = (ArrayList)mapModelo.get(auto.getModelo());
                    posicion.add(auto);
                }
                
                //Tipo
                if(mapTipo.getOrDefault(auto.getType(), null)==null){
                    ArrayList nueva = new ArrayList();
                    nueva.add(auto);
                    mapTipo.putIfAbsent(auto.getType(), nueva);
                }else{
                    ArrayList posicion = (ArrayList)mapTipo.get(auto.getType());
                    posicion.add(auto);
                }
                
                //Codigo unico
                if(mapCodigoUnico.getOrDefault(auto.getCodigoUnico(), null)==null){
                    ArrayList nueva = new ArrayList();
                    nueva.add(auto);
                    mapCodigoUnico.putIfAbsent(auto.getCodigoUnico(), nueva);
                }else{
                    ArrayList posicion = (ArrayList)mapCodigoUnico.get(auto.getCodigoUnico());
                    posicion.add(auto);
                }
        }
        }catch(FileNotFoundException e){
            System.out.println("te echaste el ramo");
        }
        
    }
}
