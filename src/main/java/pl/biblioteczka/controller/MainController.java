package pl.biblioteczka.controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.BorderPane;

import java.net.URL;
import java.util.ResourceBundle;

public class MainController implements Initializable {

    @FXML
    private BorderPane borderPane;

    @FXML
    private TopMenuButtonsController topMenuButtonsController;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        topMenuButtonsController.setMainController(this);
    }

}
