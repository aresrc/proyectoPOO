


package Medicos;

import InterfazGrafica.Resultados;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ControlCardiologo implements ActionListener {
    
    
    private Resultados ventanaR;
    private Cardiologo card;

    @Override
    public void actionPerformed(ActionEvent e) { 
        ventanaR.CajaTexto.setText(card.MostrarResultados());
    }
    
    public ControlCardiologo(Resultados ventana, Cardiologo cardiologo){
        this.ventanaR = ventana;
        this.card = cardiologo;
        this.ventanaR.Resultados.addActionListener(this);
    }
    
}