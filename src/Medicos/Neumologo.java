package Medicos;

import java.util.Scanner;

public class Neumologo extends Medico{
    
    public Neumologo(String nombre, String sexo, int edad, int DNI, int CMP, int experiencia, String gradoFormacion) {
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
    
    private int VolumenRespiratorio;
    private int CapacidadVital;
    private int NivelO2;
    private int NivelCO2;
    private int SaturacionO2;
    
        public void PruebaEspirometria() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Volumen espiratorio forzado en un segundo(%): ");
        VolumenRespiratorio = scanner.nextInt();
        System.out.print("Capacidad vital forzada(%) : ");
        CapacidadVital = scanner.nextInt();
    }

    public void PruebaGasometria() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nivel de oxígeno arterial(mm Hg): ");
        NivelO2 = scanner.nextInt();
        System.out.print("Nivel de dioxido de carbono arterial(mm Hg): ");
        NivelCO2 = scanner.nextInt();
    }

    public void PruebaOximetria() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Saturación de oxígeno en sangre arterial(%): ");
        SaturacionO2 = scanner.nextInt(); 
    }
    
    
    public String MostrarResultadosN() {
        String mensaje = null, mensajeT = "";
        //Capacidad de los pulmones
        mensaje = ("Capacidad pulmonar y el flujo de aire");
        if(VolumenRespiratorio>80 && CapacidadVital>80){
            mensaje = mensaje + ("\nEl volumen espiratorio forzado en un segundo es "+VolumenRespiratorio+"% y la Capacidad vital forzada es "+CapacidadVital+" son signos de estados normales");
        }else if(VolumenRespiratorio>80 && CapacidadVital>65 && CapacidadVital<79){
            mensaje = mensaje + ("\nEl volumen espiratorio forzado en un segundo es "+VolumenRespiratorio+"% y la Capacidad vital forzada es "+CapacidadVital+" son signos de enfermedad respiratoria restrictiva de grado leve");
        }else if(VolumenRespiratorio>80 && CapacidadVital>50 && CapacidadVital<64){
            mensaje = mensaje + ("\nEl volumen espiratorio forzado en un segundo es "+VolumenRespiratorio+"% y la Capacidad vital forzada es "+CapacidadVital+" son signos de enfermedad respiratoria restrictiva de grado moderado");
            mensaje = mensaje + ("\nSe recomienda...");
        }else if(VolumenRespiratorio>80 && CapacidadVital>=35 && CapacidadVital<49){
            mensaje = mensaje + ("\nEl volumen espiratorio forzado en un segundo es "+VolumenRespiratorio+"% y la Capacidad vital forzada es "+CapacidadVital+" son signos de enfermedad respiratoria restrictiva de grado grave");
            mensaje = mensaje + ("\nSe recomienda...");
        }else if(VolumenRespiratorio>80 && CapacidadVital<35){
            mensaje = mensaje + ("\nEl volumen espiratorio forzado en un segundo es "+VolumenRespiratorio+"% y la Capacidad vital forzada es "+CapacidadVital+" son signos de enfermedad respiratoria restrictiva de grado muy grave");
            mensaje = mensaje + ("\nSe recomienda...");
        }
        else if(CapacidadVital>80 && VolumenRespiratorio>65 && VolumenRespiratorio<79){
            mensaje = mensaje + ("\nEl volumen espiratorio forzado en un segundo es "+VolumenRespiratorio+"% y la Capacidad vital forzada es "+CapacidadVital+" son signos de enfermedad respiratoria obstructiva de grado leve");
        }else if(CapacidadVital>80 && VolumenRespiratorio>50 && VolumenRespiratorio<64){
            mensaje = mensaje + ("\nEl volumen espiratorio forzado en un segundo es "+VolumenRespiratorio+"% y la Capacidad vital forzada es "+CapacidadVital+" son signos de enfermedad respiratoria obstructiva de grado moderado");
            mensaje = mensaje + ("\nSe recomienda...");
        }else if(CapacidadVital>80 && VolumenRespiratorio>=35 && VolumenRespiratorio<49){
            mensaje = mensaje + ("\nEl volumen espiratorio forzado en un segundo es "+VolumenRespiratorio+"% y la Capacidad vital forzada es "+CapacidadVital+" son signos de enfermedad respiratoria obstructiva de grado grave");
            mensaje = mensaje + ("\nSe recomienda...");
        }else if(CapacidadVital>80 && VolumenRespiratorio<35){
            mensaje = mensaje + ("\nEl volumen espiratorio forzado en un segundo es "+VolumenRespiratorio+"% y la Capacidad vital forzada es "+CapacidadVital+" son signos de enfermedad respiratoria obstructiva de grado muy grave");
            mensaje = mensaje + ("\nSe recomienda...");
        }//puede presntar las dos posibles enfermedades
        
        mensaje = mensaje + ("\n\n\n");
        mensajeT = mensajeT + mensaje;
        mensaje = "";       
            
        //Mide la oxigenación que pasa por la sangre
        mensaje = ("\nPresión Arterial\n");
        if (NivelO2 <= 100 && NivelO2 >=80 && NivelCO2 <= 45 && NivelCO2 >=35) {
            mensaje = mensaje + ("Presión de oxígeno es"+ NivelO2 + "mmHg y dioxido de carbono es "+ NivelCO2 +"mmHg en la sangre arterial representa signos normales\n");
        } else if (NivelO2 <= 79 && NivelO2 >=60 && NivelCO2 <= 45 && NivelCO2 >=35) {
            mensaje = mensaje + ("Presión de oxígeno es"+ NivelO2 + "mmHg y dioxido de carbono es "+ NivelCO2 +"mmHg en la sangre arterial representa hipoxemia leve\n");
            mensaje = mensaje + ("Se recomienda...");
        }else if(NivelO2 <= 59 && NivelO2 >=40 && NivelCO2 <= 45 && NivelCO2 >=35){
            mensaje = mensaje + ("Presión de oxígeno es"+ NivelO2 + "mmHg y dioxido de carbono es "+ NivelCO2 +"mmHg en la sangre arterial representa hipoxemia moderada\n");
            mensaje = mensaje + (" Se recomienda...");
        }else if(NivelO2 <= 40 && NivelCO2 <= 45 && NivelCO2 >=35){
            mensaje = mensaje + ("Presión de oxígeno es"+ NivelO2 + "mmHg y dioxido de carbono es "+ NivelCO2 +"mmHg en la sangre arterial representa hipoxemia intensa\n");
            mensaje = mensaje + (" Se recomienda...");
        }
        else if (NivelO2 <= 100 && NivelO2 >=80 &&  NivelCO2 <=35) {
            mensaje = mensaje + ("Presión de oxígeno es"+ NivelO2 + "mmHg y dioxido de carbono es "+ NivelCO2 +"mmHg en la sangre arterial representa alcalosis respiratoria\n");
            mensaje = mensaje + ("Se recomienda...");
        }else if(NivelO2 <= 100 && NivelO2 >=80 && NivelCO2 >= 45){
            mensaje = mensaje + ("Presión de oxígeno es"+ NivelO2 + "mmHg y dioxido de carbono es "+ NivelCO2 +"mmHg en la sangre arterial representa acidosis respiratoria\n");
            mensaje = mensaje + (" Se recomienda...");
        }
        mensaje = mensaje + ("\n\n\n");
        mensajeT = mensajeT + mensaje;
        mensaje = "";
        //Porcentaje de sangre oxigenada
        mensaje = ("\nPorcentaje de hemoglobina saturada en oxigeno\n");
        if (SaturacionO2 >= 95 && SaturacionO2 <= 100) {
        mensaje = mensaje + (SaturacionO2 + " %, estan dentro del rango normal.");
        }else if (SaturacionO2 <= 90){
        mensaje = mensaje + (SaturacionO2 + " %, esta por debajo del rango normal, son signos de hipoxemia");
        mensaje = mensaje + ("\nSe recomienda...");
        }
        mensajeT = mensajeT + mensaje;
        return mensajeT;
    }
}
