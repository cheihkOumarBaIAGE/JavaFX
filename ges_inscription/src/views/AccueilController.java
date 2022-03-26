/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Utilisateur
 */
public class AccueilController implements Initializable {

    private Button menuDeconnexion;
    @FXML
    private Button mennuClasse;
    @FXML
    private AnchorPane anchorContent;


    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void handleDeconnexion(ActionEvent event) throws IOException {
        this.menuDeconnexion.getScene().getWindow().hide();
        AnchorPane root;
        root = FXMLLoader.load(getClass().getResource("login.fxml"));
        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void handleClickMenuClasse(ActionEvent event) throws IOException {
        loadViews("classe");
    }
    private void loadViews(String view) throws IOException{
        AnchorPane root;
        root = FXMLLoader.load(getClass().getResource(view+".fxml"));
        anchorContent.getChildren().clear();
        anchorContent.getChildren().add(root);
    }
}
