package controle;



import JAXB.Taxi;
import SAX.TaxiReader;
import dom.Tournee;
import dom.TourneesDomReader;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.util.StringConverter;

import java.net.URL;
import java.util.ResourceBundle;
/**
 * @author Fabienne et Gabriel on 2016-02-04.
 */
public class ControllerTournee implements Initializable{

    @FXML
    private ChoiceBox<Tournee> listOfDrivers;

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
        txtfieldOrigine.setText(listOfDrivers.getValue().getOrigine());
        txtFieldDestination.setText(listOfDrivers.getValue().getDestination());
        txtFieldDepart.setText(listOfDrivers.getValue().getHeureDepart());
        txtFieldReferenceVehicule.setText(listOfDrivers.getValue().getRefVehicule());
        txtFieldClient1Nom.setText(listOfDrivers.getValue().getClient());
    }

    ObservableList<Tournee> observableList = FXCollections.observableArrayList();

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        listOfDrivers.setConverter(new StringConverter<Tournee>() {
            @Override
            public String toString(Tournee object) {
                return object.getHeureDepart();
            }

            @Override
            public Tournee fromString(String string) {
                return null;
            }
        });
        TourneesDomReader reader = new TourneesDomReader();
        observableList.setAll(reader.readTourneesFromFile("tournees.xml"));
        listOfDrivers.setItems(observableList);
    }
}
