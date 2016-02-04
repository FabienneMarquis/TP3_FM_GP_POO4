package controle;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.stage.Stage;

import java.io.IOException;
/**
 * @author Fabienne et Gabriel on 2016-02-04.
 */
public class ControllerMenu {

    @FXML
    private CheckBox checkBoxChauffeur;

    @FXML
    private CheckBox checkBoxTaxis;

    @FXML
    private CheckBox checkBoxTournee;

    @FXML
    private Button btnOK;

    @FXML
    void selectViewForCheckBox(ActionEvent event) {
        if (checkBoxChauffeur.isSelected()){

            Parent root = null;
            try {
                root = FXMLLoader.load(getClass().getResource("/VueDriver.fxml"));
                Stage stage = new Stage();
                stage.setTitle("Chauffeurs");
                stage.setScene(new Scene(root));
                stage.show();
            } catch (IOException e) {
                e.printStackTrace();
            }


        }
        if (checkBoxTaxis.isSelected()){

            Parent root = null;
            try {
                root = FXMLLoader.load(getClass().getResource("/VueTaxi.fxml"));
                Stage stage = new Stage();
                stage.setTitle("Taxis");
                stage.setScene(new Scene(root));
                stage.show();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
        if (checkBoxTournee.isSelected()){

            Parent root = null;
            try {
                root = FXMLLoader.load(getClass().getResource("/VueTournee.fxml"));
                Stage stage = new Stage();
                stage.setTitle("Tournees");
                stage.setScene(new Scene(root));
                stage.show();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

    }

}
