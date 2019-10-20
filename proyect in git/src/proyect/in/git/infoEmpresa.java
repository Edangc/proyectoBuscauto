
package proyect.in.git;

import Login.ListaDeUsuarios;
import Automoviles.ListaAutos;
import java.io.*;
import java.util.*;

/**
 *
 * @author Lalo
 */
public class infoEmpresa {
    private final ListaAutos listaAutos;
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
        
    }    
    public boolean validador(String f){
        return true;
    }
}
