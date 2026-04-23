package com.example.addressbook.demo;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    private CheckBox checkBox;

    @FXML
    private Button next;

    private boolean accepted;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    @FXML
    protected void onAgreeCheckBoxClick() {
        accepted = checkBox.isSelected();
        next.setDisable(!accepted);
    }

    public void initialize() {
        next.setDisable(!accepted);
    }
}
