package com.example.calculator;

public class Model {
    public int firstNumber;
    public int secondNumber;
    public String operation;

    public float calculate(long number1, long number2, String operation) {
        switch (operation) {
            case "+":
                return ((float)number1 + number2);
            case "-":
                return ((float)number1 - number2);
            case "/":
                if(number2 == 0) return 0;
                return  ((float) number1 / number2);
            case "*":
                return  ((float)number1 * number2);
            default:
                return 0;
        }

    }

}
