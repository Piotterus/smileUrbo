/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smileurbo.Miasto;

import java.util.ArrayList;
import java.util.List;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import smileurbo.Budynki_i_Eventy.*;
import smileurbo.Budynki_i_Eventy.Eventy.Eventy;
import smileurbo.Budynki_i_Eventy.Eventy.OrganizacjaWiejskichDozynek;
import smileurbo.Budynki_i_Eventy.Eventy.ZakazHandluWNiedziele;
import smileurbo.Budynki_i_Eventy.Eventy.ZakazSportowWodnychNaJeziorze;
import smileurbo.Budynki_i_Eventy.Eventy.ZakazSzczepionek;
import smileurbo.Budynki_i_Eventy.Eventy.ZakazUzywaniaPestycydow;
import smileurbo.Tereny.Teren;

/**
 *
 * @author katan
 */
public class Miasto {
    
    private int poziomBezrobocia; //niskie
    private int poziomZanieczyszczen; // niskie
    private int umieralnoscNoworodkow; //niskie
    private int oczekiwanaDlugoscZycia; //wysoka
    private int kosztyZycia; //niskie
    private int niezaleznoscZywieniowa; //wysoka
    
    private int budzetGminy;

    private static int MAXWARTOSC = 10;
    private static int MINWARTOSC = 0;
    private static int NISKAWARTOSC = 2;
    private static int WYSOKAWARTOSC = 8;
    
    private List<Budynek> listaBudynkow;
    private List<Eventy> listaEventow;
    private List<Teren> listaTerenow;
    private List<Class<? extends Budynek>> listaPotencjalnychBudynkow;
    private List<Class<? extends Eventy>> listaPotencjalnychEventow;
    
    private ObservableList<Budynek> obsListaBudynkow;
    private ObservableList<Eventy> obsListaEventow;
    private ObservableList<Teren> obsListaTerenow;
    private ObservableList<Class<? extends Budynek>> obsListaPotencjalnychBudynkow;
    private ObservableList<Class<? extends Eventy>> obsListaPotencjalnychEventow;
    
    public Miasto() {
        this.poziomBezrobocia = (MAXWARTOSC - MINWARTOSC)/2;
        this.poziomZanieczyszczen = (MAXWARTOSC - MINWARTOSC)/2;
        this.umieralnoscNoworodkow = (MAXWARTOSC - MINWARTOSC)/2;
        this.oczekiwanaDlugoscZycia = (MAXWARTOSC - MINWARTOSC)/2;
        this.kosztyZycia = (MAXWARTOSC - MINWARTOSC)/2;
        this.niezaleznoscZywieniowa = (MAXWARTOSC - MINWARTOSC)/2;
        
        this.listaBudynkow = new ArrayList<>();
        this.listaEventow = new ArrayList<>();
        this.listaTerenow = new ArrayList<>();
        this.listaPotencjalnychBudynkow = new ArrayList<>();
        this.listaPotencjalnychEventow = new ArrayList<>();
        this.stworzListyBudynkowiEventow();
        
        this.obsListaBudynkow = FXCollections.observableArrayList(listaBudynkow);
        this.obsListaEventow = FXCollections.observableArrayList(listaEventow);
        this.obsListaTerenow = FXCollections.observableArrayList(listaTerenow);
        this.obsListaPotencjalnychBudynkow = FXCollections.observableArrayList(listaPotencjalnychBudynkow);
        this.obsListaPotencjalnychEventow = FXCollections.observableArrayList(listaPotencjalnychEventow);
    }
    
    public Miasto(int bezrobocie, int zanieczyszczenia, int umieralnoscNoworodkow, int dlugoscZycia, int kosztyZycia, int niezaleznoscZywieniowa) {
        this.poziomBezrobocia = bezrobocie;
        this.poziomZanieczyszczen = zanieczyszczenia;
        this.umieralnoscNoworodkow = umieralnoscNoworodkow;
        this.oczekiwanaDlugoscZycia = dlugoscZycia;
        this.kosztyZycia = kosztyZycia;
        this.niezaleznoscZywieniowa = niezaleznoscZywieniowa;
        
        this.listaBudynkow = new ArrayList<>();
        this.listaEventow = new ArrayList<>();
        this.listaTerenow = new ArrayList<>();
    }

