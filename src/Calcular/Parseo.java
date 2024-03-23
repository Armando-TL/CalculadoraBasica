package Calcular;
// @author Deiby Prada

public class Parseo {

    private String input;
    private int position;
    private char currentChar;
    private int sentencePosition1;
    private int sentencePosition2;

    public void getInput(String input) {
        this.input = input;
    }

    public Parseo(String input) {
        this.input = input;
        this.position = 0;
        this.currentChar = input.charAt(0);
    }

    private void goBack() {
        position--;
        if (position >= 0) {
            currentChar = input.charAt(position);
        }
    }

    private void advance() {
        position++;
        if (position < input.length()) {
            currentChar = input.charAt(position);
        } else {
            currentChar = '\0'; // End of input
        }
    }

    private void skipWhitespace() {
        while (currentChar != '\0' && Character.isWhitespace(currentChar)) {
            advance();
        }
    }

    private double number() {
        StringBuilder result = new StringBuilder();
        while (currentChar != '\0' && (Character.isDigit(currentChar) || currentChar == '.')) {
            result.append(currentChar);
            advance();
        }

        if (result.length() == 0) {
            result.append(0);
        }
        sentencePosition2 = position;
        return Double.parseDouble(result.toString());
    }

    private double prevNumber() {
        StringBuilder result = new StringBuilder();
        int i = 0;
        goBack();
        while (position > 0 && currentChar != '\0' && (Character.isDigit(currentChar) || currentChar == '.')) {
            i++;
            result.append(currentChar);

            if (position > 0) {
                goBack();
            }
        }
        sentencePosition1 = position;
        position += i;
        currentChar = input.charAt(position);
        result.reverse();
        if (result.length() == 0) {
            result.append(0);
        }
        return Double.parseDouble(result.toString());
    }

