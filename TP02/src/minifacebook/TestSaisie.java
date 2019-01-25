/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package minifacebook;

import java.util.Scanner;
/**
 *
 * @author lemairlo
 */
public class TestSaisie {
    public static void main(String[] args) {
    Scanner clavier = new Scanner(System.in);
    DateNaissance date = new DateNaissance();
 
    System.out.println("Saisir l'annee de naissance de Harry (1989)");
    date.setJour(23);
    date.setMois(7);
    date.setAnnee(clavier.nextInt());
    Personne harry = new Personne("Potter", "Harry", date);
 
    System.out.println("Saisir l'annee de naissance de Ron (1988)");
    date.setJour(24);
    date.setMois(8);
    date.setAnnee(clavier.nextInt());
    Personne ron = new Personne("Weasley", "Ron", date);
 
    System.out.println("Saisir l'annee de naissance de Hermione (1990)");
    date.setJour(15);
    date.setMois(4);
    date.setAnnee(clavier.nextInt());
    Personne hermione = new Personne("Granger", "Hermione", date);
 
    harry.ecritInfos();
    ron.ecritInfos();
    hermione.ecritInfos();
    System.out.println("Y'a pas un problème?");
    }
}
