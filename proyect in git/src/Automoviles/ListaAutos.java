
package Automoviles;

import java.io.*;
import java.util.*;

/**
 *
 * @author lalo
 */

public class ListaAutos {
    private ArrayList<Auto> listaAuto;
    
    private HashMap<String,ArrayList<Auto>> mapMarca;
    private HashMap<String,ArrayList<Auto>> mapTipo;
    private HashMap<String,ArrayList<Auto>> mapModelo;
    private SortedMap<String,ArrayList<Auto>> sortedMapYear;
    private SortedMap<String,ArrayList<Auto>> sortedMapPrecioPatente;
    private SortedMap<String,ArrayList<Auto>> sortedMapTasacion;

    public ListaAutos() {
        this.listaAuto = new ArrayList();
        this.mapMarca = new HashMap<>();
        this.mapTipo = new HashMap<>();
        this.mapModelo = new HashMap<>();
        this.sortedMapYear =  new TreeMap<>();
        this.sortedMapPrecioPatente = new TreeMap<>();
        this.sortedMapTasacion = new TreeMap<>();
    }

    public ArrayList<Auto> getListaAuto() {
        return listaAuto;
    }

    public HashMap<String, ArrayList<Auto>> getMapMarca() {
        return mapMarca;
    }

    public HashMap<String, ArrayList<Auto>> getMapTipo() {
        return mapTipo;
    }

    public HashMap<String, ArrayList<Auto>> getMapModelo() {
        return mapModelo;
    }

    public SortedMap<String, ArrayList<Auto>> getSortedMapYear() {
        return sortedMapYear;
    }

    public SortedMap<String, ArrayList<Auto>> getSortedMapPrecioPatente() {
        return sortedMapPrecioPatente;
    }

    public SortedMap<String, ArrayList<Auto>> getSortedMapTasacion() {
        return sortedMapTasacion;
    }

    public void setListaAuto(ArrayList<Auto> listaAuto) {
        this.listaAuto = listaAuto;
    }

    public void setMapMarca(HashMap<String, ArrayList<Auto>> mapMarca) {
        this.mapMarca = mapMarca;
    }

    public void setMapTipo(HashMap<String, ArrayList<Auto>> mapTipo) {
        this.mapTipo = mapTipo;
    }

    public void setMapModelo(HashMap<String, ArrayList<Auto>> mapModelo) {
        this.mapModelo = mapModelo;
    }

    public void setSortedMapYear(SortedMap<String, ArrayList<Auto>> sortedMapYear) {
        this.sortedMapYear = sortedMapYear;
    }

    public void setSortedMapPrecioPatente(SortedMap<String, ArrayList<Auto>> sortedMapPrecioPatente) {
        this.sortedMapPrecioPatente = sortedMapPrecioPatente;
    }

    public void setSortedMapTasacion(SortedMap<String, ArrayList<Auto>> sortedMapTasacion) {
        this.sortedMapTasacion = sortedMapTasacion;
    }
    
    public void quitarAuto(String marca,String modelo,String year,String version){
        for(Auto it : listaAuto){
            
        }
    }
    
    
    public void mostrarPorMarca(String clave){
    
        ArrayList deMarca = this.mapMarca.get(clave);
        for(int i = 0; i<deMarca.size();i++){
            Auto pos = (Auto)deMarca.get(i);
            System.out.println((i+1)+".-"+pos.getMarca());
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
                //System.out.println(auto.getCodigoUnico());
                auto.setYear(lineaArchivo.split(";")[1]);
                //System.out.println(auto.getYear());
                auto.setType(lineaArchivo.split(";")[2]);
                //System.out.println(auto.getType());
                auto.setMarca(lineaArchivo.split(";")[3]);
               // System.out.println(auto.getMarca());
                auto.setModelo(lineaArchivo.split(";")[4]);
               // System.out.println(auto.getModelo());
                auto.setVersion(lineaArchivo.split(";")[5]);
               // System.out.println(auto.getVersion());
                auto.setPuertas(lineaArchivo.split(";")[6]);
               // System.out.println(auto.getPuertas());
                auto.setCombustible(lineaArchivo.split(";")[7]);
                ///System.out.println(auto.getCombustible());
                auto.setTransmision(lineaArchivo.split(";")[8]);
              //  System.out.println(auto.getTransmision());
                auto.setTasacionFiscal(lineaArchivo.split(";")[9]);
               // System.out.println(auto.getTasacionFiscal());
                auto.setPrecioPatente(lineaArchivo.split(";")[10]);
               // System.out.println(auto.getPrecioPatente());
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
                
                //Year
                if(sortedMapYear.getOrDefault(auto.getYear(), null)==null){
                    ArrayList nueva = new ArrayList();
                    nueva.add(auto);
                    sortedMapYear.putIfAbsent(auto.getYear(), nueva);
                }else{
                    ArrayList posicion = (ArrayList)sortedMapYear.get(auto.getYear());
                    posicion.add(auto);
                }
                
                //precio patente
                if(sortedMapPrecioPatente.getOrDefault(auto.getPrecioPatente(), null)==null){
                    ArrayList nueva = new ArrayList();
                    nueva.add(auto);
                    sortedMapPrecioPatente.putIfAbsent(auto.getPrecioPatente(), nueva);
                }else{
                    ArrayList posicion = (ArrayList)sortedMapPrecioPatente.get(auto.getPrecioPatente());
                    posicion.add(auto);
                }       
                
                //precio tasacion fiscal
                if((sortedMapTasacion.getOrDefault(auto.getPrecioPatente(), null))==null){
                    ArrayList nueva = new ArrayList();
                    nueva.add(auto);
                    sortedMapTasacion.putIfAbsent(auto.getTasacionFiscal(), nueva);
                
                }else{
                    ArrayList posicion = (ArrayList)sortedMapTasacion.get(auto.getTasacionFiscal());
                    posicion.add(auto);
                }
        }
        }catch(FileNotFoundException e){
            System.out.println("te echaste el ramo");
        }
        
    }
}
