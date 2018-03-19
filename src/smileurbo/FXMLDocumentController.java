/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smileurbo;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import javafx.beans.property.ListProperty;
import javafx.beans.property.SimpleListProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.MenuItem;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import smileurbo.Budynki_i_Eventy.Hotel;
import smileurbo.Gra.Decyzja;
import smileurbo.Gra.Gra;
import smileurbo.Postaci.*;
import smileurbo.Tereny.Teren;
import smileurbo.enums.Wielkosc;

public class FXMLDocumentController implements Initializable {

    @FXML
    private TabPane tabPanePanel;

    @FXML
    private Tab tabGra;

    @FXML
    private MenuItem menuStworzGre;

    @FXML
    private MenuItem menuRozpocznijGre;

    @FXML
    private MenuItem menuZakonczGre;

    @FXML
    private MenuItem menuPomoc;

    @FXML
    private ListView<Postac> listListaPostaci;

    @FXML
    private ComboBox<?> comboDodajPostać;

    @FXML
    private TextField textImiePostaci;

    @FXML
    private Button buttonDodajPostac;

    @FXML
    private Tab tabWioska;

    @FXML
    private Label labelTura;

    @FXML
    private Label labelPoziomBezrobocia;

    @FXML
    private Label labelPoziomZanieczyszczen;

    @FXML
    private Label labelUmieralnoscNoworodkow;

    @FXML
    private Label labelOczekiwanaDlugoscZycia;

    @FXML
    private Label labelKosztyZycia;

    @FXML
    private Label labelNiezaleznoscZywieniowa;

    @FXML
    private Tab tabZebranie;

    @FXML
    private ComboBox<Decyzja> comboDecyzje;

    @FXML
    private Button buttonDecyzje;

    @FXML
    private Label labelDecyzja;

    @FXML
    private ComboBox<Wielkosc> comboWielkosc;

    @FXML
    private ComboBox<Teren> comboDecyzjaTeren;

    @FXML
    private Label labelBudzetGminy;

    @FXML
    private Label labelBudzetInwestora;

    @FXML
    private Tab tabPostaci;

    @FXML
    private Label labelPostac;

    @FXML
    private ComboBox<?> comboWybierzPostac;

    @FXML
    private Label labelPunktyPostaci;

    @FXML
    private Button buttonUsunPostac;

    @FXML
    private Button buttonDodajTeren;

    @FXML
    private CheckBox checkBliskoCentrum;

    @FXML
    private CheckBox checkZyznaGleba;

    @FXML
    private CheckBox checkLadneWidoki;

    @FXML
    private CheckBox checkBliskoKosciola;

    @FXML
    private CheckBox checkPrzyJeziorze;

    @FXML
    private CheckBox checkPrzyDrodze;

    @FXML
    private ComboBox<Teren> comboTereny;

    @FXML
    private TextArea textTereny;

    Gra gra;

    ListProperty<Postac> listPropertyListaPostaci = new SimpleListProperty<>();
    ListProperty<Teren> listPropertyListaTerenow = new SimpleListProperty<>();
    ListProperty<Decyzja> listPropertyDecyzji = new SimpleListProperty<>();
    ListProperty<Teren> listPropertyDecyzjaTeren = new SimpleListProperty<>();
    //ListProperty<Wielkosc> listPropertyWielkosci = new SimpleListProperty<>();

    @FXML
    void DodajPostac(ActionEvent event) {
        if (comboDodajPostać.getSelectionModel().getSelectedItem() == DyrektorSzkoly.NAZWA) {
            System.out.println(this.textImiePostaci.getText());
            gra.getObsListaPostaci().add(new DyrektorSzkoly(this.textImiePostaci.getText()));
        } else if (comboDodajPostać.getSelectionModel().getSelectedItem() == Inwestor.getNAZWA()) {
            gra.getObsListaPostaci().add(new Inwestor(this.textImiePostaci.getText()));
        } else if (comboDodajPostać.getSelectionModel().getSelectedItem() == NWO.NAZWA) {
            gra.getObsListaPostaci().add(new NWO(this.textImiePostaci.getText()));
        } else if (comboDodajPostać.getSelectionModel().getSelectedItem() == NowoczesnyRolnik.NAZWA) {
            gra.getObsListaPostaci().add(new NowoczesnyRolnik(this.textImiePostaci.getText()));
        } else if (comboDodajPostać.getSelectionModel().getSelectedItem() == PrzewodnikDuchowy.NAZWA) {
            gra.getObsListaPostaci().add(new PrzewodnikDuchowy(this.textImiePostaci.getText()));
        } else if (comboDodajPostać.getSelectionModel().getSelectedItem() == Rybak.NAZWA) {
            gra.getObsListaPostaci().add(new Rybak(this.textImiePostaci.getText()));
        } else if (comboDodajPostać.getSelectionModel().getSelectedItem() == Sprzedawca.NAZWA) {
            gra.getObsListaPostaci().add(new Sprzedawca(this.textImiePostaci.getText()));
        } else if (comboDodajPostać.getSelectionModel().getSelectedItem() == TradycyjnyRolnik.NAZWA) {
            gra.getObsListaPostaci().add(new TradycyjnyRolnik(this.textImiePostaci.getText()));
        } else if (comboDodajPostać.getSelectionModel().getSelectedItem() == WojtGminy.NAZWA) {
            gra.getObsListaPostaci().add(new WojtGminy(this.textImiePostaci.getText()));
        }

    }

