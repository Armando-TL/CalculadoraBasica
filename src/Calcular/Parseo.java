package Calcular;
// @author amdtr

public class Parseo {

    private String input;
    private int position;
    private char currentChar;

    public void getInput(String input) {
        this.input = input;
    }

    public Parseo(String input) {
        this.input = input;
        this.position = 0;
        this.currentChar = input.charAt(0);
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

    private double integer() {
        StringBuilder result = new StringBuilder();
        while (currentChar != '\0' && (Character.isDigit(currentChar) || currentChar == '.')) {
            result.append(currentChar);
            advance();
        }
        return Double.parseDouble(result.toString());
    }

    private double term() {
        double result = integer();
        while (currentChar != '\0' && (currentChar == '+' || currentChar == '-' || currentChar == '*' || currentChar == '/')) {
            char op = currentChar;
            advance();
            double nextInt = integer();
            if (op == '+') {
                result += nextInt;
            } else if (op == '-') {
                result -= nextInt;
            } else if (op == '/') {
                result /= nextInt;
            } else if (op == '*') {
                result *= nextInt;
            }
        }
        return result;
    }

    public double parse() {
        skipWhitespace();
        double result = term();
        return result;
    }

}
