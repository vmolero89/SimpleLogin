package com.example.login;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class LoginController {

    @FXML
    private TextField userName;
    @FXML
    private PasswordField userPassword;
    @FXML
    private Label warningMessage;


    private Stage stage;
    private Scene scene;
    private Parent parent;


    @FXML
    public void comprobarUsuario(ActionEvent e) throws IOException {
        String user = "user";
        String pass = "1234";


        if (Objects.equals(userName.getText(), user) && Objects.equals(userPassword.getText(), pass)){
            pasarUsuario();

            this.cambiarABienvenido(e);

        } else {
            warningMessage.setText("YOU SHALL NOT PASS!");
        }

    }

    public void cambiarABienvenido(ActionEvent e) throws IOException {
        //parent = FXMLLoader.load(getClass().getResource("bienvenido.fxml"));
        pasarUsuario();
        stage = (Stage) ((Node)e.getSource()).getScene().getWindow();
        scene = new Scene(parent);
        stage.setScene(scene);
        stage.show();
    }

    public void cambiarABienvenidoEnter(KeyEvent k) throws IOException {
        //parent = FXMLLoader.load(getClass().getResource("bienvenido.fxml"));

        if (k.getCode() == KeyCode.ENTER){
            pasarUsuario();
            stage = (Stage) ((Node)k.getSource()).getScene().getWindow();
            scene = new Scene(parent);
            stage.setScene(scene);
            stage.show();
        }
    }

    private void pasarUsuario() throws IOException {
        String name = userName.getText();
        FXMLLoader loader = new FXMLLoader(this.getClass().getResource("bienvenido.fxml"));
        parent = loader.load();
        BienvenidoController bienvenidoController = loader.getController();
        bienvenidoController.saludo(name);
    }
}
