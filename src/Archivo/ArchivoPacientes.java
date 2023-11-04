
package Archivo;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ArchivoPacientes {
    
    public static void CrearArchivo(String nombreArchivo){
        File archivo = new File(nombreArchivo);
        
        try {
            PrintWriter salida = new PrintWriter(archivo);
            salida.close();
            System.out.println("Archivo creado");
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        }
    }
    
    public static void EscribirArchivo(String nombreArchivo, String mensaje){
        File archivo = new File(nombreArchivo);
        
        try {
            PrintWriter salida = new PrintWriter(new FileWriter(archivo, true));
            salida.println(mensaje);
            salida.close();
            System.out.println("Información guardada");
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
    }
    
    public static void LeerArchivo(String nombreArchivo){
        File archivo = new File(nombreArchivo);
        
        try {
            BufferedReader entrada = new BufferedReader(new FileReader(archivo));
            String lectura = entrada.readLine();
            while(lectura!=null){
                System.out.println(lectura);
                lectura = entrada.readLine();
            }
            entrada.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
    }
    
    public static void EliminarArchivo(String nombreArchivo){
        File archivo = new File(nombreArchivo);
        System.out.println(archivo.exists());
        archivo.delete();
        System.out.println("Archivo eliminado");
    }
    
}
