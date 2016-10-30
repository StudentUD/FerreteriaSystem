/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ferreteria.login;

import driver.ConexionPostgres;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressIndicator;
import javafx.scene.control.TextField;
import javafx.scene.control.ProgressIndicator;

/**
 *
 * @author alejandro
 */
public class LoginController {
    
    @FXML
    Label lblUser;
    @FXML
    private Label lblPasword;
    
    @FXML
    TextField txtUser;
    @FXML
    TextField txtPassword;
    
    @FXML
    Button btnLogin;
    
    @FXML
    private ProgressIndicator progressLogin;
    @FXML
    Label lblStatus;
    
    public void login(ActionEvent e) {
        
        String user = txtUser.getText();        
        String pass = txtPassword.getText();        
        
        if (user.equals("admin") && pass.equals("admin")) {
            
            lblStatus.setText("Estado: Conectado");
            progressLogin.setProgress(1.0);
            
            ConexionPostgres conexion = new ConexionPostgres();
            
            
            
            
            
        } else {
            lblStatus.setText("Estado: Verifique datos");
        }
        
    }
    
}
