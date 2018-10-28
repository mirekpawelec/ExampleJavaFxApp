package pl.biblioteczka.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ToggleButton;

import java.net.URL;
import java.util.ResourceBundle;

public class TopMenuButtonsController implements Initializable {

    @FXML
    private ToggleButton libraryButton;

    @FXML
    private ToggleButton listBooksButton;

    @FXML
    private ToggleButton statisticsButton;

    private MainController mainController;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
    }

    public void openLibrary(ActionEvent actionEvent) {
        System.out.println("openLibrary()");
    }

    public void openListBooks(ActionEvent actionEvent) {
        System.out.println("openListBooks()");
    }

    public void openStatistics(ActionEvent actionEvent) {
        System.out.println("openStatistics()");
    }

    public void setMainController(MainController mainController) {
        this.mainController = mainController;
    }
}
