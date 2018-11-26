package pl.biblioteczka;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import pl.biblioteczka.dialogs.FxmlUtils;

import java.util.Locale;
import java.util.ResourceBundle;

import static pl.biblioteczka.model.enums.FxmlPath.*;

public class Main extends Application {

    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
//        Locale.setDefault(new Locale("en"));
        Parent pane = FxmlUtils.fxmlLoader(BorderPaneMain);
        Scene scene = new Scene(pane);
        primaryStage.setScene(scene);
        primaryStage.setTitle(FxmlUtils.getResourceBundle().getString("title.application"));
        primaryStage.show();
    }
}
