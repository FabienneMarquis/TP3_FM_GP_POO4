package controle;

/**
 * Created by 1494778 on 2016-02-02.
 */
import JAXB.Chauffeur;
import SAX.ChauffeurReader;
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

public class ControllerDriver implements Initializable{

    @FXML
    private ChoiceBox<Chauffeur> listOfDrivers;

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
        txtFieldNomChauffeur.setText(listOfDrivers.getValue().getNom());
        txtFieldPrenomChauffeur.setText(listOfDrivers.getValue().getPrénom());
        txtFieldTelephoneChauffeur.setText(listOfDrivers.getValue().getTéléphone());
        txtFieldNumeroPermisChauffeur.setText(listOfDrivers.getValue().getPermis());
        txtFieldReferencevehiculeChauffeur.setText(listOfDrivers.getValue().getRefVehicule());
    }
    ObservableList<Chauffeur> chauffeurs = FXCollections.observableArrayList();

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        listOfDrivers.setConverter(new StringConverter<Chauffeur>() {
            @Override
            public String toString(Chauffeur object) {
                return object.getNom();
            }

            @Override
            public Chauffeur fromString(String string) {
                return null;
            }
        });
        ChauffeurReader chauffeurReader = new ChauffeurReader();
        chauffeurs.setAll(chauffeurReader.read("chauffeurs.xml"));
        listOfDrivers.setItems(chauffeurs);
    }
}
