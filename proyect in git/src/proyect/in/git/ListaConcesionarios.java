
package proyect.in.git;

import java.util.*;

/**
 *
 * @author lalo
 */
public class ListaConcesionarios {
    private ArrayList<Concesionario> listaConcesionarios;
    
    
    public void deleteListaConcesionario(){
    
        this.listaConcesionarios.clear();
    
    }
    
    public void deleteConcesionario(String concesionario){
    
        int i;
        
        for(i=0;listaConcesionarios.get(i)!=null;i++){
        
            Concesionario posicion = (Concesionario) listaConcesionarios.get(i);
            if(posicion.getName().equals(concesionario)){
                listaConcesionarios.remove(i);
                break;
            }
        }
    }
}
    

