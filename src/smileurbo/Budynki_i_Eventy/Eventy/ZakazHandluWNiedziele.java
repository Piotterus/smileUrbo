/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smileurbo.Budynki_i_Eventy.Eventy;

/**
 *
 * @author katan
 */
public class ZakazHandluWNiedziele extends Eventy {

    public static final String NAZWA = "Zakaz handlu w niedziele";

    public static final int PODSTMODYFIKATOR_POZIOMUBEZROBOCIA = 3;
    public static final int PODSTMODYFIKATOR_POZIOMUZANIECZYSZCZEN = 0;
    public static final int PODSTMODYFIKATOR_UMIERALNOSCINOWORODKOW = 0;
    public static final int PODSTMODYFIKATOR_OCZEKIWANEJDLUGOSCIZYCIA = 0;
    public static final int PODSTMODYFIKATOR_KOSZTOWZYCIA = 1;
    public static final int PODSTMODYFIKATOR_NIEZALEZNOSCIZYWIENIOWEJ = -1;

    public static final int PODSTKOSZT = 0;
    
    public static final int PUNKTYDLADYREKTORASZKOLY = 0;
    public static final int PUNKTYDLAINWESTORA = 0;
    public static final int PUNKTYDLANWO = 0;
    public static final int PUNKTYDLANOWOCZESNEGOROLNIKA = 0;
    public static final int PUNKTYDLAPRZEWODNIKADUCHOWEGO = 0;
    public static final int PUNKTYDLARYBAKA = 0;
    public static final int PUNKTYDLASPRZEDAWCY = 0;
    public static final int PUNKTYDLATRADYCYJNEGOROLNIKA = 0;
    public static final int PUNKTYDLAWOJTAGMINY = 0;

    public ZakazHandluWNiedziele() {
        super.setNazwa(NAZWA);
        this.ustalModyfikatory();
        super.setKoszt(PODSTKOSZT);
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
}
