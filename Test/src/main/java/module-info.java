module Test {
    requires java.sql;
    requires org.xerial.sqlitejdbc;
    requires javafx.controls;
    requires javafx.fxml;
    opens ch.makery.address.model to javafx.base;
    opens ch.makery.address.view to javafx.fxml;
    exports ch.makery.address;
    opens ch.makery.address to javafx.base;
}