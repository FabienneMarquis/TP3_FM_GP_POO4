package controle;

/**
 * Created by 1494778 on 2016-02-02.
 */
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;

public class ControllerDriver {

    @FXML
    private ChoiceBox<?> listOfDrivers;

    @FXML
    private Button btnOkChoiceDriver;

    @FXML
    private TextField txtFieldNomChauffeur;

    @FXML
    private TextField txtFieldPrenomChauffeur;

    @FXML
    private TextField txtFieldTelephoneChauffeur;

    @FXML
    private TextField txtFieldNumeroPermisChauffeur;

    @FXML
    private TextField txtFieldReferencevehiculeChauffeur;

    @FXML
    void showDriver(ActionEvent event) {

    }

}
