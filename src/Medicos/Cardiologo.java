


package Medicos;

import java.util.Scanner;

public class Cardiologo extends Medico{

    public Cardiologo(String nombre, String sexo, int edad, int DNI, int CMP, int experiencia, String gradoFormacion) {
        super(nombre, sexo, edad, DNI, CMP, experiencia, gradoFormacion);
    }

    public int getCMP() {
        return CMP;
    }

    public void setCMP(int CMP) {
        this.CMP = CMP;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    public String getGradoFormacion() {
        return gradoFormacion;
    }

    public void setGradoFormacion(String gradoFormacion) {
        this.gradoFormacion = gradoFormacion;
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
    
    public void MostrarDatosPersonales() {
        System.out.println("Cardiólogo: " + getNombre());
        System.out.println("Edad: " + getEdad() + " años");
        System.out.println("CMP: " + getCMP());
        System.out.println("Experiencia: " + getExperiencia() + " años");
        System.out.println("Grado de Formación: " + getGradoFormacion());
    }
   
    int presionSistolica, presionDiastolica, frecuenciaCardiaca;
    double nivelTroponina;
    
    public void MedirPresionArterial() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Presión arterial sistólica: ");
        presionSistolica = scanner.nextInt();
        System.out.print("Presión arterial diastólica: ");
        presionDiastolica = scanner.nextInt();
    }

    public void PruebaDeEsfuerzo() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Frecuencia cardíaca: ");
        frecuenciaCardiaca = scanner.nextInt(); // Frecuencia cardíaca máxima entre 140 y 200 bpm
    }

    public void NivelTroponina() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nivel de troponina: ");
        nivelTroponina = scanner.nextDouble(); // Nivel de troponina entre 0.01 y 0.1 ng/mL
    }
    
    public String MostrarResultados() {
        String mensaje = null, mensajeT = "";
        mensaje = ("Presión Arterial");
        if(presionSistolica<=90 && presionDiastolica<=60){
            mensaje = mensaje + ("\nPresión Sistólica "+presionSistolica+" y presión diastólica "+presionDiastolica+" son signos de hipotensión");
            mensaje = mensaje + "\nSe recomienda...";  
        }else if(presionSistolica<=120 && presionDiastolica<=80){
            mensaje = mensaje + ("\nLos valores obtenidos en la presión sistólica "+presionSistolica+" y presión diastólica "+presionDiastolica+" son signos normales");
        }else if(presionSistolica>=121 && presionSistolica<=139 && presionDiastolica>=80 && presionDiastolica<=89){
            mensaje = mensaje + ("\nLos valores obtenidos en la presión sistólica "+presionSistolica+" y presión diastólica "+presionDiastolica+" son signos de Prehipertensión");
            mensaje = mensaje + ("\nSe recomienda...");
        }else if(presionSistolica>=140 && presionSistolica<=159 && presionDiastolica>=90 && presionDiastolica<=99){
            mensaje = mensaje + ("\nLos valores obtenidos en la presión sistólica "+presionSistolica+" y presión diastólica "+presionDiastolica+" son signos de Hipertensión en la primera etapa");
            mensaje = mensaje + ("\nSe recomienda...");
        }else if(presionSistolica>=160 && presionDiastolica>=100){
            mensaje = mensaje + ("\nLos valores obtenidos en la presión sistólica "+presionSistolica+" y presión diastólica "+presionDiastolica+" son signos de Hipertensión en la segunda etapa");
            mensaje = mensaje + ("\nSe recomienda...");
        } 
        mensaje = mensaje + ("\n\n\n");
        mensajeT = mensajeT + mensaje;
        mensaje = "";       
            
        //latidos del corazon bpm laditos x minuto
        mensaje = ("\nFrecuencia Cardíaca\n");
        if (frecuenciaCardiaca <= 100 && frecuenciaCardiaca >=60) {
            mensaje = mensaje + (frecuenciaCardiaca + " bpm indican niveles normales\n");
        } else if (frecuenciaCardiaca > 100) {
            mensaje = mensaje + (frecuenciaCardiaca + " bpm en un nivel elevado. Esto podría indicar una taquicardia\n");
            mensaje = mensaje + ("Se recomienda...");
        }
        else if(frecuenciaCardiaca<60){
            mensaje = mensaje + (frecuenciaCardiaca + " \n bpm indica presencia de bradicardia");
            mensaje = mensaje + (" Se recomienda...");
        }
        mensaje = mensaje + ("\n\n\n");
        mensajeT = mensajeT + mensaje;
        mensaje = "";
        //se suele usar para diagnosticar un ataque al corazón
        mensaje = ("\nNivel de Troponina\n");
        if (nivelTroponina <= 0.04) {
        mensaje = mensaje + (nivelTroponina + " ng/mL, estan dentro del rango normal.");
        }else{
        mensaje = mensaje + (nivelTroponina + " ng/mL, por encima del rango normal, son signos de problemas cardiacos");
        mensaje = mensaje + ("\nSe recomienda...");
        }
        mensajeT = mensajeT + mensaje;
        return mensajeT;
    }
   
}
