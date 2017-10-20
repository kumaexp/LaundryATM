/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanprojectjavafx;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author AsFx
 */
public class FXMLLaundryController implements Initializable {

    @FXML
    private TextField editKembali;

    @FXML
    private TextField editTelp;

    @FXML
    private TextField editBerat;

    @FXML
    private TextField editAlamat;

    @FXML
    private TextField editNama;

    @FXML
    private ToggleGroup pilihanPaket;

    @FXML
    private Button buttonOke;

    @FXML
    private Button buttonHapus;

    @FXML
    private TextArea hasil;
    
    @FXML
    private RadioButton rdCK;
    
    @FXML
    private RadioButton rdCKS;
    
    @FXML
    private RadioButton rdS;

    @FXML
    void hapus(ActionEvent event) {
        editNama.setText("");
        editAlamat.setText("");
        editBerat.setText("");
        editTelp.setText("");
        rdCK.setSelected(false);
        rdCKS.setSelected(false);
        rdS.setSelected(false);
        editKembali.setText("");
    }

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }   

    @FXML
    private void proses(ActionEvent event) {
        String paket = "";
        int harga = 0;
        
        if(rdCK.isSelected())
            paket = "Cuci Kering";
        else if (rdCKS.isSelected())
            paket = "Cuci Kering Setrika";
        else if (rdS.isSelected())
            paket = "Setrika";
        else
            paket = "";
        
        if(!(rdCK.isSelected() || rdCKS.isSelected() || rdS.isSelected() )) {
            JOptionPane.showMessageDialog(null, "Harap pilih paket layanan");
        } else {
            String nama = editNama.getText();
            String alamat = editAlamat.getText();
            String berat = editBerat.getText() + " kg";
            String kembali = editKembali.getText();
            
            int hitung = Integer.parseInt(editBerat.getText());
            
            if(rdCK.isSelected())
                harga = hitung*5000;
            if(rdCKS.isSelected())
                harga = hitung*8000;
            if(rdS.isSelected())
                harga = hitung*4000;
            String telp = editTelp.getText();
            
            hasil.setText("Nama : " + nama + "\n" + "Alamat : " + alamat + "\n" + "Berat Cucian : " + berat + "\n" + "Nomor Telp : " + telp
            + "\n" + "Pilihan Paket : " + paket + "\n" + "Tanggal Kembali : " + kembali + "\n" + "Harga : " + harga);
        }
    }
    
}
