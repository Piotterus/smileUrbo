/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smileurbo.Budynki_i_Eventy;

import smileurbo.enums.Wielkosc;

/**
 *
 * @author katan
 */
public class DrogaDojazdowa  extends Budynek{
    
    private Wielkosc wielkosc;
    
    public static final String NAZWA = "Droga dojazdowa";
    
    public static final int PODSTMODYFIKATOR_POZIOMUBEZROBOCIA = -1;
    public static final int PODSTMODYFIKATOR_POZIOMUZANIECZYSZCZEN = 2;
    public static final int PODSTMODYFIKATOR_UMIERALNOSCINOWORODKOW = 0;
    public static final int PODSTMODYFIKATOR_OCZEKIWANEJDLUGOSCIZYCIA = 0;
    public static final int PODSTMODYFIKATOR_KOSZTOWZYCIA = -1;
    public static final int PODSTMODYFIKATOR_NIEZALEZNOSCIZYWIENIOWEJ = 4;
    
    public static final int KOSZTBUDOWYDUZEGO = 5000;
    public static final int KOSZTBUDOWYSREDNIEGO = 2000;
    public static final int KOSZTBUDOWYMALEGO = 1000;
    
    public static final int PUNKTYDLADYREKTORASZKOLY = 0;
    public static final int PUNKTYDLAINWESTORA = 0;
    public static final int PUNKTYDLANWO = 0;
    public static final int PUNKTYDLANOWOCZESNEGOROLNIKA = 0;
    public static final int PUNKTYDLAPRZEWODNIKADUCHOWEGO = 0;
    public static final int PUNKTYDLARYBAKA = 0;
    public static final int PUNKTYDLASPRZEDAWCY = 0;
    public static final int PUNKTYDLATRADYCYJNEGOROLNIKA = 0;
    public static final int PUNKTYDLAWOJTAGMINY = 0;
    
    public DrogaDojazdowa() {
        
    }
    
    public DrogaDojazdowa(Wielkosc wielkosc) {
        super.setNazwa(NAZWA);
        this.wielkosc = wielkosc;
        this.ustalKosztBudowy();
        this.ustalModyfikatory();
        this.ustalPunkty();
    }
    
    private void ustalPunkty() {
        super.setPunktyDlaDyrektoraSzkoly(PUNKTYDLADYREKTORASZKOLY);
        super.setPunktyDlaInwestora(PUNKTYDLAINWESTORA);
        super.setPunktyDlaNWO(PUNKTYDLANWO);
        super.setPunktyDlaNowoczesnegoRolnika(PUNKTYDLANOWOCZESNEGOROLNIKA);
        super.setPunktyDlaPrzewodnikaDuchowego(PUNKTYDLAPRZEWODNIKADUCHOWEGO);
        super.setPunktyDlaRybaka(PUNKTYDLARYBAKA);
        super.setPunktyDlaSprzedawcy(PUNKTYDLASPRZEDAWCY);
        super.setPunktyDlaTradycyjnegoRolnika(PUNKTYDLATRADYCYJNEGOROLNIKA);
        super.setPunktyDlaWojtaGminy(PUNKTYDLAWOJTAGMINY);
    }
    
    private void ustalModyfikatory() {
        switch (this.getWielkosc()) {
            case DUZY:
                super.setModyfikatorPoziomuBezrobocia(PODSTMODYFIKATOR_POZIOMUBEZROBOCIA);
                super.setModyfikatorPoziomuZanieczyszczen(PODSTMODYFIKATOR_POZIOMUZANIECZYSZCZEN);
                super.setModyfikatorKosztowZycia(PODSTMODYFIKATOR_KOSZTOWZYCIA);
                super.setModyfikatorNiezaleznosciZywieniowej(PODSTMODYFIKATOR_NIEZALEZNOSCIZYWIENIOWEJ);
                super.setModyfikatorOczekiwanejDlugosciZycia(PODSTMODYFIKATOR_OCZEKIWANEJDLUGOSCIZYCIA);
                super.setModyfikatorUmieralnosciNoworodkow(PODSTMODYFIKATOR_UMIERALNOSCINOWORODKOW);
                break;
            case SREDNI:
                super.setKosztBudowy(KOSZTBUDOWYSREDNIEGO);
                break;
            case MALY:
                super.setKosztBudowy(KOSZTBUDOWYMALEGO);
                break;
        }
    }
    
    private void ustalKosztBudowy() {
        switch (this.getWielkosc()) {
            case DUZY:
                super.setKosztBudowy(KOSZTBUDOWYDUZEGO);
                break;
            case SREDNI:
                super.setKosztBudowy(KOSZTBUDOWYSREDNIEGO);
                break;
            case MALY:
                super.setKosztBudowy(KOSZTBUDOWYMALEGO);
                break;
        }
    }

    /**
     * @return the wielkosc
     */
    public Wielkosc getWielkosc() {
        return wielkosc;
    }

    /**
     * @param wielkosc the wielkosc to set
     */
    public void setWielkosc(Wielkosc wielkosc) {
        this.wielkosc = wielkosc;
    }
}
