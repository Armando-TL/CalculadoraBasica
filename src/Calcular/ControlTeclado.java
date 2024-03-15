package Calcular;
// @author amdtr

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ControlTeclado implements KeyListener {

    private final JPanel controller;
    private final JLabel texto;
    //private final Calcular con;
    

    public ControlTeclado(JPanel control, JLabel texto) {
       this.controller = control;
        this.controller.addKeyListener(this);
        controller.requestFocusInWindow();
        this.controller.setFocusable(true);
        this.texto = texto;
       /* this.con = con;
        this.con.addKeyListener(this);
        con.requestFocusInWindow();
        this.con.setFocusable(true);*/
        
    }

    @Override
    public void keyTyped(KeyEvent e) {/*Solo con tocar funciona sin teclas como Alt o Ctrl*/
    }

    @Override
    public void keyPressed(KeyEvent e) {/* solo con tocar funciona*/
    }

    @Override
    public void keyReleased(KeyEvent e) {
        // Tocar y soltar para que funcione 
        char c = e.getKeyChar();
        if (Character.isDigit(c)) {
            texto.setText(texto.getText() + c);
        }

        if (e.getKeyCode() == KeyEvent.VK_DELETE) {
            texto.setText("");
        }

        if (e.getKeyChar() == '\b') {
            String t = texto.getText();
            if (!t.equals("")) {
                texto.setText(texto.getText().substring(0, t.length() - 1));
            }

        }
    }

}
