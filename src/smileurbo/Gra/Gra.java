/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smileurbo.Gra;

import java.util.ArrayList;
import java.util.List;
import javafx.collections.FXCollections;
import javafx.collections.ListChangeListener;
import javafx.collections.ObservableList;
import smileurbo.Budynki_i_Eventy.Eventy.ZakazSportowWodnychNaJeziorze;
import smileurbo.Budynki_i_Eventy.Eventy.ZakazUzywaniaPestycydow;
import smileurbo.Budynki_i_Eventy.Hotel;
import smileurbo.Miasto.Miasto;
import smileurbo.Postaci.Inwestor;
import smileurbo.Postaci.Postac;
import smileurbo.Tereny.Teren;

/**
 *
 * @author katan
 */
public class Gra {

    private List<Postac> listaPostaci;
    private Miasto miasto;
    private ObservableList<Postac> obsListaPostaci;
    private List<Decyzja> listaDecyzjiWTurze;
    private ObservableList<Decyzja> obsListaDecyzjiWTurze;

    private int nrTury;
    private int ileTur;

    private boolean czySkonczonaTura = false;

    public Gra() {
        this.miasto = new Miasto();
        this.listaPostaci = new ArrayList();
        this.obsListaPostaci = FXCollections.observableArrayList(listaPostaci);
        this.listaDecyzjiWTurze = new ArrayList();
        this.obsListaDecyzjiWTurze = FXCollections.observableArrayList(listaDecyzjiWTurze);

        this.nrTury = 1;
        this.ileTur = 3;

    }

    public void Rozgrywka() {
        if (this.getNrTury() == 1) {
            this.dajBudzety(10000, 10000);
            //trzeba wybudować hotel
            this.getObsListaDecyzjiWTurze().add(new Decyzja(new Hotel(), "Budowa hotelu inwestora"));
            this.getObsListaDecyzjiWTurze().add(new Decyzja(new ZakazUzywaniaPestycydow(), "Zakaz używania pestycydów"));
            this.getObsListaDecyzjiWTurze().add(new Decyzja(new ZakazSportowWodnychNaJeziorze(), "Zakaz sportów wodnych na jeziorze"));
        } else {

        }
        this.setNrTury(this.getNrTury() + 1);
    }

    public void dajBudzety(int budzetGminy, int budzetInwestora) {
        this.getMiasto().setBudzetGminy(budzetGminy);
        for (Postac postac : this.getObsListaPostaci()) {
            if (postac instanceof Inwestor) {
                System.out.println("Mam inwestora");
                System.out.println(((Inwestor) postac).toString());
                ((Inwestor) postac).setBudzetInwestora(budzetInwestora);
            }
        }
    }

    /**
     * @return the listaPostaci
     */
    public List<Postac> getListaPostaci() {
        return listaPostaci;
    }

    /**
     * @param listaPostaci the listaPostaci to set
     */
    public void setListaPostaci(List<Postac> listaPostaci) {
        this.listaPostaci = listaPostaci;
    }

    /**
     * @return the miasto
     */
    public Miasto getMiasto() {
        return miasto;
    }

    /**
     * @param miasto the miasto to set
     */
    public void setMiasto(Miasto miasto) {
        this.miasto = miasto;
    }

    /**
     * @return the obsListaPostaci
     */
    public ObservableList<Postac> getObsListaPostaci() {
        return obsListaPostaci;
    }

    /**
     * @param obsListaPostaci the obsListaPostaci to set
     */
    public void setObsListaPostaci(ObservableList<Postac> obsListaPostaci) {
        this.obsListaPostaci = obsListaPostaci;
    }

    /**
     * @return the nrTury
     */
    public int getNrTury() {
        return nrTury;
    }

    /**
     * @param nrTury the nrTury to set
     */
    public void setNrTury(int nrTury) {
        this.nrTury = nrTury;
    }

    /**
     * @return the ileTur
     */
    public int getIleTur() {
        return ileTur;
    }

    /**
     * @param ileTur the ileTur to set
     */
    public void setIleTur(int ileTur) {
        this.ileTur = ileTur;
    }

    /**
     * @return the listaDecyzjiWTurze
     */
    public List<Decyzja> getListaDecyzjiWTurze() {
        return listaDecyzjiWTurze;
    }

    /**
     * @param listaDecyzjiWTurze the listaDecyzjiWTurze to set
     */
    public void setListaDecyzjiWTurze(List<Decyzja> listaDecyzjiWTurze) {
        this.listaDecyzjiWTurze = listaDecyzjiWTurze;
    }

    /**
     * @return the obsListaDecyzjiWTurze
     */
    public ObservableList<Decyzja> getObsListaDecyzjiWTurze() {
        return obsListaDecyzjiWTurze;
    }

    /**
     * @param obsListaDecyzjiWTurze the obsListaDecyzjiWTurze to set
     */
    public void setObsListaDecyzjiWTurze(ObservableList<Decyzja> obsListaDecyzjiWTurze) {
        this.obsListaDecyzjiWTurze = obsListaDecyzjiWTurze;
    }

    /**
     * @return the czySkonczonaTura
     */
    public boolean isCzySkonczonaTura() {
        return czySkonczonaTura;
    }

    /**
     * @param czySkonczonaTura the czySkonczonaTura to set
     */
    public void setCzySkonczonaTura(boolean czySkonczonaTura) {
        this.czySkonczonaTura = czySkonczonaTura;
    }
}
