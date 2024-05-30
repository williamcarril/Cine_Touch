/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package br.com.fatec.controller;

import java.net.URL;
import javafx.fxml.FXML;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;

/**
 * FXML Controller class
 *
 * @author Fernanda
 */
public class LoginAdmController implements Initializable {
    
    @FXML
    private TextField txtUsuario;
    
    @FXML
    private PasswordField pwSenha;
    
    @FXML
    private CheckBox ckSenha;
    
    @FXML
    private Button btnConfirmar;
    
    @FXML
    private Button btnVoltar;
    
    @FXML
    private ImageView imgLogo;
    
    @FXML
    private Label lblLogin;
    
    @FXML
    private Label lblAdm;
    
    @FXML
    private Label lblUsuario;
    
    @FXML
    private Label lblSenha;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}