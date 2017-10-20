/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanprojectjavafx;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author AsFx
 */
public class FXMLBankController implements Initializable {
    
    String pin = "";
    String PIN = "1234";
    int kesempatan = 3;
    int tmp;
    
    @FXML
    private JFXButton butt1;

    @FXML
    private JFXButton butt2;

    @FXML
    private JFXButton butt3;

    @FXML
    private JFXButton butt4;

    @FXML
    private JFXButton butt5;

    @FXML
    private JFXButton butt6;

    @FXML
    private JFXButton butt7;

    @FXML
    private JFXButton butt8;

    @FXML
    private JFXButton butt9;

    @FXML
    private JFXButton buttc;

    @FXML
    private JFXButton butt0;

    @FXML
    private JFXButton buttok;

    @FXML
    private JFXPasswordField pinn;
    
    @FXML
    void pencet0(ActionEvent event) {
        pin += "0";
        pinn.setText(pin);
    }

    @FXML
    void pencet1(ActionEvent event) {
        pin += "1";
        pinn.setText(pin);
    }

    @FXML
    void pencet2(ActionEvent event) {
        pin += "2";
        pinn.setText(pin);
    }

    @FXML
    void pencet3(ActionEvent event) {
        pin += "3";
        pinn.setText(pin);
    }

    @FXML
    void pencet4(ActionEvent event) {
        pin += "4";
        pinn.setText(pin);
    }

    @FXML
    void pencet5(ActionEvent event) {
        pin += "5";
        pinn.setText(pin);
    }

    @FXML
    void pencet6(ActionEvent event) {
        pin += "6";
        pinn.setText(pin);
    }

    @FXML
    void pencet7(ActionEvent event) {
        pin += "7";
        pinn.setText(pin);
    }

    @FXML
    void pencet8(ActionEvent event) {
        pin += "8";
        pinn.setText(pin);
    }

    @FXML
    void pencet9(ActionEvent event) {
        pin += "9";
        pinn.setText(pin);
    }

    @FXML
    void pencetc(ActionEvent event) {
        pin += "";
        pinn.setText(pin);
    }

    @FXML
    void submit(ActionEvent event) throws IOException {
        if (pin.equals(PIN)) {
            try {
                ((Node)(event.getSource())).getScene().getWindow().hide();
                FXMLLoader fxmlLoader = new FXMLLoader();
                fxmlLoader.setLocation(getClass().getResource("FXMLMenuAwal.fxml"));
                Scene scene = new Scene(fxmlLoader.load(), 830, 450);
                Stage stage = new Stage();
                stage.setScene(scene);
                stage.setTitle("MenuAwal");
                stage.show();
            } catch (IOException e) {
                System.out.println("Failed to create new Window." + e);
            }
        } else {
            kesempatan -= 1;
            JOptionPane.showMessageDialog(null, "PIN salah \nTersisa " + kesempatan + " kesempatan lagi !");
            pinn.setText("");
            pin = "";
            if (kesempatan == 0) {
                System.exit(0);
            }
        }
    }


    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
