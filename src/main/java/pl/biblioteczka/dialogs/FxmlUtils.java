package pl.biblioteczka.dialogs;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import pl.biblioteczka.model.enums.FxmlPath;

import java.io.IOException;
import java.util.ResourceBundle;

public class FxmlUtils {

    public static Parent fxmlLoader(FxmlPath fxmlPath) {
        FXMLLoader loader = new FXMLLoader(FxmlUtils.class.getResource(fxmlPath.getPath()));
        loader.setResources(getResourceBundle());
        try {
            return loader.load();
        } catch (Exception e) {
            DialogsUtils.errorDialog(e.getMessage());
        }
        return null;
    }

    public static ResourceBundle getResourceBundle() {
        return ResourceBundle.getBundle("bundles.messages");
    }
}
