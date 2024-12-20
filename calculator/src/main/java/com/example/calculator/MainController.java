package com.example.calculator;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.event.ActionEvent;


public class MainController {

    @FXML
    private Label result;
    private long number1;
    private long number2;
    private String operation = "";
    private boolean start = true;
    private Model model = new Model();
    private String value = "";
    @FXML
    public void processNumbers(ActionEvent event) {
        if(start){
            result.setText("");
            value = "";
            start = false;
        }
        String numberInput = ((Button) event.getSource()).getText();
        value = value + numberInput;
        result.setText(result.getText() + numberInput);
    }

    @FXML
    public void processOperators(ActionEvent event) {
        String operatorInput = ((Button) event.getSource()).getText();
        if(!operatorInput.equals("=")){
            if(operatorInput.isEmpty())
                return;
            operation = operatorInput;
            number1 = value.isEmpty() ? 0 : Long.parseLong(value);
            result.setText(result.getText() + operatorInput);
            value ="";
        }else{
            if(operation.isEmpty())
                return;
            number2 = value.isEmpty() ? 0 : Long.parseLong(value);
            float output = model.calculate(number1, number2, operation);
            result.setText(String.valueOf(output));
            operation = "";
            number1 = 0;
            number2 = 0;
            start = true;
        }
    }
    @FXML
    public void clear(ActionEvent event) {
        result.setText("");
        value = "";
        operation = "";
        number1 = 0;
    }
}