
package ProgramaPrincipal;
import static Archivo.ArchivoPacientes.*;
import InterfazGrafica.ExamenOftalmologo;
import InterfazGrafica.Login;
import InterfazGrafica.ResultadosMedicos;
import Medicos.Cardiologo;
import Medicos.ControlCardiologo;
import Pacientes.Paciente;

public class Main {
    public static void main(String[] args){
        Paciente paciente = new Paciente();
        Login log = new Login();
        log.setVisible(true);
        
        ExamenOftalmologo res = new ExamenOftalmologo();
        Cardiologo card = new Cardiologo();
        ControlCardiologo control = new ControlCardiologo(res, card);
        res.setVisible(true);
        
       /*
        VentanaResultados ventanaR = new VentanaResultados();
        Cardiologo card = new Cardiologo();
        ControlCardiologo control = new ControlCardiologo(ventanaR, card);
        ventanaR.setVisible(true);*/
    }
}
