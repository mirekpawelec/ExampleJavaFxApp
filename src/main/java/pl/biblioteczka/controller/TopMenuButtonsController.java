package pl.biblioteczka.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;
import static pl.biblioteczka.model.enums.FxmlPath.*;

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
    public void openLibrary() {
        mainController.setCenter(Library.getPath());
    }

    @FXML
    public void openListBooks() {
        mainController.setCenter(ListBooks.getPath());
    }

    @FXML
    public void openStatistics() {
        mainController.setCenter(Statistics.getPath());
    }

    @FXML
    public void addBook(ActionEvent actionEvent) {
        if(toggleButtons.getSelectedToggle() != null) {
            toggleButtons.getSelectedToggle().setSelected(false);
        }
        mainController.setCenter(AddBook.getPath());
    }

    public void setMainController(MainController mainController) {
        this.mainController = mainController;
    }
}
