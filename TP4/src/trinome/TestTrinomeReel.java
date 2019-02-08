/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trinome;

/**
 *
 * @author lemairlo
 */
public class TestTrinomeReel {

    public static void main(String args[]) {
        TrinomeReel t = new TrinomeReel(2.0, 3.0, -5.0);
        resultatTrinome(t);
        t.setA(1.0);
        t.setB(2.0);
        t.setC(1.0);
        resultatTrinome(t);
        t.setA(1.0);
        t.setB(1.0);
        t.setC(1.0);
        resultatTrinome(t);
        t.setA(0.0);
        t.setB(2.0);
        t.setC(-1.0);
        resultatTrinome(t);
        TrinomeComplexe eq4 = new TrinomeComplexe(1.0, 1.0, 1.0);
        System.out.println("Les solutions complexes de l'équation " + eq4.equation() + " sont: " + eq4.getRacine1().toString()+ " et " + eq4.getRacine2().toString());
    }

    public static void resultatTrinome(TrinomeReel t) {

        try {
            System.out.println(t.toString());
        } catch (Exception e) {

        }

    }
}
