package Calcular;
// @author amdtr

import javax.swing.WindowConstants;

public class Main {

    public static void main(String[] args) {
        Calcular ventana = new Calcular();
        ventana.setLocationRelativeTo(null);
        ventana.setResizable(false);
        ventana.setVisible(true);
        ventana.setTitle("Calculadora AMD");
        ventana.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        // calcular tiene la vista y los metodos de mouse click y controlTeclado los de teclado
    }

}
