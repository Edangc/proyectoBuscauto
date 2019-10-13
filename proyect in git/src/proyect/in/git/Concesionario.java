
package proyect.in.git;

/**
 *
 * @author lalo
 */
public class Concesionario {
    
    private String name;
    private ListaAutos listaAutos;

    public Concesionario(String name, ListaAutos listaAutos) {
        this.name = name;
        this.listaAutos = listaAutos;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ListaAutos getListaAutos() {
        return listaAutos;
    }

    public void setListaAutos(ListaAutos listaAutos) {
        this.listaAutos = listaAutos;
    }
    
    
}
