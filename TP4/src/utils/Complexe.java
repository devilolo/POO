/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

/**
 *
 * @author lemairlo
 */
public class Complexe {

    private double reelle;
    private double imaginaire;
    private double argument;
    private double module;

    public Complexe() {
        reelle = 0;
        imaginaire = 0;
        argument = 0;
        module = 0;
    }
    
 

    public Complexe(double reelle, double imaginaire) {
        this.reelle = reelle;
        this.imaginaire = imaginaire;
        cartesienneVersPolaire();
    }

    public double getArgument() {
        return argument;
    }

    public void setArgument(double argument) {
        this.argument = argument;
        polaireVersCartesienne();
    }

    public double getModule() {
        return module;
    }

    public void setModule(double module) {
        this.module = module;
        polaireVersCartesienne();
    }

    public double getReelle() {
        return reelle;
    }

    public void setReelle(double reelle) {
        this.reelle = reelle;
        cartesienneVersPolaire();
    }

    public double getImaginaire() {
        return imaginaire;
    }

    public void setImaginaire(double imaginaire) {
        this.imaginaire = imaginaire;
        cartesienneVersPolaire();
    }
    
    private void cartesienneVersPolaire(){
        argument = Math.atan(imaginaire/reelle);
        module = Math.sqrt(Math.pow(reelle,2) + Math.pow(imaginaire,2));
    }
    
    private void polaireVersCartesienne(){
       imaginaire= module*Math.sin(argument);
       reelle=module*Math.cos(argument);
    }
    
    public void ajouter(Complexe c){
        argument= c.getArgument();
        imaginaire= c.getImaginaire();
        module=c.getModule();
        reelle=c.getReelle();
                
    }
    
    public void rotate(double theta){
        setModule(argument+theta);
    }

    @Override
    public String toString() {
        String s;
        s ="Forme cartésienne :"+getReelle() + "+ i" + getImaginaire() + " \n";
        s +="Forme polaire :"+ getModule() + ".e^i." + getArgument();

        return s;

    }

}
