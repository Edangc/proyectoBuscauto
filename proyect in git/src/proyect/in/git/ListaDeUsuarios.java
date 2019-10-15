
package proyect.in.git;

import java.util.ArrayList;

/**
 *
 * @author lalo
 */
public class ListaDeUsuarios {
    private ArrayList<Usuario> listaUsuarios;

    public ListaDeUsuarios(ArrayList<Usuario> listaUsuarios) {
        this.listaUsuarios = listaUsuarios;
    }
    
    public void agregarUsuario(String name, String pw, boolean admin){//se encarga Usuario
        for(Usuario user : listaUsuarios){
            if( user.getName().equals(name) == true ){
            return;
            }
        }
        Usuario newUser = new Usuario(admin,name,pw);       
        this.listaUsuarios.add(newUser);
    }
    public void eliminarUsuario(String name){//se encarga Usuario
        this.listaUsuarios.remove(buscarUsuario(name));
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
        Usuario usuario = new Usuario();
        for(Usuario user : this.listaUsuarios){
            if(user.getName().equals(name)){
                return user;
            }
        }
        return null;
    }
    
    public Usuario buscarUsuario(String name, String password){
        Usuario usuario = new Usuario();
        for(Usuario user : this.listaUsuarios){
            if(user.getName().equals(name) && user.getName().equals(password)){
                return user;
            }
        }
        return null;
    }
    
    public ArrayList<Auto> buscarListaFavoritosDeUsuario(){
        return null;
    }
    
    
    
}
