/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smileurbo.Budynki_i_Eventy;

/**
 *
 * @author katan
 */
public class PomnikOjcowZalozycieli extends Budynek {
    
    public static final String NAZWA = "Pomnik ojców zalożycieli";

    public static final int PODSTMODYFIKATOR_POZIOMUBEZROBOCIA = 1;
    public static final int PODSTMODYFIKATOR_POZIOMUZANIECZYSZCZEN = 1;
    public static final int PODSTMODYFIKATOR_UMIERALNOSCINOWORODKOW = 0;
    public static final int PODSTMODYFIKATOR_OCZEKIWANEJDLUGOSCIZYCIA = 0;
    public static final int PODSTMODYFIKATOR_KOSZTOWZYCIA = 1;
    public static final int PODSTMODYFIKATOR_NIEZALEZNOSCIZYWIENIOWEJ = 0;

    public static final int KOSZTBUDOWY = 1000;
    
    public static final int PUNKTYDLADYREKTORASZKOLY = 0;
    public static final int PUNKTYDLAINWESTORA = 0;
    public static final int PUNKTYDLANWO = 0;
    public static final int PUNKTYDLANOWOCZESNEGOROLNIKA = 0;
    public static final int PUNKTYDLAPRZEWODNIKADUCHOWEGO = 0;
    public static final int PUNKTYDLARYBAKA = 0;
    public static final int PUNKTYDLASPRZEDAWCY = 0;
    public static final int PUNKTYDLATRADYCYJNEGOROLNIKA = 0;
    public static final int PUNKTYDLAWOJTAGMINY = 0;

    public PomnikOjcowZalozycieli() {
        super.setNazwa(NAZWA);
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
        super.setModyfikatorPoziomuBezrobocia(PODSTMODYFIKATOR_POZIOMUBEZROBOCIA);
        super.setModyfikatorPoziomuZanieczyszczen(PODSTMODYFIKATOR_POZIOMUZANIECZYSZCZEN);
        super.setModyfikatorKosztowZycia(PODSTMODYFIKATOR_KOSZTOWZYCIA);
        super.setModyfikatorNiezaleznosciZywieniowej(PODSTMODYFIKATOR_NIEZALEZNOSCIZYWIENIOWEJ);
        super.setModyfikatorOczekiwanejDlugosciZycia(PODSTMODYFIKATOR_OCZEKIWANEJDLUGOSCIZYCIA);
        super.setModyfikatorUmieralnosciNoworodkow(PODSTMODYFIKATOR_UMIERALNOSCINOWORODKOW);

    }

    private void ustalKosztBudowy() {
        super.setKosztBudowy(KOSZTBUDOWY);
    }
}
