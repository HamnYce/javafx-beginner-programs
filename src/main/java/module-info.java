module com.example.assignment {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;
    requires javafx.graphics;

    opens com.example.assignment4 to javafx.fxml;
    exports com.example.assignment4;
}