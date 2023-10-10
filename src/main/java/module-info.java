module lab3.lab3 {
    requires javafx.controls;
    requires javafx.fxml;


    opens lab3.lab3 to javafx.fxml;
    exports lab3.lab3;
}