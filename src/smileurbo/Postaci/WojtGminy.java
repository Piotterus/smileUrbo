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
public class WojtGminy extends Postac{
    public static final String NAZWA = "Wójt Gminy";
    
    public WojtGminy(String imie) {
        super.imie = imie;
        super.czyWRadzie = false;
    }
    
    @Override
    public String toString() {
        return NAZWA + " " + super.imie;
    }
}
