/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp4.trinome;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author imad
 */
public class TrinomeReel {

    private double a;
    private double b;
    private double c;
    private double delta;
    private int degree;

    public TrinomeReel(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
        computeDegre();
        computeDelta();
    }

    public double getRacine1() {
        double racine = 0;
        switch (degree) {
            case 0:
                System.out.println("ce n'est pas une equation de degree 2 ");
                break;
            case 1:
                System.out.println("ce n'est pas une equation de degree 2 ");
                break;
            case 2:
                racine = (-getB() - Math.sqrt(delta)) / (2 * getA());
                break;
            default:;
                break;
        }
        return racine;
    }

    public double getRacine2() throws Exception {
        double racine = 0;

        switch (degree) {

            case 0:
                throw new Exception("degree 0 pas de racine ");

            case 1:
                throw new Exception("pas de degré 2 ");

            case 2:
                if (delta < 0) {
                    throw new Exception("delta < 0");
                }
                racine = (-getB() + Math.sqrt(delta)) / (2 * getA());
                break;

            default:;
                break;
        }
        return racine;
    }

    public String toString() {
        if (delta < 0) {
            return ("(" + getA() + ")x^2+(" + getB() + ")x+(" + getC() + ")= 0 n'a aucune solution ");
        } else if (delta == 0) {
            return ("(" + getA() + ")x^2+(" + getB() + ")x+(" + getC() + ")= 0 a une solution: " + getRacine1());
        } else {
            try {
                return ("(" + getA() + ")x^2+(" + getB() + ")x+(" + getC() + ")= 0 a deux solutions: " + getRacine1() + " et " + getRacine2());
            } catch (Exception ex) {
                Logger.getLogger(TrinomeReel.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return "";
    }

    /**
     * @return the a
     */
    public double getA() {
        return a;
    }

    /**
     * @return the b
     */
    public double getB() {
        return b;
    }

    /**
     * @return the c
     */
    public double getC() {
        return c;
    }

    private void computeDegre() {
        delta = (b * b) - (4 * a * c);
    }

    private void computeDelta() {
        if (a != 0) {
            degree = 2;
        } else if (b != 0) {
            degree = 1;
        } else {
            degree = 0;
        }
    }

}
