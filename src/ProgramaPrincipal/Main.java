
package ProgramaPrincipal;
import static Archivo.ArchivoPacientes.*;

public class Main {
    public static void main(String[] args){
        CrearArchivo("archivo\\InformacionPacientes.txt");
        EscribirArchivo("archivo\\InformacionPacientes.txt","hola");
        System.out.println("HolaDios");
        //Vamos a realizr una modificación en el codigo
        System.out.println("Lo cambie por ser racista"); //Nueva modificacion;
        System.out.println("Hola de nuevo");//no es un cambio nuevo
        System.out.println("Cambio por Jesus");//el era el racista
        System.out.println("Hola que tal");
    }
}
