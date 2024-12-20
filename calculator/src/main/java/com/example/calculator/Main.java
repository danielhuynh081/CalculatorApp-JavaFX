package com.example.calculator;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("Calculator.fxml"));
            if (root == null) {
                System.out.println("Root is null");
            }

            Scene scene = new Scene(root, 300, 400);
            scene.getStylesheets().add(getClass().getResource("calculator.css").toExternalForm());
            // stage.setTitle("Hello!");
            stage.setScene(scene);
            stage.setResizable(false);
            stage.show();
        }catch (Exception e){

            System.err.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}