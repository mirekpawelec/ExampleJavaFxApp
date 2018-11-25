package pl.biblioteczka.model.enums;

public enum FxmlPath {
    BorderPaneMain("/fxml/BorderPaneMain.fxml"),
    Library("/fxml/Library.fxml"),
    ListBooks("/fxml/ListBooks.fxml"),
    Statistics("/fxml/Statistics.fxml"),
    AddBook("/fxml/AddBook.fxml")
    ;

    private String path;

    FxmlPath(String path) {
        this.path = path;
    }

    public String getPath() {
        return path;
    }
}
