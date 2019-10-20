
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
        ListaAutos wena = new ListaAutos();
        wena.cargarDatos();
        ListaDeUsuarios oli = new ListaDeUsuarios();
        InterfazGrafica.Owo.main(args);
    }
}
