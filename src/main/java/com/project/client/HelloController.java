package com.project.client;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label welcomeText;
//wreqr
    @FXML
    protected void onDataGatherClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
    protected void onShowInvoiceClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}