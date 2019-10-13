
package proyect.in.git;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeMap;

/**
 *
 * @author lalo
 */

public class ListaAutos {
    private ArrayList<Auto> listaAuto;
    
    private HashMap<String,Auto> mapMarca;
    private HashMap<String,Auto> mapTipo;
    private HashMap<String,Auto> mapModelo;
    private HashMap<String,Auto> mapCodigoUnico;
    private TreeMap<String,Auto> treeMapYear;
    private TreeMap<String,Auto> treeMapPrecioPatente;
    private TreeMap<String,Auto> treeMapPrecioVehiculo;
}
