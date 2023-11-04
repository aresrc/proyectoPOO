
package Medicos;


public class Oftalmologo extends Medico{

    public Oftalmologo(String nombre, String sexo, int edad, int DNI, int CMP, int experiencia, String gradoFormacion) {
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
    
    private int agudezaVisual;
    private int presionOcular;
    private double indiceRefraccion;
    private double estereopsis;

    // Método para que el usuario ingrese la agudeza visual
    public void ingresarAgudezaVisual(int resultado) {
        this.agudezaVisual = resultado;
    }

    // Método para que el usuario ingrese la medición de presión ocular
    public void ingresarPresionOcular(int resultado) {
        this.presionOcular = resultado;
    }

    // Método para que el usuario ingrese el cálculo del índice de refracción
    public void ingresarIndiceRefraccion(double resultado) {
        this.indiceRefraccion = resultado;
    }

    // Método para que el usuario ingrese el resultado de la prueba de estereopsis
    public void ingresarPruebaEstereopsis(double resultado) {
        this.estereopsis = resultado;
    }
    
    // Método para mostrar los resultados del análisis de salud oftalmológica con evaluación
public String mostrarResultado() {
    String mensaje, mensajeT="";
    
    /*
    System.out.println("Resultados del análisis oftalmológico:");
    System.out.println("Agudeza Visual: " + agudezaVisual + "/20");
    System.out.println("Presión Ocular: " + presionOcular + " mmHg");
    System.out.println("Índice de Refracción: " + indiceRefraccion);
    System.out.println("Visión Estereoscópica: " + estereopsis + " segundos de arco");

    */
    
    mensaje = "Agudeza visual";
    if (agudezaVisual >= 20) {
        mensaje = mensaje + ("Agudeza visual de "+agudezaVisual+", visión normal");
    } else {
        mensaje = mensaje + ("Su agudeza visual de"+agudezaVisual+" está por debajo de lo normal.");
        mensaje = mensaje + ("Se recomeinda evaluación más detallada y posible corrección con gafas o lentes de contacto");
    }
    mensaje = mensaje + ("\n\n\n");
    mensajeT = mensajeT + mensaje;
    mensaje = ""; 
    
    
    mensaje = ("\nPresión ocular\n");
    if (presionOcular <= 20) {
        mensaje = mensaje + ("Su presión ocular de "+presionOcular+" es normal.");
    } else {
        mensaje = mensaje + ("Su presión ocular de "+presionOcular+" está por encima de lo normal.");
        mensaje = mensaje + ("Esta presión elevada puede ser un signo de glaucoma");
    }
    mensaje = mensaje + ("\n\n\n");
    mensajeT = mensajeT + mensaje;
    mensaje = ""; 
    
    mensaje = "Índice de Refracción";
    if (indiceRefraccion >= 1.0 && indiceRefraccion <= 1.5) {
        mensaje = mensaje + ("El índice de refracción de "+indiceRefraccion+" es normal.");
    } else {
        mensaje = mensaje + ("El índice de refracción de "+indiceRefraccion+"  está fuera del rango normal.");
        mensaje = mensaje + ("Puede ser signo de miopía, hipermetropía o el astigmatismo");
    }
    mensaje = mensaje + ("\n\n\n");
    mensajeT = mensajeT + mensaje;
    mensaje = "";
    
    mensaje = ("\nVisión estereoscópica\n");
    if (estereopsis < 100) {
        mensaje = mensaje + ("Su visión estereoscópica de "+estereopsis+" es normal.");
    } else {
        mensaje = mensaje + ("Su visión estereoscópica de "+estereopsis+" es deficiente.");
        mensaje = mensaje + ("Se recomeinda evaluación más detallada y puede requerir terapia visual u otros tratamientos");
    }
    mensaje = mensaje + ("\n\n\n");
    mensajeT = mensajeT + mensaje;
    mensaje = ""; 
    
    return mensajeT;
}
   
}
