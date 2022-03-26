/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import entity.Classe;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import services.Service;

/**
 * FXML Controller class
 *
 * @author Utilisateur
 */
public class ClasseController implements Initializable {

    private Service service = new Service();
    @FXML
    //Type d'information String
    private ComboBox<String> cboNiveau;
    @FXML
    private ComboBox<String> cboFiliere;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        cboNiveau.getItems().add("L1");
        cboNiveau.getItems().add("L2");
        cboNiveau.getItems().add("L3");
        cboNiveau.getItems().add("M1");
        cboNiveau.getItems().add("M2");
        
        List<String> filieres;
        String filiere[]=new String[]{"IAGE","MAE","GLRS","TTL","CPD","ETSE"};
        filieres = Arrays.asList(filiere);
        cboFiliere.getItems().addAll(filieres);
    }    

    @FXML
    private void handeAddClasse(ActionEvent event) {
        String niveau = cboNiveau.getSelectionModel().getSelectedItem();
        String filiere = cboFiliere.getSelectionModel().getSelectedItem();
        Classe classe = new Classe();
        classe.setFiliere(filiere);
        classe.setNiveau(niveau);
        service.ajoutClasse(classe);
    }
    
}
