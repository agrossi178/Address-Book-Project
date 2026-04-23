package com.example.addressbook.demo;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloController {
    @FXML
    private CheckBox checkBox;

    @FXML
    private Button next;

    private boolean accepted;

    @FXML
    protected void onAgreeCheckBoxClick() {
        accepted = checkBox.isSelected();
        next.setDisable(!accepted);
    }

    @FXML
    protected void onCancelClick() {
        Platform.exit();
    }

    @FXML
    protected void onNextButtonClick() throws IOException {
        Stage stage = (Stage) next.getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("main-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 700, 500);
        stage.setScene(scene);
    }

    public void initialize() {
        next.setDisable(!accepted);
    }
}
