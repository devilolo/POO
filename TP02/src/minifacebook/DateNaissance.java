/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minifacebook;

/**
 *
 * @author lemairlo
 */
public class DateNaissance {

    private int jour;
    private int mois;
    private int annee = 2018;

    public DateNaissance() {
        this.jour = 23;
        this.mois = 6;
    }

    public DateNaissance(int jour, int mois, int annee) {
        this.jour = jour;
        this.mois = mois;
        this.annee = annee;
    }

    public int getJour() {
        return jour;
    }

    public void setJour(int jour) {
        if (mois == 1 || mois == 3 || mois == 5 || mois == 7 || mois == 8 || mois == 10 || mois == 12) {
            if (jour > 0 && jour <= 31) {
                this.jour = jour;
            }
        } else if (mois == 2) {
            if (annee % 4 == 0 && annee % 100 == 0 && annee % 400 != 0) {
                if (jour > 0 && jour <= 29) {
                    this.jour = jour;
                }
            } else {
                if (jour > 0 && jour <= 28) {
                    this.jour = jour;
                }
            }
        } else {
            if (jour > 0 && jour <= 30) {
                this.jour = jour;
            }
        }

    }

    public int getMois() {
        return mois;
    }

    public void setMois(int mois) {
        if (mois > 0 && mois <= 12) {
            this.mois = mois;
        }

    }

    public int getAnnee() {
        return annee;
    }

    public void setAnnee(int annee) {
        if (annee >= 0 && annee <= 2015) {
            this.annee = annee;
        }
    }

    public void ecritDate() {
        System.out.print(jour + "/" + mois + "/" + annee);
    }

    public int age() {
        int resultat;
        resultat = 2015 - annee;
        return resultat;
    }

}
