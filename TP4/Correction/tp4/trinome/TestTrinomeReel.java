/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp4.trinome;

/**
 *
 * @author imad
 */
public class TestTrinomeReel {

    public static void resultatTrinome(TrinomeReel t) {
     
        try{
        System.out.println(t.toString());
        }catch(ArithmeticException e){
            System.out.println("Racine du négatif");
        }

    }

    public static void main(String[] args) {
        TrinomeReel t =new TrinomeReel(2.0, 3.0, -5.0);
        resultatTrinome(t);
        /*resultatTrinome(2.0, 3.0, -5.0);
        resultatTrinome(1.0, 2.0, 1.0);
        resultatTrinome(1.0, 1.0, 1.0);
        resultatTrinome(0.0, 2.0, -1.0);*/
    }
}
