/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanprojectjavafx;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

/**
 *
 * @author AsFx
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label label;
    
    @FXML
    private Button buttonOke;

    @FXML
    private TextField editNama;

    @FXML
    private TextField editAlamat;

    @FXML
    private TextField editAbsen;

    @FXML
    private TextArea keterangan;
    
    @FXML
    void proses(ActionEvent event) {
        String nama = editNama.getText();
        String alamat = editAlamat.getText();
        String absen = editAbsen.getText();
        
        keterangan.setText("Nama Siswa " + nama + "\n" + "Alamat Siswa " + alamat + "\n" + "Absen Siswa " + absen);
    }

    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
