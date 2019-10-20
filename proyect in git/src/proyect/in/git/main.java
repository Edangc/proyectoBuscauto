
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
        ListaDeUsuarios oli = new ListaDeUsuarios();
        new Automoviles.ListaAutos().cargarDatos();
        InterfazGrafica.Owo.main(args);
    }
}
