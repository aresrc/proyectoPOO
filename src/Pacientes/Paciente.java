
package Pacientes;

import ClasePadre.Persona;


public class Paciente extends Persona{
    private double peso;
    private double altura;
    private String gruposanguineo;
    private String alergia;
    
    public Paciente() {
        
    }
    
    public Paciente(String nombre, String sexo, int edad, int DNI, double peso, double altura, String gruposanguineo, String alergia) {
        super(nombre, sexo, edad, DNI);
        this.peso = peso;
        this.altura = altura;
        this.gruposanguineo = gruposanguineo;
        this.alergia = alergia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String getGruposanguineo() {
        return gruposanguineo;
    }

    public void setGruposanguineo(String gruposanguineo) {
        this.gruposanguineo = gruposanguineo;
    }

    public String getAlergia() {
        return alergia;
    }

    public void setAlergia(String alergia) {
        this.alergia = alergia;
    }
       
    @Override
    public void Labor() {
        
    }
    
}
