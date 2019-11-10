
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
    
    public boolean agregarAutoAListaFavDelUsuario(Auto auto){
        int i = 0;
        while(this.listaFavoritos.get(i)!=null){
            if(this.esIgual(listaFavoritos.get(i), auto)){
                return false;
            }
            i++;
        }
        return this.listaFavoritos.add(auto);
    }
    
    public boolean quitarAutoDeListaFavDelUsuario(Auto auto){
        int i = 0;
        while(this.listaFavoritos.get(i)!=null){
            if(this.esIgual(listaFavoritos.get(i), auto)){
                return this.listaFavoritos.remove(listaFavoritos.get(i));
            }
            i++;
        }
        return false;
    }
    
    public boolean esIgual(Auto auto1, Auto auto2){
        if(auto1.getMarca().equals(auto2.getModelo())){
            if(auto1.getModelo().equals(auto2.getModelo())){
                if(auto1.getVersion().equals(auto2.getVersion())){
                    if(auto1.getCombustible().equals(auto2.getCombustible())){
                        if(auto1.getTransmision().equals(auto2.getTransmision())){
                            return true;
                        }
                    }
                }
            }
        }
        return false;
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
