package com.example.login;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class BienvenidoController {

    @FXML
    private Label bienvenidaMsg;


    private Stage stage;
    private Scene scene;
    private Parent root;


    public void saludo(String name){
        bienvenidaMsg.setText("Bienvenido/a, "+ name);
    }

    @FXML
    public void volver(ActionEvent e) throws IOException {
        this.cambiarALogin(e);
    }


    public void cambiarALogin(ActionEvent e) throws IOException {
        root = FXMLLoader.load(getClass().getResource("login.fxml"));
        stage = (Stage) ((Node)e.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
