/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp4.utils;

/**
 *
 * @author imad Representation de type complexe
 */
public class Complexe {

    private double reelle;
    private double imaginaire;
    private double argument;
    private double module;

    /**
     * @return the reelle
     */

    public Complexe() {
        reelle = 0;
        imaginaire = 0;
        argument = 0;
        module = 0;
    }

    public Complexe(double reelle, double imaginaire) {
        this.reelle = reelle;
        this.imaginaire = imaginaire;
        argument = Math.atan(imaginaire / reelle);
        module = Math.sqrt(reelle * reelle + imaginaire * imaginaire);
    }

    /**
     * @param reelle the reelle to set
     */
    public void setReelle(double reelle) {
        this.reelle = reelle;
        cartesienneVersPolaire();
    }

    public double getReelle() {
        return reelle;
    }

    /**
     * @return the imaginaire
     */
    public double getImaginaire() {
        return imaginaire;
    }

    /**
     * @param imaginaire the imaginaire to set
     */
    public void setImaginaire(double imaginaire) {
        this.imaginaire = imaginaire;
        cartesienneVersPolaire();
    }

    public String toString() {
        return ("forme cartesiene:" + reelle + " + i * " + imaginaire + "\t forme exponentielle: " + module + "* e^(i*" + argument + ")");
    }

    /**
     * @return the argument
     */
    public double getArgument() {
        return argument;
    }

    /**
     * @param argument the argument to set
     */
    public void setArgument(double argument) {
        this.argument = argument;
        polaireVersCartesienne();
    }

    /**
     * @return the module
     */
    public double getModule() {
        return module;
    }

    /**
     * @param module the module to set
     */
    public void setModule(double module) {
        this.module = module;
        polaireVersCartesienne();
    }

    private void cartesienneVersPolaire() {
        argument=Math.atan(imaginaire / reelle);
        module=Math.sqrt(reelle * reelle + imaginaire * imaginaire);
    }

    private void polaireVersCartesienne() {
        setReelle(module * Math.cos(argument));
        setImaginaire(imaginaire = module * Math.sin(argument));

    }

    public void ajouter(Complexe c) {
        setReelle(reelle + c.reelle);
        setImaginaire(imaginaire + c.imaginaire);
    }

    public void rotate(double theta) {
        setArgument(argument+theta);
    }

}
