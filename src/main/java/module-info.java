module com.example.addressbook.demo {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.xml;
    requires java.desktop;


    opens com.example.addressbook.demo to javafx.fxml;
    exports com.example.addressbook.demo;
}