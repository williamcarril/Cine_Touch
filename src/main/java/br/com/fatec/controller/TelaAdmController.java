/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package br.com.fatec.controller;

import br.com.fatec.model.Filme;
import br.com.fatec.model.Sessoes;
import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;


/**
 * FXML Controller class
 *
 * @author Fernanda
 */
public class TelaAdmController implements Initializable {
    private String dadoPassado;
    
    @FXML
    private ImageView imgLogo;
    @FXML
    private Label lblFernanda;
    @FXML
    private Label lblFernando;
    @FXML
    private Label lblTitulo;
     @FXML
    private ListView<String> lvMenu;
     
    @FXML
    private Pane pnMenu;
    
    private final Map<String, String> viewMap = new HashMap<>();


    public String getDadoPassado() {
        return dadoPassado;
    }

    public void setDadoPassado(String dadoPassado) {
        this.dadoPassado = dadoPassado;
    }
    
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        lvMenu.getItems().addAll("Gerenciar Filmes", "Gerenciar Sessões");

        // Define o comportamento ao clicar nos itens da ListView
        lvMenu.setOnMouseClicked(event -> {
            String selectedItem = lvMenu.getSelectionModel().getSelectedItem();
            if (selectedItem != null) {
                if (selectedItem.equals("Gerenciar Filmes")) {
                    try {
                        handleGerenciarFilme();
                    } catch (IOException ex) {
                        mensagem("Erro:" + ex.getMessage());
                    }
                } else if (selectedItem.equals("Gerenciar Sessões")) {
                    try {
                        handleGerenciarSessoes();
                    } catch (IOException ex) {
                        mensagem("Erro:" + ex.getMessage());
                    }
                }
            }
        });
    }
    private void mensagem(String msg) {
        Alert alerta = new Alert(Alert.AlertType.INFORMATION);
        alerta.setTitle("Mensagem");
        alerta.setHeaderText(msg);
        alerta.setContentText("");

        alerta.showAndWait(); //exibe a mensage
    }

    // Método chamado ao clicar no item "Gerenciar Filmes"
    private void handleGerenciarFilme() throws IOException{
        Filme f = new Filme();
        f.start(new Stage());
    }

<<<<<<< Updated upstream
    // Método chamado ao clicar no item "Gerenciar Sessões"
    private void handleGerenciarSessoes() throws IOException{
        Sessoes s = new Sessoes();
        s.start(new Stage());
=======
<<<<<<< HEAD
<<<<<<< Updated upstream
    private void handleSelection(MouseEvent t) {
    String selectedItem = lvMenu.getSelectionModel().getSelectedItem();
        if (selectedItem != null && viewMap.containsKey(selectedItem)) {
            loadView(viewMap.get(selectedItem));
        }
>>>>>>> Stashed changes
    }
<<<<<<< HEAD

<<<<<<< HEAD
    @FXML
    private void lvMenu_Cliked(MouseEvent event) {
        System.out.println("Teste teste");
    }
=======
<<<<<<< Updated upstream
=======
=======
=======
>>>>>>> c3ab66656aff961a6e616e1c1fb8ff7c30c83beb
    // Método chamado ao clicar no item "Gerenciar Sessões"
    private void handleGerenciarSessoes() throws IOException{
        Sessoes s = new Sessoes();
        s.start(new Stage());
    }

>>>>>>> Stashed changes

    /*@FXML
    private void lvMenu_onClick(MouseEvent event) throws IOException {
        Sessoes s = new Sessoes();
        s.start(new Stage());
    }*/
<<<<<<< Updated upstream
=======
<<<<<<< HEAD
>>>>>>> Stashed changes
>>>>>>> 171a7637fc44c561fe0d64c8c20e1f3d8f8ed751
=======
>>>>>>> Stashed changes
>>>>>>> c3ab66656aff961a6e616e1c1fb8ff7c30c83beb
}
    
 

