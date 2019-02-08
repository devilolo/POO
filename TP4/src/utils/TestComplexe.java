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
public class TestComplexe {

    public static void main(String args[]){
        Complexe c = new Complexe();
        c.setImaginaire(3);
        c.setReelle(-4.7);
        String s;
        s = c.toString();
        System.out.println(s);
        c.setImaginaire(-1.2);
        c.setReelle(2.7);
        s = c.toString();
        System.out.println(s);
        Complexe c1 = new Complexe(1.0,2.0);
        c.ajouter(c1);
        System.out.println(c.toString());
        c.rotate(20);
        System.out.println(c.toString());
        
    }
    
}
