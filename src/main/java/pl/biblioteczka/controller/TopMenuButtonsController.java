package pl.biblioteczka.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;

import java.net.URL;
import java.util.ResourceBundle;

public class TopMenuButtonsController implements Initializable {

    @FXML
    private ToggleButton libraryButton;

    @FXML
    private ToggleButton listBooksButton;

    @FXML
    private ToggleButton statisticsButton;

    @FXML
    private ToggleGroup toggleButtons;

    private MainController mainController;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
    }

    @FXML
    public void openLibrary(ActionEvent actionEvent) {
        System.out.println("openLibrary()");
    }

    @FXML
    public void openListBooks(ActionEvent actionEvent) {
        System.out.println("openListBooks()");
    }

    @FXML
    public void openStatistics(ActionEvent actionEvent) {
        System.out.println("openStatistics()");
    }

    @FXML
    public void addBook(ActionEvent actionEvent) {
        if(toggleButtons.getSelectedToggle() != null) {
            toggleButtons.getSelectedToggle().setSelected(false);
        }

        mainController.setCenter("/fxml/AddBook.fxml");
    }

    public void setMainController(MainController mainController) {
        this.mainController = mainController;
    }
}
