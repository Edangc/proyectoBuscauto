
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
                ArrayList<Auto> lista = new ArrayList();
                
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
                if(mapMarca.get(auto.getMarca()) != null){
                    
                }else{
                    ArrayList listMarca = new ArrayList();
                    listMarca.add(auto);
                }
                mapMarca.put(auto.getMarca(), auto);
                mapTipo.put(auto.getType(), auto);
                mapModelo.put(auto.getModelo(), auto);
                mapCodigoUnico.put(auto.getCodigoUnico(), auto);
                treeMapYear.put(auto.getYear(), auto);
                treeMapPrecioPatente.put((int)auto.getPrecioPatente(), auto);
                treeMapTasacion.put((auto.getTasacionFiscal(), auto);
        }
        
        }catch(FileNotFoundException e){
            System.out.println("te echaste el ramo");
        }
        
    }
}
