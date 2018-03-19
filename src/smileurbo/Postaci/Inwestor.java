/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smileurbo.Postaci;

/**
 *
 * @author katan
 */
public class Inwestor extends Postac {

    private static String NAZWA = "Inwestor";
    
    private int budzetInwestora;

    public Inwestor(String imie) {
        super.imie = imie;
        super.czyWRadzie = false;
    }

    
    
    @Override
    public String toString() {
        return getNAZWA() + " " + super.imie;
    }

    /**
     * @return the NAZWA
     */
    public static String getNAZWA() {
        return NAZWA;
    }

    /**
     * @param aNAZWA the NAZWA to set
     */
    public static void setNAZWA(String aNAZWA) {
        NAZWA = aNAZWA;
    }

    /**
     * @return the budzetInwestora
     */
    public int getBudzetInwestora() {
        return budzetInwestora;
    }

    /**
     * @param budzetInwestora the budzetInwestora to set
     */
    public void setBudzetInwestora(int budzetInwestora) {
        this.budzetInwestora = budzetInwestora;
    }

}
