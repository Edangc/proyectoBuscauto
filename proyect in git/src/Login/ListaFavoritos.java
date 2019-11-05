
package Login;

import Automoviles.Auto;
import java.util.ArrayList;

/**
 *
 * @author Lalo
 */
public class ListaFavoritos {
    private String nameUser;
    private ArrayList<Auto> listaFavoritos;

    public ListaFavoritos(String nameUser, ArrayList<Auto> listaFavoritos) {
        this.nameUser = nameUser;
        this.listaFavoritos = listaFavoritos;
    }

    public String getNameUser() {
        return nameUser;
    }

    public ArrayList<Auto> getListaFavoritos() {
        return listaFavoritos;
    }

    public void setNameUser(String nameUser) {
        this.nameUser = nameUser;
    }

    public void setListaFavoritos(ArrayList<Auto> listaFavoritos) {
        this.listaFavoritos = listaFavoritos;
    }
    
    /*public boolean quitarDeFavoritos(String nombreAuto){
        
    }*/
    
    public boolean agregarAutoAListaFavDelUsuario(){
    
    }
    
   /* public boolean verificador(String anualidadAuto, String marcaAuto, String versionAuto){

        if(this.listaFavoritos. == null) return false;
        return true;
    
    }*/
    
    /*public boolean buscador(String nombreAuto){
        
        for(Auto pos : this.listaFavoritos){
            if(pos.getMarca())
        }
        return false;
    }
    */
    
    
}
