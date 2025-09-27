/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myapp1;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author HP
 */
public class DisplayController implements Initializable {

    private Stage stage;
    private String data;
    @FXML
    private Label lbl_allEmployy;
        @FXML
    private Button btn_back;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    public Stage getStage() {
        return stage;
    }

    public void setStage(Stage stage) {
        this.stage = stage;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
      System.out.println("DATA RECEIVED: " + data); // ← أطبع النص المستلم
    if (lbl_allEmployy == null) {
        System.out.println("lbl_allEmploy is NULL");
    } else {
        lbl_allEmployy.setText(data);
    }
    }
public void fillfield(){
     if (stage != null && stage.getUserData() != null) {
    String a =(String) stage.getUserData();
     lbl_allEmployy.setText(a);}
}
   @FXML
    void onBttonBack(ActionEvent event) throws IOException {
Parent root = FXMLLoader.load(getClass().getResource("addScene.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
