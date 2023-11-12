


package Medicos;

import InterfazGrafica.ExamenCardiologo;
import InterfazGrafica.ExamenOftalmologo;
import InterfazGrafica.ResultCardiologia;
import InterfazGrafica.RegistroPaciente;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Medicos.Cardiologo;

public class ControlCardiologo implements ActionListener {
    
    
    private ExamenOftalmologo ventanaF;
    private ResultCardiologia ventanaCard;
    private Cardiologo card;

    @Override
    public void actionPerformed(ActionEvent e) { 
 
        ExamenCardiologo excard = new ExamenCardiologo();
        card.setPresionSistolica(Integer.parseInt(excard.Sistolica.getText()));
        card.setPresionDiastolica(Integer.parseInt(excard.Diastolica.getText()));
        card.setFrecuenciaCardiaca(Integer.parseInt(excard.BPM.getText()));
        card.setNivelTroponina(Double.parseDouble(excard.Troponina.getText()));
        ventanaCard.CajaTextoCard.setText(card.MostrarResultados());
    }
    
    public ControlCardiologo(ExamenOftalmologo ventana, Cardiologo cardiologo){
        this.ventanaF = ventana;
        this.card = cardiologo;
        this.ventanaF.Resultados.addActionListener(this);
    }
    
    
      
}

