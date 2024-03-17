package Calcular;
// @author amdtr

import javax.swing.WindowConstants;

public class Main {

   public static void main(String[] args) {
        Calcular ventana = new Calcular();
        ventana.setLocationRelativeTo(null);
        ventana.setResizable(false);
        ventana.setVisible(true);
        ventana.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

}
