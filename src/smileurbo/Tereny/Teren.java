/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smileurbo.Tereny;

/**
 *
 * @author katan
 */
public class Teren {
    private boolean czyBliskoCentrum;
    private boolean czyZyznaGleba;
    private boolean czyLadneWidoki;
    private boolean czyBliskoKosciola;
    private boolean czyPrzyJeziorze;
    private boolean czyPrzyDrodze;
    
    private int cenaKupna;
    private boolean czyZajety;
    public static final int CENAPODSTAWOWA = 10000;
    public static final int CENAZABLISKOSCCENTRUM = 1000;
    public static final int CENAZADROGE = 1000;
    public static final int CENAZAZYZNAGLEBE = 1000;
    public static final int CENAZALADNEWIDOKI = 1000;
    public static final int CENAZABLISKOSCKOSCIOLA = 1000;
    public static final int CENAZAJEZIORO = 1000;
    
    public Teren(boolean czyBliskoCentrum, boolean czyZyznaGleba, boolean czyLadneWidoki, 
            boolean czyBliskoKosciola, boolean czyPrzyJeziorze, boolean czyPrzyDrodze) {
        this.czyBliskoCentrum = czyBliskoCentrum;
        this.czyZyznaGleba = czyZyznaGleba;
        this.czyLadneWidoki = czyLadneWidoki;
        this.czyBliskoKosciola = czyBliskoKosciola;
        this.czyPrzyJeziorze = czyPrzyJeziorze;
        this.czyPrzyDrodze = czyPrzyDrodze;
        this.czyZajety = false;
        this.ustalCene();
    }
    
    private void ustalCene() {
        this.cenaKupna = CENAPODSTAWOWA;
        if (this.czyBliskoCentrum) this.cenaKupna += CENAZABLISKOSCCENTRUM;
        if (this.czyZyznaGleba) this.cenaKupna += CENAZAZYZNAGLEBE;
        if (this.czyLadneWidoki) this.cenaKupna += CENAZALADNEWIDOKI;
        if (this.czyBliskoKosciola) this.cenaKupna += CENAZABLISKOSCKOSCIOLA;
        if (this.czyPrzyJeziorze) this.cenaKupna += CENAZAJEZIORO;
        if (this.czyPrzyDrodze) this.cenaKupna += CENAZADROGE;
    }
    
    @Override
    public String toString() {
        return "Cena - " + this.getCenaKupna();
    }
    
    public String pelneInfo() {
        return "Blisko centrum - " + (this.czyBliskoCentrum ? "TAK" : "NIE") + "\n" +
                "Żyzna gleba - " + (this.czyZyznaGleba ? "TAK" : "NIE") + "\n" +
                "Ładne widoki - " + (this.czyLadneWidoki ? "TAK" : "NIE") + "\n" +
                "Blisko kościoła - " + (this.czyBliskoKosciola ? "TAK" : "NIE") + "\n" +
                "Przy jeziorze - " + (this.czyPrzyJeziorze ? "TAK" : "NIE") + "\n" +
                "Przy drodze - " + (this.czyPrzyDrodze ? "TAK" : "NIE") + "\n" +
                "Cena - " + this.getCenaKupna();
    }
    
    /**
     * @return the czyBliskoCentrum
     */
    public boolean isCzyBliskoCentrum() {
        return czyBliskoCentrum;
    }

    /**
     * @param czyBliskoCentrum the czyBliskoCentrum to set
     */
    public void setCzyBliskoCentrum(boolean czyBliskoCentrum) {
        this.czyBliskoCentrum = czyBliskoCentrum;
    }

    /**
     * @return the czyZyznaGleba
     */
    public boolean isCzyZyznaGleba() {
        return czyZyznaGleba;
    }

    /**
     * @param czyZyznaGleba the czyZyznaGleba to set
     */
    public void setCzyZyznaGleba(boolean czyZyznaGleba) {
        this.czyZyznaGleba = czyZyznaGleba;
    }

    /**
     * @return the czyLadneWidoki
     */
    public boolean isCzyLadneWidoki() {
        return czyLadneWidoki;
    }

    /**
     * @param czyLadneWidoki the czyLadneWidoki to set
     */
    public void setCzyLadneWidoki(boolean czyLadneWidoki) {
        this.czyLadneWidoki = czyLadneWidoki;
    }

    /**
     * @return the czyBliskoKosciola
     */
    public boolean isCzyBliskoKosciola() {
        return czyBliskoKosciola;
    }

    /**
     * @param czyBliskoKosciola the czyBliskoKosciola to set
     */
    public void setCzyBliskoKosciola(boolean czyBliskoKosciola) {
        this.czyBliskoKosciola = czyBliskoKosciola;
    }

    /**
     * @return the czyPrzyJeziorze
     */
    public boolean isCzyPrzyJeziorze() {
        return czyPrzyJeziorze;
    }

    /**
     * @param czyPrzyJeziorze the czyPrzyJeziorze to set
     */
    public void setCzyPrzyJeziorze(boolean czyPrzyJeziorze) {
        this.czyPrzyJeziorze = czyPrzyJeziorze;
    }

    /**
     * @return the czyPrzyDrodze
     */
    public boolean isCzyPrzyDrodze() {
        return czyPrzyDrodze;
    }

    /**
     * @param czyPrzyDrodze the czyPrzyDrodze to set
     */
    public void setCzyPrzyDrodze(boolean czyPrzyDrodze) {
        this.czyPrzyDrodze = czyPrzyDrodze;
    }

    /**
     * @return the cenaKupna
     */
    public int getCenaKupna() {
        return cenaKupna;
    }

    /**
     * @param cenaKupna the cenaKupna to set
     */
    public void setCenaKupna(int cenaKupna) {
        this.cenaKupna = cenaKupna;
    }

    /**
     * @return the czyZajety
     */
    public boolean isCzyZajety() {
        return czyZajety;
    }

    /**
     * @param czyZajety the czyZajety to set
     */
    public void setCzyZajety(boolean czyZajety) {
        this.czyZajety = czyZajety;
    }
    
}
