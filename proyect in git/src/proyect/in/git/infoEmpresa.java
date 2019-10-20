
package proyect.in.git;

import Login.ListaDeUsuarios;
import Automoviles.ListaAutos;
import java.io.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Lalo
 */
public class infoEmpresa {
    private ListaAutos listaAutos;
    private final ListaDeUsuarios listaUsuarios;

    public infoEmpresa(/*ListaAutos listaAutos, ListaDeUsuarios listaUsuarios*/) {
        this.listaAutos = null/*listaAutos*/;
        this.listaUsuarios = null/*listaUsuarios*/;
    }
    
    public void buscarAutos(){//se encarga ListaAutos
        
    }
    public void crearUsuario(String name,String pw,boolean admin){//se encarga Usuario
        //this.listaUsuarios.agregarUsuario(name,pw,admin);
    }
    public void eliminarUsuario(){//se encarga ListaDeUsuarios
        
    }
    public void agregarAutoAListaFavDelUsuario(){//se encarga ListaFavoritos
        
    }
    public void quitarAutoDeListaFavDelUsuario(){//se encarga ListaFavoritos
        
    }
    public void crearAuto(){//se encarga Auto
    }
    public void modificarAuto(){//se encarga Auto
    }
    
    public void cargarDatos(){
        
        try {
            this.listaAutos.cargarDatos();
        } catch (IOException ex) {
            Logger.getLogger(infoEmpresa.class.getName()).log(Level.SEVERE, null, ex);
        }

    }    


    public boolean validador(String f){
        return true;
    }
    
    public void mostrarPorMarca(String clave){
    
        this.listaAutos.mostrarPorMarca(clave);
    
    }
}
