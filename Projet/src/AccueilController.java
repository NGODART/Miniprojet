import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;


public class AccueilController {
    @FXML
    private Button BtnAjout;

    @FXML
    private ChoiceBox<?> BtnChoixPromo1;

    public AccueilController() {
    }

        @FXML
        private void ajouter (ActionEvent event) throws Exception {
            Parent root = (Parent) FXMLLoader.load(this.getClass().getResource("ajout_stage.fxml"));
            Scene scene = new Scene(root);
            Stage leStage = (Stage) BtnAjout.getScene().getWindow();
            leStage.setScene(scene);
            leStage.setResizable(false);
        }
}

