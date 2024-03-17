package Calcular;
// @author amdtr

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.text.DecimalFormat;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ControlTeclado implements KeyListener {

    private String input;

    ///////////////////////////////////
    private final JPanel controller;
    private final JLabel texto;
    private final JLabel resultado;
    char[] usable = {'+', '-', '*', '/', '.'};

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
            resultadoT(); //resolver operacion
        }
        if (e.getKeyCode() == KeyEvent.VK_DELETE) {
            texto.setText("");
            resultado.setText("");
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        // Tocar y soltar para que funcione 

        char c = e.getKeyChar(); // Ingresar cualquier numero
        if (Character.isDigit(c)) {
            texto.setText(texto.getText() + c);
        }

        if (e.getKeyChar() == '\b') { // borrar un caracter
            String t = texto.getText();
            if (!t.equals("")) {
                texto.setText(texto.getText().substring(0, t.length() - 1));
            }

        }

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
    }

    public void resultadoT() {
        getInput(texto.getText());
        DecimalFormat formateo = new DecimalFormat("#.#####");
        Parseo parser = new Parseo(input);
        double result = parser.parse(); 
        String formateado = formateo.format(result);
        resultado.setText(String.valueOf(formateado));

    }

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

}
