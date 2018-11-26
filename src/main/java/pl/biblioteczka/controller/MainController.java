package pl.biblioteczka.controller;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.ButtonType;
import javafx.scene.control.CheckMenuItem;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import pl.biblioteczka.dialogs.DialogsUtils;
import pl.biblioteczka.dialogs.FxmlUtils;
import pl.biblioteczka.model.enums.FxmlPath;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class MainController implements Initializable {

    @FXML
    private BorderPane rootBorderPane;

    @FXML
    private TopMenuButtonsController topMenuButtonsController;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        topMenuButtonsController.setMainController(this);
    }

    public void setCenter(FxmlPath fxmlPath) {
        rootBorderPane.setCenter(FxmlUtils.fxmlLoader(fxmlPath));
    }

    public void closeApplication() {
        DialogsUtils.confirmationDialog().ifPresent(button -> {
            if(button == ButtonType.OK) {
                Platform.exit();
                System.exit(0);
            }
        });
    }

    public void setCaspian() {
        Application.setUserAgentStylesheet(Application.STYLESHEET_CASPIAN);
    }

    public void setModena() {
        Application.setUserAgentStylesheet(Application.STYLESHEET_MODENA);
    }

    public void setAlwaysOnTop(ActionEvent actionEvent) {
        Stage stage = (Stage) rootBorderPane.getScene().getWindow();
        boolean value = ((CheckMenuItem) actionEvent.getSource()).selectedProperty().get();
        stage.setAlwaysOnTop(value);
    }

    public void about() {
        DialogsUtils.dialogAboutApplication();
    }
}
