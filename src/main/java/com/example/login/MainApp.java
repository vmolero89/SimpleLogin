package com.example.login;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class MainApp extends Application {
    @Override
    public void start(Stage stage) throws IOException {


        Parent root = FXMLLoader.load(getClass().getResource("login.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();



//        FXMLLoader fxmlLoader = new FXMLLoader(MainApp.class.getResource(cambiarEscena("login")));
//        Scene scene = new Scene(fxmlLoader.load(), 640, 420);
//        stage.setTitle("");
//        stage.setScene(scene);
//        stage.show();


    }

    public static void launchApp() {
        launch();
    }
}