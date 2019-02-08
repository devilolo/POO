/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp4.utils;

/**
 *
 * @author imad
 */
public class TestComplexe {

    public static void main(String[] args) {

        Complexe c;
        c= new Complexe();
        
        c.setReelle(-4.7);
        c.setImaginaire(3);
        System.out.println("test du complexe : "+c.toString());
        Complexe c1;
        c1= new Complexe(-4.7,3);
        System.out.println("test du complexe 2 : "+c1.toString());
        c1.setReelle(2.7);
        c1.setImaginaire(-1.2);
        System.out.println("test du complexe 2 : "+c1.toString());
        Complexe autreC;
        autreC=new Complexe(1,1);
        c.ajouter(c1);
        System.out.println("test du complexe 2 : "+c.toString());
        c.rotate(5.5);
        System.out.println("test du complexe 2 : "+c.toString());
        
                
    }
}
