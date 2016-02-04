package controle;



import JAXB.Chauffeur;
import JAXB.Taxi;
import SAX.ChauffeurReader;
import SAX.TaxiReader;
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
public class ControllerTaxi implements Initializable{

    @FXML
    private ChoiceBox<Taxi> listOfDrivers;

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
        txtFieldReferenceVehiculeTaxi.setText(listOfDrivers.getValue().getRefVehicule());
        txtFieldZoneTaxi.setText(listOfDrivers.getValue().getZone());
        txtFieldImmatriculationTaxi.setText(listOfDrivers.getValue().getImmatriculation());
        txtFieldNbrPlace.setText(listOfDrivers.getValue().getNbPlace());
        txtFieldMarqueTaxi.setText(listOfDrivers.getValue().getMarque());
    }
    ObservableList<Taxi> taxis = FXCollections.observableArrayList();

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        listOfDrivers.setConverter(new StringConverter<Taxi>() {
            @Override
            public String toString(Taxi object) {
                return object.getImmatriculation();
            }

            @Override
            public Taxi fromString(String string) {
                return null;
            }
        });
        TaxiReader reader = new TaxiReader();
        taxis.setAll(reader.read("taxis.xml"));
        listOfDrivers.setItems(taxis);
    }
}
