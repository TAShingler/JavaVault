module com.javavault {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.javavault to javafx.fxml;
    exports com.javavault;
}
