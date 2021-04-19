/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.db3a4.gui;

import edu.db3a4.entities.Personne;
import edu.db3a4.services.PersonneCRUD;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author LENOVO
 */
public class AddPersonController implements Initializable {

    @FXML
    private TextField tfNom;
    @FXML
    private TextField tfPrenom;
    @FXML
    private Button btnAdd;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void Ajouter(ActionEvent event) {
        try {
            ///sauvegarde dans la BD
            String resNom= tfNom.getText();
            String resPrenom =tfPrenom.getText();
            Personne p = new Personne(14, resNom, resPrenom);
            
            PersonneCRUD pcd = new PersonneCRUD();
            pcd.ajouterPersonne(p);
            JOptionPane.showConfirmDialog(null, "personne ajouté");
            
            //// redirection
            FXMLLoader loader = new FXMLLoader(getClass().getResource("DisplayPerson.fxml")) ;
            Parent root = loader.load();
            DisplayPersonController dpc = loader.getController();
            dpc.setrNom(resNom);
             dpc.setrPrenom(resPrenom);
             ///ecraser la scence 
             tfNom.getScene().setRoot(root);
             
             
             
             
        } catch (IOException ex) {
            Logger.getLogger(AddPersonController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
        
        
    }
    
}