    private void stworzListyBudynkowiEventow() {
        this.getListaPotencjalnychBudynkow().add(DrogaDojazdowa.class);
        this.getListaPotencjalnychBudynkow().add(GabinetLekarski.class);
        this.getListaPotencjalnychBudynkow().add(Hotel.class);
        this.getListaPotencjalnychBudynkow().add(Market.class);
        this.getListaPotencjalnychBudynkow().add(Plywalnia.class);
        this.getListaPotencjalnychBudynkow().add(PoleGolfowe.class);
        this.getListaPotencjalnychBudynkow().add(PomnikOjcowZalozycieli.class);
        this.getListaPotencjalnychBudynkow().add(PunktTurystyczny.class);
        this.getListaPotencjalnychBudynkow().add(StadninaKoni.class);
        this.getListaPotencjalnychBudynkow().add(Szpital.class);
        
        
        this.getListaPotencjalnychEventow().add(OrganizacjaWiejskichDozynek.class);
        this.getListaPotencjalnychEventow().add(ZakazHandluWNiedziele.class);
        this.getListaPotencjalnychEventow().add(ZakazSportowWodnychNaJeziorze.class);
        this.getListaPotencjalnychEventow().add(ZakazSzczepionek.class);
        this.getListaPotencjalnychEventow().add(ZakazUzywaniaPestycydow.class);
    }
    
    public void dodajTeren(Teren teren) {
        this.getListaTerenow().add(teren);
    }
    
    public void zorganizujEvent(Eventy event) {
        this.getListaEventow().add(event);
        this.aktualizujPunkty(event);
    }
    
    public void wybudujBudynek(Budynek budynek, Teren teren) {
        this.getListaBudynkow().add(budynek);
        teren.setCzyZajety(true);
        this.aktualizujPunkty(budynek);
    }
    
    public void aktualizujPunkty(Budynek budynek) {     
        this.setPoziomBezrobocia(this.getPoziomBezrobocia() + budynek.getModyfikatorPoziomuBezrobocia());
        this.setPoziomZanieczyszczen(this.getPoziomZanieczyszczen() + budynek.getModyfikatorPoziomuZanieczyszczen());
        this.setOczekiwanaDlugoscZycia(this.getOczekiwanaDlugoscZycia() + budynek.getModyfikatorOczekiwanejDlugosciZycia());
        this.setKosztyZycia(this.getKosztyZycia() + budynek.getModyfikatorKosztowZycia());
        this.setUmieralnoscNoworodkow(this.getUmieralnoscNoworodkow() + budynek.getModyfikatorUmieralnosciNoworodkow());
        this.setNiezaleznoscZywieniowa(this.getNiezaleznoscZywieniowa() + budynek.getModyfikatorNiezaleznosciZywieniowej());        
    }
    
    public void aktualizujPunkty(Eventy event) {     
        this.setPoziomBezrobocia(this.getPoziomBezrobocia() + event.getModyfikatorPoziomuBezrobocia());
        this.setPoziomZanieczyszczen(this.getPoziomZanieczyszczen() + event.getModyfikatorPoziomuZanieczyszczen());
        this.setOczekiwanaDlugoscZycia(this.getOczekiwanaDlugoscZycia() + event.getModyfikatorOczekiwanejDlugosciZycia());
        this.setKosztyZycia(this.getKosztyZycia() + event.getModyfikatorKosztowZycia());
        this.setUmieralnoscNoworodkow(this.getUmieralnoscNoworodkow() + event.getModyfikatorUmieralnosciNoworodkow());
        this.setNiezaleznoscZywieniowa(this.getNiezaleznoscZywieniowa() + event.getModyfikatorNiezaleznosciZywieniowej());        
    }
    /**
     * @return the poziomBezrobocia
     */
    public int getPoziomBezrobocia() {
        return poziomBezrobocia;
    }

    /**
     * @param poziomBezrobocia the poziomBezrobocia to set
     */
    public void setPoziomBezrobocia(int poziomBezrobocia) {
        this.poziomBezrobocia = poziomBezrobocia;
    }

