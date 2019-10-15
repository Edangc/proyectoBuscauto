/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyect.in.git;

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
    
    public void crearUsuario(){       
    }
    public void eliminarUsuario(){
    }
    public void eliminarAutoDeFavoritos(){
    }   
    public ArrayList<Auto> miListaFavoritos(){
        return null;
    }
    
    
}
