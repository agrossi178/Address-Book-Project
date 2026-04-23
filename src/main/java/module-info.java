module com.example.addressbook.demo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.addressbook.demo to javafx.fxml;
    exports com.example.addressbook.demo;
}