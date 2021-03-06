package controle;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;


/**
 * @author Fabienne et Gabriel on 2016-02-04.
 */
public class AppController extends Application implements Initializable{

    @FXML
    private GridPane root;

    @FXML
    private Scene scene;

    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage primaryStage) throws Exception {
        //E:\AEC Programmeur Analyste\Session 4\Programmation oriente objet 4\TP\TP3\TP3_FM_GP_POO4\src\main\java\vue\Vue_tp3.fxml
        String path = "/Vue_tp3.fxml";
       // System.out.print(getClass().getResource(path));
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(path));
        root = fxmlLoader.load();
        scene = new Scene(root);


        primaryStage.setTitle("TP3 - Fabienne et Gabriel - XML");
        primaryStage.setScene(scene);
        primaryStage.show();


    }

    public void initialize(URL location, ResourceBundle resources) {

    }
}


