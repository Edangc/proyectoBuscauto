
package proyect.in.git;

import javafx.application.Application;
import Login.ListaDeUsuarios;
import java.io.*;
import java.util.*;
import Automoviles.*;
import InterfazGrafica.*;

/**
 *
 * @author lalo
 */
public class main{
    
    public static void main(String[] args) throws IOException {
       /* infoEmpresa BuscAuto = new infoEmpresa();
        BuscAuto.cargarDatos();*/
        
        ListaAutos listaAuto = new ListaAutos();
        listaAuto.cargarDatos();
        ListaDeUsuarios oli = new ListaDeUsuarios();
        InterfazGrafica.Owo.main(args);
    }
}
