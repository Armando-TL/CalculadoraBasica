package Calcular;
// @author amdtr

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ControlTeclado implements KeyListener {

    private String input;
    char[] usable = {'+', '-', '*', '/', '.'};

    ///////////////////////////////////
    private final JPanel controller;
    private final JLabel texto;
    private final JLabel resultado;

    public ControlTeclado(JPanel control, JLabel texto, JLabel resultado) {
        this.controller = control;
        this.controller.addKeyListener(this);
        controller.requestFocusInWindow();
        this.controller.setFocusable(true);
        this.texto = texto;
        this.resultado = resultado;
    }

    public void getInput(String input) {
        this.input = input;
    }

    @Override
    public void keyTyped(KeyEvent e) {/*Solo con tocar funciona sin teclas como Alt o Ctrl*/
    }

    @Override
    public void keyPressed(KeyEvent e) {
        /* solo con tocar funciona*/
        if (e.getKeyCode() == KeyEvent.VK_ENTER) {
            respuesta();
        }
        if (e.getKeyCode() == KeyEvent.VK_DELETE) {
            texto.setText("");
            resultado.setText("");
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        // Tocar y soltar para que funcione 
        // Ingresar cualquier numero
        char c = e.getKeyChar();
        if (Character.isDigit(c)) {
            texto.setText(texto.getText() + c);
        }
        // borrar un caracter
        if (e.getKeyChar() == '\b') {
            String t = texto.getText();
            if (!t.equals("")) {
                texto.setText(texto.getText().substring(0, t.length() - 1));
            }

        }

        //Ingresar operadores
        if (c == '+') {
            operador('+');
        }
        if (c == '-') {
            operador('-');
        }
        if (c == '*') {
            operador('*');
        }
        if (c == '/') {
            operador('/');
        }
        if (c == '.') {
            operador('.');
        }

        //Fin eventos de teclado
    }

    //Validar operadores seguidos y puntos
    public void operador(char op) {
        if (!texto.getText().isEmpty()) {
            getInput(texto.getText());
            boolean encontrado = false;
            char i = input.charAt(input.length() - 1);

            for (int j = 0; j < usable.length; j++) {
                if (i == usable[j]) {
                    encontrado = true;
                    break;
                }
            }

            if (!encontrado) {
                texto.setText(texto.getText() + op);
            }
        }
    }

    //Operar el resultado usando script manager
    public void respuesta() {
        getInput(texto.getText());
        ScriptEngineManager manager = new ScriptEngineManager();
        ScriptEngine engine = manager.getEngineByName("JavaScript");
        try {

            Object result = engine.eval(input);
            this.resultado.setText(result.toString());
        } catch (ScriptException ex) {
            Logger.getLogger(ControlTeclado.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
