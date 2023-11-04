
package Medicos;

import ClasePadre.Persona;


public class Medico extends Persona {
    
    protected int CMP;
    protected int experiencia;
    protected String gradoFormacion;

    public Medico(String nombre, String sexo, int edad, int DNI, int CMP, int experiencia, String gradoFormacion) {
        super(nombre, sexo, edad, DNI);
        this.CMP = CMP;
        this.experiencia = experiencia;
        this.gradoFormacion = gradoFormacion;
    }
    
    
    
    
    

    @Override
    public void Labor() {
        
    }
    
    


    
    
    
}
