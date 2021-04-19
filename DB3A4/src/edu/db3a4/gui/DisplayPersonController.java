/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.db3a4.gui;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author LENOVO
 */
public class DisplayPersonController implements Initializable {

    @FXML
    private TextField rNom;
    @FXML
    private TextField rPrenom;

    public void setrNom(String Value) {
        this.rNom.setText(Value);
    }

    public void setrPrenom(String Value) {
        this.rPrenom.setText(Value);
    }

    
    
   
    
     
    @Override
    public void initialize(URL url, ResourceBundle rb) {
      
      
               
               
               
    }    
    
}
