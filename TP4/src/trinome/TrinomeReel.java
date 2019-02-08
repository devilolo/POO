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
public class TrinomeReel {

    private double a;
    private double b;
    private double c;
    private double delta;
    private double degre;

    public void setA(double a) {
        this.a = a;
        computeDelta();
        computeDegre();
    }

    public void setB(double b) {
        this.b = b;
        computeDelta();
        computeDegre();
    }

    public void setC(double c) {
        this.c = c;
        computeDelta();
        computeDegre();
    }

    public TrinomeReel(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
        computeDelta();
        computeDegre();

    }

    public double getRacine1() {
        double x = 0;
        switch ((int) degre) {
            case 1:
                x = -c / b;
                break;
            case 2:
                if (delta < 0) {
                    throw new ArithmeticException("Pas de solution réelle");
                } else if (delta == 0) {
                    x = -(b / 2 * a);

                } else {
                    x = (-b - Math.sqrt(delta)) / (2 * a);
                }
                break;
            default:
                throw new ArithmeticException("Pas de solution réelle");
        }

        return x;
    }

    public double getRacine2() {
        double x = 0;
        switch ((int) degre) {
            case 1:
                x = -c / b;
                break;
            case 2:
                if (delta < 0) {
                    throw new ArithmeticException("Pas de solution réelle");
                } else if (delta == 0) {
                    x = -(b / 2 * a);

                } else {
                    x = (-b + Math.sqrt(delta)) / (2 * a);
                }
                break;
            default:
                throw new ArithmeticException("Pas de solution réelle");
        }

        return x;
    }

    private void computeDegre() {
        if (a == 0 && b == 0) {
            degre = 0;
        } else if (a == 0) {
            degre = 1;
        } else {
            degre = 2;
        }
    }

    private void computeDelta() {
        delta = Math.pow(b, 2) - 4 * a * c;
    }

    @Override
    public String toString() {
        String equation = "";
        switch ((int) degre) {
            case 2:
                equation = "" + a + "x²";
            case 1:
                if (b > 0 && equation != "") {
                    equation += "+" + b + "x";
                } else if(b<0){
                    equation += b + "x";
                }
            case 0:
                if (c > 0 && equation != "") {
                    equation += "+" + c;
                } else if(c<0) {
                    equation += c;
                }
        }

        String s = null;
        switch ((int) degre) {
            case 0:
                throw new ArithmeticException("Pas de solution réelle");
            case 1:
                s = "Le système :" + equation + " = 0 a 1 seule solution réelle:" + getRacine1() + "\n";
                break;
            case 2:
                if (delta < 0) {
                    s = "Le système :" + equation + " = 0 n'a pas de solution réelle. \n";
                } else if (delta == 0) {
                    s = "Le système :" + equation + " = 0 a 1 seule solution réelle: " + getRacine1() + "\n";
                } else {
                    s = "Le système :" + equation + " = 0  a 2 solutions réelles: " + getRacine1() + " et " + getRacine2() + "\n";
                }
                break;
        }

        return s;
    }

}
