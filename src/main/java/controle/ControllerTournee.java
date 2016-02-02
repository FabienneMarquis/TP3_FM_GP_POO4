package controle;

/**
 * Created by 1494778 on 2016-02-02.
 */

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;

public class ControllerTournee {

    @FXML
    private ChoiceBox<?> listOfDrivers;

    @FXML
    private Button btnOkChoiceDriver;

    @FXML
    private TextField txtfieldOrigine;

    @FXML
    private TextField txtFieldDestination;

    @FXML
    private TextField txtFieldDepart;

    @FXML
    private TextField txtFieldClient1Prenom;

    @FXML
    private TextField txtFieldClient1Nom;

    @FXML
    private TextField txtFieldClient2Prenom;

    @FXML
    private TextField txtFieldClient2Nom;

    @FXML
    private TextField txtFieldReferenceVehicule;

    @FXML
    void showDriver(ActionEvent event) {

    }

}
