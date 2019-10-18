
package Login;

import Automoviles.Auto;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author lalo
 */
public class ListaDeUsuarios {
    private HashMap<String,Usuario> mapaUsuarios;
    
    public boolean validador(String nameUser){ //si el nombre de usuario ya existe retorna true
    Usuario usuario = (Usuario) mapaUsuarios.get(nameUser);
    if(usuario == null){
        return false;
    }
    else{
        return true;
    }
    }    
    public boolean agregarUsuario(String name, String pw, boolean admin){//si se agrega con exito retorna true
        if (validador(name)) return false;
        
        return true;
    }
    public void eliminarUsuario(String name){//se encarga Usuario
    }

    public ListaDeUsuarios() {
    }
    
    public void agregarAutoAListaFavDelUsuario(){ //se encarga ListaFavoritos
        
    }
    public void quitarAutoDeListaFavDelUsuario(){ //se encarga ListaFavoritos
        
    }
    /**
     * 
     * @param name
     * @return user
     */
    public Usuario buscarUsuario(String name){
        return null;
        
    }

    
    public ArrayList<Auto> buscarListaFavoritosDeUsuario(){
        return null;
    }
    
    
    
}
