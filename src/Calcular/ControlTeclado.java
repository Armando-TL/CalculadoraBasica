package Calcular;
// @author amdtr

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class ControlTeclado implements KeyListener{
    
    private JPanel controller;
    private JLabel texto;
    public ControlTeclado(JPanel control){
        this.controller = control;
        this.controller.addKeyListener(this);
        this.controller.setFocusable(true);
    }
    
    public void field(JLabel txt1){
        this.texto = txt1;
    }
    

    @Override
    public void keyTyped(KeyEvent e) {
        
           // Solo con tocar funciona sin teclas como Alt o Ctrl   
                
    }

    @Override
    public void keyPressed(KeyEvent e) {
       // solo con tocar funciona 
       if (e.getKeyChar() == '\b') {
                    System.out.println("Tecla Borrar presionada");
                    texto.setText("");
                }
       
    }

    @Override
    public void keyReleased(KeyEvent e) {
        // Tocar y soltar para que funcione 
        char c = e.getKeyChar();
                if (Character.isDigit(c)) {
                    texto.setText(texto.getText() + c);
                }
    }

   
}
