
package proyect.in.git;

import Automoviles.Auto;
import Login.ListaDeUsuarios;
import Automoviles.ListaAutos;
import Login.Usuario;
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
    /**
     * Creates a new user and saves it in the database.
     * 
     * @param name the name introduced by the user
     * @param pw    the password to protect the user data
     * @param admin boolean that indicates if the user is admin or not
     * @return True if the user was created succesfully or False if not
     */
    public boolean crearUsuario(String name,String pw,boolean admin){//se encarga Usuario
        return this.listaUsuarios.crearUsuario(name,pw,admin);
    }
    /**
     * Search for the user that is going to be eliminated, using the name as a parameter
     * 
     * @param name the parameter used to search for the user
     * @return True if the user was eliminated succesfully or False if not
     */
    
    public boolean eliminarUsuario(String name){//se encarga ListaDeUsuarios 
        return this.listaUsuarios.eliminarUsuario(name);
    }
    
    /**
     * 
     * Add the vehicle to the favourite list of the actual user
     * 
     * @param user the active account to add the list
     * @param auto the corresponding vehicle that is going to be added to the list
     * @return True if the vehicle was added to the list succesfully or False if it wasn't
     */
    public boolean agregarAutoAListaFavDelUsuario(Usuario user, Auto auto){//se encarga ListaFavoritos
        return this.listaUsuarios.agregarAutoAListaFavDelUsuario(user, auto);
    }
           
    public boolean quitarAutoDeListaFavDelUsuario(Usuario user, Auto auto){//se encarga ListaFavoritos
        return this.listaUsuarios.quitarAutoDeListaFavDelUsuario(user, auto);
    }
    public void crearAuto(String marca,String modelo,String year,String combustible,String transmision,String precioP,String precioV){//se encarga Auto

        
        
    }
    public void modificarAuto(){//se encarga Auto
    }
    
    public void cargarDatos() throws IOException{
        listaAutos.cargarDatos();
    }    
    
    public void mostrarPorMarca(String clave){
    
        this.listaAutos.mostrarPorMarca(clave);
    
    }
}
