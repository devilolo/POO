/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ruffieum
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

    public Segment getC1() {
        return c1;
    }

    public Segment getC2() {
        return c2;
    }

    public Segment getC3() {
        return c3;
    }

    public void setC1(Segment c1) {
        this.c1 = c1;
    }

    public void setC2(Segment c2) {
        this.c2 = c2;
    }

    public void setC3(Segment c3) {
        this.c3 = c3;
    }

    public Point getP1() {
        return c1.getP1();
    }

    public Point getP2() {
        return c1.getP2();
    }

    public Point getP3() {
        return c2.getP2();
    }

    public void setP1(Point p1) {
        c1.setP1(p1);
    }

    public void setP2(Point p2) {
        c1.setP2(p2);
    }

    public void setP3(Point p3) {
        c2.setP2(p3);
    }

    private double distance(Segment c) {
        return Math.sqrt((c.getP2().getX() - c.getP1().getX()) * (c.getP2().getX() - c.getP1().getX())
                + (c.getP2().getY() - c.getP1().getY()) * (c.getP2().getY() - c.getP1().getY()));
    }

    public double getPerimetre() {
        return distance(c1)
                + distance(c2)
                + distance(c3);
    }

    public Point getBaryCentre() {
        double x = (getP1().getX() + getP2().getX() + getP3().getX()) / 3;
        double y = (getP1().getY() + getP2().getY() + getP3().getY()) / 3;

        return new Point(x, y);

    }

    public double getSurface() {
        double p = getPerimetre() / 2;
        return Math.sqrt(p * (p - distance(c1)) * (p - distance(c2)) * (p - distance(c3)));
    }

    public String toString() {
        return "[(" + c1.getP1().getX() + ", " + c1.getP1().getY() + ") ; "
                + "(" + c1.getP2().getX() + ", " + c1.getP2().getY() + ")]"
                + "\n[(" + c2.getP1().getX() + ", " + c2.getP1().getY() + ") ; "
                + "(" + c2.getP2().getX() + ", " + c2.getP2().getY() + ")]"
                + "\n[(" + c3.getP1().getX() + ", " + c3.getP1().getY() + ") ; "
                + "(" + c3.getP2().getX() + ", " + c3.getP2().getY() + ")]";
    }

    public void rotate(double r) {
        double xr1 = getP1().getX() * Math.cos(r) - getP1().getY() * Math.sin(r);
        double yr1 = getP1().getX() * Math.sin(r) + getP1().getY() * Math.cos(r);

        double xr2 = getP2().getX() * Math.cos(r) - getP2().getY() * Math.sin(r);
        double yr2 = getP2().getX() * Math.sin(r) + getP2().getY() * Math.cos(r);

        double xr3 = getP3().getX() * Math.cos(r) - getP3().getY() * Math.sin(r);
        double yr3 = getP3().getX() * Math.sin(r) + getP3().getY() * Math.cos(r);

        setP1(new Point(xr1, yr1));
        setP2(new Point(xr2, yr2));
        setP3(new Point(xr3, yr3));

    }
    
    public boolean isIsocele(){
        
        if(c1==c2 || c1==c3 || c2==c3){
          return true;  
        }
       return false;
    }

}