    /**
     * @return the poziomZanieczyszczen
     */
    public int getPoziomZanieczyszczen() {
        return poziomZanieczyszczen;
    }

    /**
     * @param poziomZanieczyszczen the poziomZanieczyszczen to set
     */
    public void setPoziomZanieczyszczen(int poziomZanieczyszczen) {
        this.poziomZanieczyszczen = poziomZanieczyszczen;
    }

    /**
     * @return the umieralnoscNoworodkow
     */
    public int getUmieralnoscNoworodkow() {
        return umieralnoscNoworodkow;
    }

    /**
     * @param umieralnoscNoworodkow the umieralnoscNoworodkow to set
     */
    public void setUmieralnoscNoworodkow(int umieralnoscNoworodkow) {
        this.umieralnoscNoworodkow = umieralnoscNoworodkow;
    }

    /**
     * @return the oczekiwanaDlugoscZycia
     */
    public int getOczekiwanaDlugoscZycia() {
        return oczekiwanaDlugoscZycia;
    }

    /**
     * @param oczekiwanaDlugoscZycia the oczekiwanaDlugoscZycia to set
     */
    public void setOczekiwanaDlugoscZycia(int oczekiwanaDlugoscZycia) {
        this.oczekiwanaDlugoscZycia = oczekiwanaDlugoscZycia;
    }

    /**
     * @return the kosztyZycia
     */
    public int getKosztyZycia() {
        return kosztyZycia;
    }

    /**
     * @param kosztyZycia the kosztyZycia to set
     */
    public void setKosztyZycia(int kosztyZycia) {
        this.kosztyZycia = kosztyZycia;
    }

    /**
     * @return the niezaleznoscZywieniowa
     */
    public int getNiezaleznoscZywieniowa() {
        return niezaleznoscZywieniowa;
    }

    /**
     * @param niezaleznoscZywieniowa the niezaleznoscZywieniowa to set
     */
    public void setNiezaleznoscZywieniowa(int niezaleznoscZywieniowa) {
        this.niezaleznoscZywieniowa = niezaleznoscZywieniowa;
    }

    /**
     * @return the MAXWARTOSC
     */
    public static int getMAXWARTOSC() {
        return MAXWARTOSC;
    }

    /**
     * @param aMAXWARTOSC the MAXWARTOSC to set
     */
    public static void setMAXWARTOSC(int aMAXWARTOSC) {
        MAXWARTOSC = aMAXWARTOSC;
    }

    /**
     * @return the MINWARTOSC
     */
    public static int getMINWARTOSC() {
        return MINWARTOSC;
    }

    /**
     * @param aMINWARTOSC the MINWARTOSC to set
     */
    public static void setMINWARTOSC(int aMINWARTOSC) {
        MINWARTOSC = aMINWARTOSC;
    }

    /**
     * @return the NISKAWARTOSC
     */
    public static int getNISKAWARTOSC() {
        return NISKAWARTOSC;
    }

    /**
     * @param aNISKAWARTOSC the NISKAWARTOSC to set
     */
    public static void setNISKAWARTOSC(int aNISKAWARTOSC) {
        NISKAWARTOSC = aNISKAWARTOSC;
    }

    /**
     * @return the WYSOKAWARTOSC
     */
    public static int getWYSOKAWARTOSC() {
        return WYSOKAWARTOSC;
    }

    /**
     * @param aWYSOKAWARTOSC the WYSOKAWARTOSC to set
     */
    public static void setWYSOKAWARTOSC(int aWYSOKAWARTOSC) {
        WYSOKAWARTOSC = aWYSOKAWARTOSC;
    }

    /**
     * @return the listaBudynkow
     */
    public List<Budynek> getListaBudynkow() {
        return listaBudynkow;
    }

    /**
     * @param listaBudynkow the listaBudynkow to set
     */
    public void setListaBudynkow(List<Budynek> listaBudynkow) {
        this.listaBudynkow = listaBudynkow;
    }

    /**
     * @return the listaEventow
     */
    public List<Eventy> getListaEventow() {
        return listaEventow;
    }

