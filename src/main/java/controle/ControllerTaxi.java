package controle;

/**
 * Created by 1494778 on 2016-02-02.
 */

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;

public class ControllerTaxi {

    @FXML
    private ChoiceBox<?> listOfDrivers;

    @FXML
    private Button btnOkChoiceDriver;

    @FXML
    private TextField txtFieldReferenceVehiculeTaxi;

    @FXML
    private TextField txtFieldZoneTaxi;

    @FXML
    private TextField txtFieldImmatriculationTaxi;

    @FXML
    private TextField txtFieldNbrPlace;

    @FXML
    private TextField txtFieldMarqueTaxi;

    @FXML
    void showDriver(ActionEvent event) {

    }

}
