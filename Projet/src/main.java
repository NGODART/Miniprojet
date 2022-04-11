import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class main extends Application {
    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = (Parent) FXMLLoader.load(this.getClass().getResource("Accueil.fxml"));
        Scene scene = new Scene(root);
        stage.setTitle("Gestion des stages GPhy");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }
//    public static void main(String[] args) {
//        checkDrivers();    //check for driver errors
//    }

//    private static boolean checkDrivers() {
//        try {
//            Class.forName("org.sqlite.JDBC");
//            DriverManager.registerDriver(new org.sqlite.JDBC());
//            return true;
//        } catch (ClassNotFoundException | SQLException classNotFoundException) {
//            Logger.getAnonymousLogger().log(Level.SEVERE, LocalDateTime.now() + ": Could not start SQLite Drivers");
//            return false;
//        }
//    }

}