
package Login;

import Automoviles.Auto;
import java.io.*;
import java.util.*;

//hola

/**
 *
 * @author lalo
 */
public class ListaDeUsuarios {
    private HashMap<String,Usuario> mapaUsuarios;
    
        public ListaDeUsuarios() {
    }
    
    public boolean validadorExistenciaUsuario(String nameUser){ //si el nombre de usuario ya existe retorna true
    Usuario usuario = (Usuario) mapaUsuarios.get(nameUser);
        if(usuario == null){
            return false;
        }
        return true;
    }
    
    public boolean crearUsuario(String name, String pw, boolean admin){//si se agrega con exito retorna true
        if (this.validadorExistenciaUsuario(name)) return false;
        Usuario nuevo = new Usuario(admin,name,pw);
        this.mapaUsuarios.putIfAbsent(name, nuevo);
        return true;
    }
    public boolean eliminarUsuario(String name){//se encarga Usuario
        Usuario verificador = (Usuario) this.buscarUsuario(name);
        if(verificador == null) return false;
        this.mapaUsuarios.remove(name);
        return true;        
    }


    public boolean agregarAutoAListaFavDelUsuario(Usuario user , Auto auto){ //se encarga ListaFavoritos
        Usuario usuarioEncontado = this.mapaUsuarios.get(user.getName());
        if(usuarioEncontado != null){
            return usuarioEncontado.agregarAutoAListaFavDelUsuario(auto);
        }
        return false;
    }
    public boolean quitarAutoDeListaFavDelUsuario(Usuario usuario, Auto auto){ //se encarga ListaFavoritos
        Usuario usuarioEncontado = this.buscarUsuario(usuario.getName());
        if(usuarioEncontado == null) return false;
        return usuarioEncontado.quitarAutoDeListaFavDelUsuario(auto);
        
    }
    /**
     * 
     * @param name
     * @return user
     */
    public Usuario buscarUsuario(String name){
        return this.mapaUsuarios.get(name);
    }

    
    public ArrayList<Auto> buscarListaFavoritosDeUsuario(String nombreUsuario){
        return this.buscarUsuario(nombreUsuario).getListaFavoritos();
    }
    
    public boolean verificarUsuario(String nameUser,String passwordUser) throws IOException{
        try{
            File archivo = new File("src\\Login\\usuarios.csv");
            BufferedReader bufferedLectura = new BufferedReader(new FileReader(archivo));            
            while(bufferedLectura.readLine() != null){
            
            }
            
            return true;
        }catch(FileNotFoundException e){
            return false;
        }
    }
    
    
}
