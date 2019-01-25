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
public class Personne {

    private String nom;
    private String prenom;
    private DateNaissance dateDeNaissance;
    private Personne ami;
    private Personne meilleurAmi;

    public Personne(String nom, String prenom, DateNaissance dateDeNaissance) {
        this.nom = nom;
        this.prenom = prenom;
        this.dateDeNaissance = dateDeNaissance;
    }

    public Personne getAmi() {
        return ami;
    }

    public void setAmi(Personne ami) {
        this.ami = ami;
    }

    public Personne getMeilleurAmi() {
        return meilleurAmi;
    }

    public void setMeilleurAmi(Personne meilleurAmi) {
        this.meilleurAmi = meilleurAmi;
    }

    public void ecritInfos() {
        System.out.println("----------------------------");
        System.out.println(prenom + nom);
        System.out.print("Né(e) le : ");
        dateDeNaissance.ecritDate();
        System.out.println("(" + dateDeNaissance.age() + " ans)");
        if (getMeilleurAmi() != null) {
            System.out.print("Meilleur ami:");
            System.out.println(getMeilleurAmi().nom + " " + getMeilleurAmi().prenom);

        }
        if (getAmi() != null) {
            System.out.println("Ami :" + getAmi().nom + " " + getAmi().prenom);
            System.out.println("----------------------------");

        }

    }

}