    @FXML
    void DodajTeren(ActionEvent event) {
        this.gra.getMiasto().getObsListaTerenow().add(new Teren(checkBliskoCentrum.isSelected(), checkZyznaGleba.isSelected(),
                checkLadneWidoki.isSelected(), checkBliskoKosciola.isSelected(), checkPrzyJeziorze.isSelected(), checkPrzyDrodze.isSelected()));
    }

    @FXML
    void WybierzTeren(ActionEvent event) {
        this.textTereny.setText(this.comboTereny.getSelectionModel().getSelectedItem().pelneInfo());
    }

    @FXML
    void PodejmijDecyzje(ActionEvent event) {
        Decyzja decyzja = this.comboDecyzje.getValue();
        if (decyzja.getEvent() == null) {
            if (decyzja.getBudynek().getClass() == Hotel.class) {
                System.out.println("Decyzja o hotelu");
                gra.getMiasto().getObsListaBudynkow().add(new Hotel(this.comboWielkosc.getValue()));
                this.labelDecyzja.setText("");
                gra.getObsListaDecyzjiWTurze().remove(decyzja);
            }
        }
        this.comboWielkosc.setDisable(true);
        this.comboDecyzjaTeren.setDisable(true);
    }

    @FXML
    void WybierzDecyzje(ActionEvent event) {
        if (this.comboDecyzje.getSelectionModel().getSelectedItem() != null) {
            this.labelDecyzja.setText(this.comboDecyzje.getSelectionModel().getSelectedItem().toString());
            this.comboWielkosc.setDisable(false);
            this.comboDecyzjaTeren.setDisable(false);
        }
    }

    @FXML
    void Pomoc(ActionEvent event) {

    }

    @FXML
    void StworzGre(ActionEvent event) {
        gra = new Gra();
        this.ustawAktywnosc(true);
        listPropertyListaPostaci.set(this.gra.getObsListaPostaci());
        listPropertyListaTerenow.set(gra.getMiasto().getObsListaTerenow());
        listPropertyDecyzji.set(gra.getObsListaDecyzjiWTurze());
        listPropertyDecyzjaTeren.set(gra.getMiasto().getObsListaTerenow());
    }

    @FXML
    void RozpocznijGre(ActionEvent event) {
        gra.Rozgrywka();
    }

    @FXML
    void WyswietlPunkty(ActionEvent event) {

    }

    @FXML
    void ZakonczGre(ActionEvent event) {

    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        List<String> listaKlasPostaci = new ArrayList();
        listaKlasPostaci.add(DyrektorSzkoly.NAZWA);
        listaKlasPostaci.add(Inwestor.getNAZWA());
        listaKlasPostaci.add(NWO.NAZWA);
        listaKlasPostaci.add(NowoczesnyRolnik.NAZWA);
        listaKlasPostaci.add(Rybak.NAZWA);
        listaKlasPostaci.add(Sprzedawca.NAZWA);
        listaKlasPostaci.add(TradycyjnyRolnik.NAZWA);
        listaKlasPostaci.add(WojtGminy.NAZWA);
        ObservableList obsListaKlasPostaci = FXCollections.observableArrayList(listaKlasPostaci);
        this.comboDodajPostać.setItems(obsListaKlasPostaci);
        this.ustawAktywnosc(false);
        this.listListaPostaci.itemsProperty().bind(listPropertyListaPostaci);
        this.comboTereny.itemsProperty().bind(listPropertyListaTerenow);
        this.comboDecyzje.itemsProperty().bind(listPropertyDecyzji);
        this.comboDecyzjaTeren.itemsProperty().bind(listPropertyDecyzjaTeren);
        //this.listPropertyWielkosci.add(Wielkosc.MALY);
        //this.listPropertyWielkosci.add(Wielkosc.SREDNI);
        //this.listPropertyWielkosci.add(Wielkosc.DUZY);
        this.comboWielkosc.setItems(FXCollections.observableArrayList(Wielkosc.values()));
        this.comboDecyzjaTeren.setDisable(true);
        this.comboWielkosc.setDisable(true);
    }

    public void ustawAktywnosc(boolean bool) {
        this.buttonDodajPostac.setDisable(!bool);
        this.buttonUsunPostac.setDisable(!bool);
        this.comboDodajPostać.setDisable(!bool);
        this.comboWybierzPostac.setDisable(!bool);
        this.menuRozpocznijGre.setDisable(!bool);
    }

}
