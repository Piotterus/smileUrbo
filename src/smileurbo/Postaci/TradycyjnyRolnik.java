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
public class TradycyjnyRolnik extends Rolnik{
    public static final String NAZWA = "Tradycyjny Rolnik";
    
    public TradycyjnyRolnik(String imie) {
        super(imie);
        super.czyWRadzie = false;
    }
    
    @Override
    public String toString() {
        return NAZWA + " " + super.imie;
    }
}
