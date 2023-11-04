
package ClasePadre;


public abstract class Persona {
    protected String nombre;
    protected String sexo;
    protected int edad;
    protected int DNI;

    public Persona(String nombre, String sexo, int edad, int DNI) {
        this.nombre = nombre;
        this.sexo = sexo;
        this.edad = edad;
        this.DNI = DNI;
    }
    
    public abstract void Labor();
}