    private double term() {
        double result = 0;
        int cMulti = 0;
        int cDivi = 0;
        int cSum = 0;
        int cRes = 0;

        
        
        mainLoop: // Ciclo principal - Verifica el tipo de operación
        do {
            double num, num1, num2;
            
            // si ya se leyo antes
            if (position > 0 && currentChar != '\0' && (currentChar == '+' || currentChar == '-' || currentChar == '*' || currentChar == '/')) {
                num1 = prevNumber();
                advance();
            } else { // Si es la primera vez que se lee
                num1 = number();
            }
            char op = currentChar;
            advance();
            num2 = number();

             // -------------------------------------------- Multiplicación --------------------------------------------
            
            do {
                // Cuenta el número de multiplicaciones de la expresión
                for (int i = 0; i < input.length(); i++) {
                    if (input.charAt(i) == '*') {
                        cMulti++;
                    }
                }
                if (op == '*') {
                    result = 0;
                    result = num1 * num2;
                    
                    // Modifica la expresión, reemplazando la operación que se acaba de ejecutar por el resultado
                    // ejemplo: 12 + 2 x 5  ----> 12 + 10
                    String parte1;
                    if (sentencePosition1 == 0) {
                        parte1 = input.substring(0, sentencePosition1);
                    } else {
                        parte1 = input.substring(0, sentencePosition1 + 1);
                    }
                    String parte3 = input.substring(sentencePosition2, input.length());
                    StringBuilder newInput = new StringBuilder();
                    newInput.append(parte1).append(result).append(parte3);
                    input = newInput.toString();
                    
                    
                    // preparación para la siguiente lectura
                    position = 0;
                    currentChar = input.charAt(position);
                    num1 = number();
                    num = prevNumber();
                    advance();
                    op = currentChar;
                    advance();
                    num2 = number();
                    cMulti = 0;
                    
                    
                     // Cuenta el número de multiplicaciones de la expresión
                    for (int i = 0; i < input.length(); i++) {
                        if (input.charAt(i) == '*') {
                            cMulti++;
                        }
                    }
                    
                    
                } else if (op != '*' && cMulti > 0) { // Si la operación actual no es multiplicación y hay multiplicaciones en la expresión, sigue leyendo
                    continue mainLoop;
                }
            } while (cMulti > 0 && op == '*'); // Realiza todas las multiplicaciones existentes en la expresión

            
            // -------------------------------------------- Division --------------------------------------------
            
            
            do {
                 // Cuenta el número de divisiones de la expresión
                for (int i = 0; i < input.length(); i++) {
                    if (input.charAt(i) == '/') {
                        cDivi++;
                    }
                }
                if (op == '/' && cMulti == 0) {
                    result = 0;
                    result = num1 / num2;
                    
                    
                    // Modifica la expresión, reemplazando la operación que se acaba de ejecutar por el resultado
                    // ejemplo: 5 + 10 / 2  ----> 5 + 5
                    String parte1;
                    if (sentencePosition1 == 0) {
                        parte1 = input.substring(0, sentencePosition1);
                    } else {
                        parte1 = input.substring(0, sentencePosition1 + 1);
                    }
                    String parte3 = input.substring(sentencePosition2, input.length());
                    StringBuilder newInput = new StringBuilder();
                    newInput.append(parte1).append(result).append(parte3);
                    input = newInput.toString();



                    // preparación para la siguiente lectura
                    position = 0;
                    currentChar = input.charAt(position);
                    num1 = number();
                    num = prevNumber();
                    advance();
                    op = currentChar;
                    advance();
                    num2 = number();
                    cDivi = 0;
                    
                    
                     // Cuenta el número de divisiones de la expresión
                    for (int i = 0; i < input.length(); i++) {
                        if (input.charAt(i) == '/') {
                            cDivi++;
                        }
                    }
                } else if (op != '/' && cDivi > 0) { // Si la operación actual no es division y hay divisiones en la expresión, sigue leyendo
                    continue mainLoop;
                }
            } while (cDivi > 0  && op == '/'); // Realiza todas las divisiones existentes en la expresión
            
            
            // -------------------------------------------- Suma --------------------------------------------

            do {
                // Cuenta el número de sumas de la expresión
                for (int i = 0; i < input.length(); i++) {
                    if (input.charAt(i) == '+') {
                        cSum++;
                    }
                }
                if (op == '+') {
                    result = 0;
                    result = num1 + num2;
                    
                    // Modifica la expresión, reemplazando la operación que se acaba de ejecutar por el resultado
                    // ejemplo: 8 - 3 + 2  ----> 8 - 5
                    String parte1;
                    if (sentencePosition1 == 0) {
                        parte1 = input.substring(0, sentencePosition1);
                    } else {
                        parte1 = input.substring(0, sentencePosition1 + 1);
                    }
                    String parte3 = input.substring(sentencePosition2, input.length());
                    StringBuilder newInput = new StringBuilder();
                    newInput.append(parte1).append(result).append(parte3);
                    input = newInput.toString();
                    
                    
                    // preparación para la siguiente lectura
                    position = 0;
                    currentChar = input.charAt(position);
                    num1 = number();
                    num = prevNumber();
                    advance();
                    op = currentChar;
                    advance();
                    num2 = number();
                    cSum = 0;
                    
                    
                     // Cuenta el número de sumas de la expresión
                    for (int i = 0; i < input.length(); i++) {
                        if (input.charAt(i) == '+') {
                            cSum++;
                        }
                    }
                    
                    
                } else if (op != '+' && cSum > 0) { // Si la operación actual no es suma y hay sumas en la expresión, sigue leyendo
                    continue mainLoop;
                }
            } while (cSum > 0 && op == '+'); // Realiza todas las multiplicaciones existentes en la expresión

            
            
            // -------------------------------------------- Resta --------------------------------------------

            do {
                 // Cuenta el número de sumas de la expresión
                for (int i = 0; i < input.length(); i++) {
                    if (input.charAt(i) == '-') {
                        cRes++;
                    }
                }
                if (op == '-' && (cDivi == 0 && cMulti == 0 && cSum == 0)) {
                    result = 0;
                    result = num1 - num2;
                    
                    
                    // Modifica la expresión, reemplazando la operación que se acaba de ejecutar por el resultado
                    // ejemplo: 8 - 2 + 3  ----> 8 - 5 
                    String parte1;
                    if (sentencePosition1 == 0) {
                        parte1 = input.substring(0, sentencePosition1);
                    } else {
                        parte1 = input.substring(0, sentencePosition1 + 1);
                    }
                    String parte3 = input.substring(sentencePosition2, input.length());
                    StringBuilder newInput = new StringBuilder();
                    newInput.append(parte1).append(result).append(parte3);
                    input = newInput.toString();
                    
                    
                    
                    // preparación para la siguiente lectura
                    position = 0;
                    currentChar = input.charAt(position);
                    num1 = number();
                    num = prevNumber();
                    advance();
                    op = currentChar;
                    advance();
                    num2 = number();
                    cRes = 0;


                    // Cuenta el numero de restas de la expresión
                    for (int i = 0; i < input.length(); i++) {
                        if (input.charAt(i) == '-') {
                            cRes++;
                        }
                    }

                } else if (op != '-' && cRes > 0) { // Si la operación actual no es resta y hay restas en la expresión, sigue leyendo
                    continue mainLoop;

                }
            } while (cRes > 0  && op == '-');  // Realiza todas las rstas existentes en la expresión

        } while (currentChar != '\0' && (currentChar == '+' || currentChar == '-' || currentChar == '*' || currentChar == '/')); // Ciclo principal - Verifica el tipo de operación
        
        return result;
    }

    
    public double parse() {
        skipWhitespace();
        double result = term();
        return result;
    }

}
