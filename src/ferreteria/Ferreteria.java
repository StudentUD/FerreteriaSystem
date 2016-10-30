/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ferreteria;

import javafx.application.Application;
import static javafx.application.Application.launch;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

import javafx.stage.Stage;

/**
 *
 * @author alejandro
 */
public class Ferreteria extends Application {
    
  @Override
    public void start(Stage stage)  {
        
        
        try{
            Parent root = FXMLLoader.load(Ferreteria.class.getResource("login/login.fxml"));
        stage.setTitle("FXML Welcome");
        stage.setScene(new Scene(root));
        stage.show();
        }catch(Exception e){
        e.printStackTrace();
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
