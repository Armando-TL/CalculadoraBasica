package Calcular;
// @author amdtr

import javax.swing.WindowConstants;

public class Main {

    public static void main(String[] args) {
        ViewCalculadora ventana = new ViewCalculadora();
        ventana.setLocationRelativeTo(null);
        ventana.setResizable(false);
        ventana.setVisible(true);
        ventana.setTitle("Calculadora");
        ventana.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    } //Terminado

}
