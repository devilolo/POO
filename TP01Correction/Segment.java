/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ruffieum
 */
public class Segment {

    private Point p1;
    private Point p2;

    public Segment(Point p1, Point p2) {
        this.p1 = new Point(p1.getX(),p1.getY());
        this.p2 = new Point(p2.getX(),p2.getY());
    }

    public Point getP1() {
        return p1;
    }

    public Point getP2() {
        return p2;
    }

    public void setP1(Point p1) {
        this.p1 = p1;
    }

    public void setP2(Point p2) {
        this.p2 = p2;
    }

    public String toString() {
        return ("[(" + p1.getX() + ", " + p1.getY() + ") ; "
                + "(" + p2.getX() + ", " + p2.getY() + ")]");
    }

}
