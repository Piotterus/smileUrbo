/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smileurbo.Budynki_i_Eventy;

import smileurbo.Postaci.*;

/**
 *
 * @author katan
 */
public class Budynek {
    private String nazwa;
    private int kosztBudowy;
    private int kosztNaTure;
    
    private int modyfikatorPoziomuBezrobocia = 0;
    private int modyfikatorPoziomuZanieczyszczen = 0;
    private int modyfikatorUmieralnosciNoworodkow = 0;
    private int modyfikatorOczekiwanejDlugosciZycia = 0;
    private int modyfikatorKosztowZycia = 0;
    private int modyfikatorNiezaleznosciZywieniowej = 0;
    
    private int punktyDlaDyrektoraSzkoly = 0;
    private int punktyDlaInwestora = 0;
    private int punktyDlaNWO = 0;
    private int punktyDlaNowoczesnegoRolnika = 0;
    private int punktyDlaPrzewodnikaDuchowego = 0;
    private int punktyDlaRybaka = 0;
    private int punktyDlaSprzedawcy = 0;
    private int punktyDlaTradycyjnegoRolnika = 0;
    private int punktyDlaWojtaGminy = 0;
    
    
    public Budynek() {

    }
    
    public int punktyZaBudowe(Postac postac) {
        if(postac instanceof Inwestor) {
            return 5;
        }
        else if(postac instanceof DyrektorSzkoly) {
            return 5;
        }
        else if(postac instanceof Inwestor) {
            return 5;
        }
        else if(postac instanceof Inwestor) {
            return 5;
        }
        else if(postac instanceof Inwestor) {
            return 5;
        }
        return 0;
    }

    /**
     * @return the nazwa
     */
    public String getNazwa() {
        return nazwa;
    }

    /**
     * @param nazwa the nazwa to set
     */
    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    /**
     * @return the kosztBudowy
     */
    public int getKosztBudowy() {
        return kosztBudowy;
    }

    /**
     * @param kosztBudowy the kosztBudowy to set
     */
    public void setKosztBudowy(int kosztBudowy) {
        this.kosztBudowy = kosztBudowy;
    }

    /**
     * @return the kosztNaTure
     */
    public int getKosztNaTure() {
        return kosztNaTure;
    }

    /**
     * @param kosztNaTure the kosztNaTure to set
     */
    public void setKosztNaTure(int kosztNaTure) {
        this.kosztNaTure = kosztNaTure;
    }

    /**
     * @return the modyfikatorPoziomuBezrobocia
     */
    public int getModyfikatorPoziomuBezrobocia() {
        return modyfikatorPoziomuBezrobocia;
    }

    /**
     * @param aModyfikatorPoziomuBezrobocia the modyfikatorPoziomuBezrobocia to set
     */
    public void setModyfikatorPoziomuBezrobocia(int aModyfikatorPoziomuBezrobocia) {
        modyfikatorPoziomuBezrobocia = aModyfikatorPoziomuBezrobocia;
    }

    /**
     * @return the modyfikatorPoziomuZanieczyszczen
     */
    public int getModyfikatorPoziomuZanieczyszczen() {
        return modyfikatorPoziomuZanieczyszczen;
    }

    /**
     * @param aModyfikatorPoziomuZanieczyszczen the modyfikatorPoziomuZanieczyszczen to set
     */
    public void setModyfikatorPoziomuZanieczyszczen(int aModyfikatorPoziomuZanieczyszczen) {
        modyfikatorPoziomuZanieczyszczen = aModyfikatorPoziomuZanieczyszczen;
    }

    /**
     * @return the modyfikatorUmieralnosciNoworodkow
     */
    public int getModyfikatorUmieralnosciNoworodkow() {
        return modyfikatorUmieralnosciNoworodkow;
    }

    /**
     * @param aModyfikatorUmieralnosciNoworodkow the modyfikatorUmieralnosciNoworodkow to set
     */
    public void setModyfikatorUmieralnosciNoworodkow(int aModyfikatorUmieralnosciNoworodkow) {
        modyfikatorUmieralnosciNoworodkow = aModyfikatorUmieralnosciNoworodkow;
    }

    /**
     * @return the modyfikatorOczekiwanejDlugosciZycia
     */
    public int getModyfikatorOczekiwanejDlugosciZycia() {
        return modyfikatorOczekiwanejDlugosciZycia;
    }

    /**
     * @param aModyfikatorOczekiwanejDlugosciZycia the modyfikatorOczekiwanejDlugosciZycia to set
     */
    public void setModyfikatorOczekiwanejDlugosciZycia(int aModyfikatorOczekiwanejDlugosciZycia) {
        modyfikatorOczekiwanejDlugosciZycia = aModyfikatorOczekiwanejDlugosciZycia;
    }

    /**
     * @return the modyfikatorKosztowZycia
     */
    public int getModyfikatorKosztowZycia() {
        return modyfikatorKosztowZycia;
    }

