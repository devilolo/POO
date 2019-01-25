/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lemairlo
 */
public class Triangle {

    private Segment c1;
    private Segment c2;
    private Segment c3;

    public Triangle(Point p1, Point p2, Point p3) {
        this.c1 = new Segment(p1, p2);
        this.c2 = new Segment(p2, p3);
        this.c3 = new Segment(p3, p1);
    }

    public Point getP1() {
        return c1.getP1();
    }

    public void setP1(Point p1) {
        c1.setP1(p1);
        c3.setP2(p1);
    }

    public Point getP2() {
        return c2.getP1();
    }

    public void setP2(Point p2) {
        c2.setP1(p2);
        c1.setP2(p2);
    }

    public Point getP3() {
        return c3.getP1();
    }

    public void setP3(Point p3) {
        c2.setP2(p3);
        c3.setP1(p3);
    }

    public double getPerimetre() {
        return c1.getLongueur() + c2.getLongueur() + c3.getLongueur();
    }

    public Point getBaryCentre() {
        double x = (getP1().getX() + getP2().getX() + getP3().getX()) / 3;
        double y = (getP1().getY() + getP2().getY() + getP3().getY()) / 3;
        return new Point(x, y);
    }

    public double getSurface() {
        double p = getPerimetre() / 2;
        return Math.sqrt(p * (p - c1.getLongueur()) * (p - c2.getLongueur()) * (p - c3.getLongueur()));
    }

    @Override
    public String toString() {
        return "Triangle:\n" + c1.toString() + "\n" + c2.toString() + "\n" + c3.toString();
    }

    public void rotate(double angle) {
        double xr = getP1().getX() * Math.cos(angle) - getP1().getY() * Math.sin(angle);
        double yr = getP1().getX() * Math.sin(angle) - getP1().getY() * Math.cos(angle);
        getP1().setX(xr);
        getP1().setY(yr);
        xr = getP2().getX() * Math.cos(angle) - getP2().getY() * Math.sin(angle);
        yr = getP2().getX() * Math.sin(angle) - getP2().getY() * Math.cos(angle);
        getP2().setX(xr);
        getP2().setY(yr);
        xr = getP3().getX() * Math.cos(angle) - getP3().getY() * Math.sin(angle);
        yr = getP3().getX() * Math.sin(angle) - getP3().getY() * Math.cos(angle);
        getP3().setX(xr);
        getP3().setY(yr);

    }

    public boolean isIsocele() {
        if (egalDouble(c1.getLongueur(), c2.getLongueur()) && !egalDouble(c2.getLongueur(), c3.getLongueur())) {
            return true;
        } else if (egalDouble(c3.getLongueur(), c2.getLongueur()) && !egalDouble(c3.getLongueur(), c1.getLongueur())) {
            return true;
        } else {
            return egalDouble(c3.getLongueur(), c1.getLongueur()) && !egalDouble(c2.getLongueur(), c3.getLongueur());
        }
    }

    public boolean isEquilateral() {
        return egalDouble(c1.getLongueur(), c2.getLongueur())  && egalDouble(c3.getLongueur(), c1.getLongueur());
    }

    private Segment plusGrandCote() {
        if (c1.getLongueur() > c2.getLongueur()) {
            if (c1.getLongueur() > c3.getLongueur()) {
                return c1;
            } else {
                return c3;
            }
        } else if (c2.getLongueur() > c3.getLongueur()) {
            return c2;
        } else {
            return c3;
        }

}

public boolean isRectangle() {
        if (c1 == plusGrandCote()) {
            return egalDouble(Math.pow(c1.getLongueur(), 2), (Math.pow(c2.getLongueur(), 2) + Math.pow(c3.getLongueur(), 2)));
        } else if (c2 == plusGrandCote()) {
            System.out.println( Math.pow(c2.getLongueur(), 2) + " = " + (Math.pow(c3.getLongueur(), 2) + Math.pow(c1.getLongueur(), 2)) );
            return egalDouble(Math.pow(c2.getLongueur(), 2), (Math.pow(c3.getLongueur(), 2) + Math.pow(c1.getLongueur(), 2)));
        } else {           
            return egalDouble(Math.pow(c3.getLongueur(), 2), (Math.pow(c2.getLongueur(), 2) + Math.pow(c3.getLongueur(), 2)));
        }
    }

    public boolean egalDouble(double a , double b){
        double eps = 0.01;
        return Math.abs(a-b) < eps;      
    }
    
}
