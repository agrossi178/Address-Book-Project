package com.example.addressbook.demo;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private CheckBox checkBox;

    @FXML
    private Button next;

    @FXML
    private Button cancel;

    private boolean accepted;

    @FXML
    protected void onAgreeCheckBoxClick() {
        accepted = checkBox.isSelected();
        next.setDisable(!accepted);
    }

    @FXML
    protected void onCancelClick(ActionEvent event) {
        Platform.exit();
    }

    public void initialize() {
        next.setDisable(!accepted);
    }
}
