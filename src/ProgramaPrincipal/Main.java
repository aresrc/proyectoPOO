
package ProgramaPrincipal;
import static Archivo.ArchivoPacientes.*;

public class Main {
    public static void main(String[] args){
        CrearArchivo("archivo\\InformacionPacientes.txt");
        EscribirArchivo("archivo\\InformacionPacientes.txt","hola");
        System.out.println("HolaMundo");
        //Vamos a realizr una modificación en el codigo
        System.out.println("Lo cambie por ser racista") //Nueva modificacion;
    }
    
    
    
}
