package com.example.alakzat;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;

import java.util.List;

public class HelloController {
    @FXML private Label welcomeText;
    @FXML ToggleGroup szinek;
    @FXML ToggleGroup alakzatok;
    @FXML public RadioButton rb_piros;
    @FXML public RadioButton rb_zold;
    @FXML public RadioButton rb_kek;
    @FXML public RadioButton rb_negyzet;
    @FXML public RadioButton rb_kor;
    @FXML public RadioButton rb_haromszog;
    @FXML public Button b_hozzaad;
    @FXML public Button b_torol;
    @FXML public Button b_mentes;
    @FXML public ImageView iv_terulet;
    @FXML public ListView lv_lista;

    public void initialitze() {
        rb_piros.setSelected(true);
        rb_negyzet.setSelected(true);


    }

    public void torles(ActionEvent actionEvent) {

    }

    public void mentes(ActionEvent actionEvent) {
    }

    public void hozzaadas(ActionEvent actionEvent) {

        Toggle kiv1 = szinek.getSelectedToggle();
        String szin = kiv1.getUserData().toString();
        System.out.println(szin);
        Toggle kiv2 = alakzatok.getSelectedToggle();
        String alakzat = kiv2.getUserData().toString();
        System.out.println(alakzat);

    }
}