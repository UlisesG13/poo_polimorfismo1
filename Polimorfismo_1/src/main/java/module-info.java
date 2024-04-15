module com.ulisesg.polimorfismo_1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.ulisesg.polimorfismo_1 to javafx.fxml;
    exports com.ulisesg.polimorfismo_1;
    exports com.ulisesg.polimorfismo_1.controllers;
    opens com.ulisesg.polimorfismo_1.controllers to javafx.fxml;
}