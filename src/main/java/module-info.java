module com.example.labk6 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.psps6_1 to javafx.fxml;
    exports com.example.psps6_1;
}