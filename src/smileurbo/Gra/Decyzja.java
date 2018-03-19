/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smileurbo.Gra;

import smileurbo.Budynki_i_Eventy.Budynek;
import smileurbo.Budynki_i_Eventy.Eventy.Eventy;
import smileurbo.Tereny.Teren;

/**
 *
 * @author katan
 */
public class Decyzja {
    private String informacja;
    private Budynek budynek;
    private Eventy event;
    
    public Decyzja(Budynek budynek, String informacja) {
        this.budynek = budynek;
        this.informacja = informacja;
        this.event = null;
    }
    
    public Decyzja(Eventy event, String informacja) {
        this.event = event;
        this.informacja = informacja;
        this.budynek = null;
    }
    
    @Override
    public String toString() {
        return this.getInformacja();
    }

    /**
     * @return the informacja
     */
    public String getInformacja() {
        return informacja;
    }

    /**
     * @param informacja the informacja to set
     */
    public void setInformacja(String informacja) {
        this.informacja = informacja;
    }

    /**
     * @return the budynek
     */
    public Budynek getBudynek() {
        return budynek;
    }

    /**
     * @param budynek the budynek to set
     */
    public void setBudynek(Budynek budynek) {
        this.budynek = budynek;
    }

    /**
     * @return the event
     */
    public Eventy getEvent() {
        return event;
    }

    /**
     * @param event the event to set
     */
    public void setEvent(Eventy event) {
        this.event = event;
    }
}
