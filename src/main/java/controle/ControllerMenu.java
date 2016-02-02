package controle;

/**
 * Created by 1494778 on 2016-02-02.
 */
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;

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

        }
        else if (checkBoxTaxis.isSelected()){

        }
        else if (checkBoxTournee.isSelected()){

        }
        else{
            
        }

    }

}