    /**
     * @param aModyfikatorKosztowZycia the modyfikatorKosztowZycia to set
     */
    public void setModyfikatorKosztowZycia(int aModyfikatorKosztowZycia) {
        modyfikatorKosztowZycia = aModyfikatorKosztowZycia;
    }

    /**
     * @return the modyfikatorNiezaleznosciZywieniowej
     */
    public int getModyfikatorNiezaleznosciZywieniowej() {
        return modyfikatorNiezaleznosciZywieniowej;
    }

    /**
     * @param aModyfikatorNiezaleznosciZywieniowej the modyfikatorNiezaleznosciZywieniowej to set
     */
    public void setModyfikatorNiezaleznosciZywieniowej(int aModyfikatorNiezaleznosciZywieniowej) {
        modyfikatorNiezaleznosciZywieniowej = aModyfikatorNiezaleznosciZywieniowej;
    }

    /**
     * @return the punktyDlaDyrektoraSzkoly
     */
    public int getPunktyDlaDyrektoraSzkoly() {
        return punktyDlaDyrektoraSzkoly;
    }

    /**
     * @param punktyDlaDyrektoraSzkoly the punktyDlaDyrektoraSzkoly to set
     */
    public void setPunktyDlaDyrektoraSzkoly(int punktyDlaDyrektoraSzkoly) {
        this.punktyDlaDyrektoraSzkoly = punktyDlaDyrektoraSzkoly;
    }

    /**
     * @return the punktyDlaInwestora
     */
    public int getPunktyDlaInwestora() {
        return punktyDlaInwestora;
    }

    /**
     * @param punktyDlaInwestora the punktyDlaInwestora to set
     */
    public void setPunktyDlaInwestora(int punktyDlaInwestora) {
        this.punktyDlaInwestora = punktyDlaInwestora;
    }

    /**
     * @return the punktyDlaNWO
     */
    public int getPunktyDlaNWO() {
        return punktyDlaNWO;
    }

    /**
     * @param punktyDlaNWO the punktyDlaNWO to set
     */
    public void setPunktyDlaNWO(int punktyDlaNWO) {
        this.punktyDlaNWO = punktyDlaNWO;
    }

    /**
     * @return the punktyDlaNowoczesnegoRolnika
     */
    public int getPunktyDlaNowoczesnegoRolnika() {
        return punktyDlaNowoczesnegoRolnika;
    }

    /**
     * @param punktyDlaNowoczesnegoRolnika the punktyDlaNowoczesnegoRolnika to set
     */
    public void setPunktyDlaNowoczesnegoRolnika(int punktyDlaNowoczesnegoRolnika) {
        this.punktyDlaNowoczesnegoRolnika = punktyDlaNowoczesnegoRolnika;
    }

    /**
     * @return the punktyDlaPrzewodnikaDuchowego
     */
    public int getPunktyDlaPrzewodnikaDuchowego() {
        return punktyDlaPrzewodnikaDuchowego;
    }

    /**
     * @param punktyDlaPrzewodnikaDuchowego the punktyDlaPrzewodnikaDuchowego to set
     */
    public void setPunktyDlaPrzewodnikaDuchowego(int punktyDlaPrzewodnikaDuchowego) {
        this.punktyDlaPrzewodnikaDuchowego = punktyDlaPrzewodnikaDuchowego;
    }

    /**
     * @return the punktyDlaRybaka
     */
    public int getPunktyDlaRybaka() {
        return punktyDlaRybaka;
    }

    /**
     * @param punktyDlaRybaka the punktyDlaRybaka to set
     */
    public void setPunktyDlaRybaka(int punktyDlaRybaka) {
        this.punktyDlaRybaka = punktyDlaRybaka;
    }

    /**
     * @return the punktyDlaSprzedawcy
     */
    public int getPunktyDlaSprzedawcy() {
        return punktyDlaSprzedawcy;
    }

    /**
     * @param punktyDlaSprzedawcy the punktyDlaSprzedawcy to set
     */
    public void setPunktyDlaSprzedawcy(int punktyDlaSprzedawcy) {
        this.punktyDlaSprzedawcy = punktyDlaSprzedawcy;
    }

    /**
     * @return the punktyDlaTradycyjnegoRolnika
     */
    public int getPunktyDlaTradycyjnegoRolnika() {
        return punktyDlaTradycyjnegoRolnika;
    }

    /**
     * @param punktyDlaTradycyjnegoRolnika the punktyDlaTradycyjnegoRolnika to set
     */
    public void setPunktyDlaTradycyjnegoRolnika(int punktyDlaTradycyjnegoRolnika) {
        this.punktyDlaTradycyjnegoRolnika = punktyDlaTradycyjnegoRolnika;
    }

    /**
     * @return the punktyDlaWojtaGminy
     */
    public int getPunktyDlaWojtaGminy() {
        return punktyDlaWojtaGminy;
    }

    /**
     * @param punktyDlaWojtaGminy the punktyDlaWojtaGminy to set
     */
    public void setPunktyDlaWojtaGminy(int punktyDlaWojtaGminy) {
        this.punktyDlaWojtaGminy = punktyDlaWojtaGminy;
    }
}
