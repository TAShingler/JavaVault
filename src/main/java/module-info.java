module com.javavault {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens com.javavault to javafx.fxml;
    exports com.javavault;
    
    opens com.javavault.controllers to javafx.fxml;
    exports com.javavault.controllers;
}
