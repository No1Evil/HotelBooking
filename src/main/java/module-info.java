module org.evilprojects.hotelbooking {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.evilprojects.hotelbooking to javafx.fxml;
    exports org.evilprojects.hotelbooking;
}