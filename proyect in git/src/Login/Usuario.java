/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login;

import Automoviles.Auto;
import Login.ListaFavoritos;
import java.util.ArrayList;

/**
 *
 * @author lalo
 */
public class Usuario {
    private boolean admin;
    private String name;
    private String password;
    private ListaFavoritos listaFavoritos;

    public Usuario(boolean admin, String name, String password, ListaFavoritos listaFavoritos) {
        this.admin = admin;
        this.name = name;
        this.password = password;
        this.listaFavoritos = listaFavoritos;
    }
    public Usuario(boolean admin, String name, String password) {
        this.admin = admin;
        this.name = name;
        this.password = password;
    }

    public Usuario() {
    }

    public boolean isAdmin() {
        return admin;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    /**
     * @since 1.0
     * 
    */
    public void eliminarUsuario(){
        this.admin = false;
        this.listaFavoritos = null;
        this.name = null;
        this.password = null;
    }
    
    public boolean quitarAutoDeListaFavDelUsuario(Auto auto){
        return this.listaFavoritos.eliminarAutoDeFavoritos(auto);
    }   
    
    public boolean agregarAutoAListaFavDelUsuario(Auto auto){
        return this.listaFavoritos.agregarAutoAListaFavDelUsuario(auto);
    }
        
    public ArrayList<Auto> getListaFavoritos() {
        return this.listaFavoritos.getListaFavoritos();
    }
    

}