    /**
     * @param listaEventow the listaEventow to set
     */
    public void setListaEventow(List<Eventy> listaEventow) {
        this.listaEventow = listaEventow;
    }

    /**
     * @return the listaTerenow
     */
    public List<Teren> getListaTerenow() {
        return listaTerenow;
    }

    /**
     * @param listaTerenow the listaTerenow to set
     */
    public void setListaTerenow(List<Teren> listaTerenow) {
        this.listaTerenow = listaTerenow;
    }

    /**
     * @return the obsListaBudynkow
     */
    public ObservableList<Budynek> getObsListaBudynkow() {
        return obsListaBudynkow;
    }

    /**
     * @param obsListaBudynkow the obsListaBudynkow to set
     */
    public void setObsListaBudynkow(ObservableList<Budynek> obsListaBudynkow) {
        this.obsListaBudynkow = obsListaBudynkow;
    }

    /**
     * @return the obsListaEventow
     */
    public ObservableList<Eventy> getObsListaEventow() {
        return obsListaEventow;
    }

    /**
     * @param obsListaEventow the obsListaEventow to set
     */
    public void setObsListaEventow(ObservableList<Eventy> obsListaEventow) {
        this.obsListaEventow = obsListaEventow;
    }

    /**
     * @return the obsListaTerenow
     */
    public ObservableList<Teren> getObsListaTerenow() {
        return obsListaTerenow;
    }

    /**
     * @param obsListaTerenow the obsListaTerenow to set
     */
    public void setObsListaTerenow(ObservableList<Teren> obsListaTerenow) {
        this.obsListaTerenow = obsListaTerenow;
    }

    /**
     * @return the listaPotencjalnychBudynkow
     */
    public List<Class<? extends Budynek>> getListaPotencjalnychBudynkow() {
        return listaPotencjalnychBudynkow;
    }

    /**
     * @param listaPotencjalnychBudynkow the listaPotencjalnychBudynkow to set
     */
    public void setListaPotencjalnychBudynkow(List<Class<? extends Budynek>> listaPotencjalnychBudynkow) {
        this.listaPotencjalnychBudynkow = listaPotencjalnychBudynkow;
    }

    /**
     * @return the listaPotencjalnychEventow
     */
    public List<Class<? extends Eventy>> getListaPotencjalnychEventow() {
        return listaPotencjalnychEventow;
    }

    /**
     * @param listaPotencjalnychEventow the listaPotencjalnychEventow to set
     */
    public void setListaPotencjalnychEventow(List<Class<? extends Eventy>> listaPotencjalnychEventow) {
        this.listaPotencjalnychEventow = listaPotencjalnychEventow;
    }

    /**
     * @return the obsListaPotencjalnychBudynkow
     */
    public ObservableList<Class<? extends Budynek>> getObsListaPotencjalnychBudynkow() {
        return obsListaPotencjalnychBudynkow;
    }

    /**
     * @param obsListaPotencjalnychBudynkow the obsListaPotencjalnychBudynkow to set
     */
    public void setObsListaPotencjalnychBudynkow(ObservableList<Class<? extends Budynek>> obsListaPotencjalnychBudynkow) {
        this.obsListaPotencjalnychBudynkow = obsListaPotencjalnychBudynkow;
    }

    /**
     * @return the obsListaPotencjalnychEventow
     */
    public ObservableList<Class<? extends Eventy>> getObsListaPotencjalnychEventow() {
        return obsListaPotencjalnychEventow;
    }

    /**
     * @param obsListaPotencjalnychEventow the obsListaPotencjalnychEventow to set
     */
    public void setObsListaPotencjalnychEventow(ObservableList<Class<? extends Eventy>> obsListaPotencjalnychEventow) {
        this.obsListaPotencjalnychEventow = obsListaPotencjalnychEventow;
    }

    /**
     * @return the budzetGminy
     */
    public int getBudzetGminy() {
        return budzetGminy;
    }

    /**
     * @param budzetGminy the budzetGminy to set
     */
    public void setBudzetGminy(int budzetGminy) {
        this.budzetGminy = budzetGminy;
    }

   
}