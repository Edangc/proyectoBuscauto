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
    private ArrayList<Auto> FavList;

    public Usuario(boolean admin, String name, String password, ArrayList<Auto> FavList) {
        this.admin = admin;
        this.name = name;
        this.password = password;
        this.FavList = FavList;
    }


    
    
    public void agregarAutoAFavoritos(){
            
    }
    
    public void eliminarAutoDeFavoritos(){
        
    }
    
    
    
}
