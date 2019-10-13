package proyect.in.git;

import java.io.*;
import java.util.*;

/**
 *
 * @author lalo
 */
public class Empresa {
    private final ListaDeUsuarios listaDeUsuarios;
    private final ListaConcesionarios listaConcesionarios;
    private ListaAutos listaAutos;

    public Empresa(ListaDeUsuarios listaDeUsuarios, ListaConcesionarios listaConcesionarios, ListaAutos listaAutos) {
        this.listaDeUsuarios = listaDeUsuarios;
        this.listaConcesionarios = listaConcesionarios;
        this.listaAutos = listaAutos;
    }
    
    
    public void eliminarUsuario(){
        
    }
    
    public void eliminarConcesionario(){
        
    }
    
    public void eliminarAuto(){
        
    }
    
    
    public void cargarDatos() throws IOException{
    
        String linea;
        File archivo = new File("basededatos.csv");
        try{
            
            BufferedReader lectorArchivo = new BufferedReader(new FileReader(archivo));
            while((linea = lectorArchivo.readLine())!=null){
            
                Auto autoParaGuardar = new Auto();
                autoParaGuardar.setYear(Integer.parseInt(linea.split(";")[0]));
                autoParaGuardar.setType(linea.split(";")[1]);
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
            }
            
        }catch(FileNotFoundException e){
        
        }
        
    }
    
}
