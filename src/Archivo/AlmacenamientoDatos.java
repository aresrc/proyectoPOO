package Archivo;

import java.io.*;
import java.util.List;

public class AlmacenamientoDatos<T> {
    private String nombreArchivo;

    
    public AlmacenamientoDatos(String nombreArchivo) {
        this.nombreArchivo = "src\\Archivo\\"+nombreArchivo;
    }

    public void guardar(List<T> datos) {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(nombreArchivo))) {
            outputStream.writeObject(datos);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<T> cargar() {
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(nombreArchivo))) {
            return (List<T>) inputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }
}   
