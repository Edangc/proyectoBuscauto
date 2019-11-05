
package proyect.in.git;

import Automoviles.Auto;
import Login.ListaDeUsuarios;
import Automoviles.ListaAutos;
import java.io.*;

/**
 *
 * @author Lalo
 */
public class infoEmpresa {
    private final ListaAutos listaAutos;
    private final ListaDeUsuarios listaUsuarios;
    

    public infoEmpresa() {
        this.listaAutos = new ListaAutos();
        this.listaUsuarios = new ListaDeUsuarios();
    }
    public void buscarAutos(){//se encarga ListaAutos
        
    }
    public boolean crearUsuario(String name,String pw,boolean admin){//se encarga Usuario
        return this.listaUsuarios.crearUsuario(name,pw,admin);
    }
    public boolean eliminarUsuario(String name){//se encarga ListaDeUsuarios 
        return this.listaUsuarios.eliminarUsuario(name);
    }
    public boolean agregarAutoAListaFavDelUsuario(String user, Auto auto){//se encarga ListaFavoritos
        return this.listaUsuarios.agregarAutoAListaFavDelUsuario(user, auto);
    }
           
    public void quitarAutoDeListaFavDelUsuario(){//se encarga ListaFavoritos
        
    }
    public void crearAuto(){//se encarga Auto
    }
    public void modificarAuto(){//se encarga Auto
    }
    
    public void cargarDatos() throws IOException{
        listaAutos.cargarDatos();
    }    

    public boolean validador(String f){
        return true;
    }
    
    public void mostrarPorMarca(String clave){
    
        this.listaAutos.mostrarPorMarca(clave);
    
    }
}
