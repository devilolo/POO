/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lemairlo
 */
public class TestTriangle {

    public static void main(String[] args) {
        Point o = new Point(0.0, 0.0);
        Point p1 = new Point(3.5, 0.0);
        Point p2 = new Point(0.0, 5.0);
        Point p3 = new Point(-3.5, 0.0);

        Triangle tRec = new Triangle(o, p1, p2);

        System.out.println("Test avec un triangle rectangle");
        System.out.println(tRec.toString());

        Triangle tIso = new Triangle(p1, p2, p3);

        System.out.println("Test avec un triangle isocèle");
        System.out.println(tIso.toString());

        System.out.println("Barycentre de tRec: " + tRec.getBaryCentre().toString());
        System.out.println("Périmètre de tRec: " + tRec.getPerimetre());
        System.out.println("Surface de tRec: " + tRec.getSurface());

        System.out.println("Barycentre de tIso: " + tIso.getBaryCentre().toString());
        System.out.println("Périmètre de tIso: " + tIso.getPerimetre());
        System.out.println("Surface de tIso: " + tIso.getSurface());

        if (tRec.isIsocele()) {
            System.out.println("Le triangle tRec est isocèle");
        } else {
            System.out.println("Le triangle tRec n'est pas isocèle");
        }
        if (tRec.isEquilateral()) {
            System.out.println("Le triangle tRec est equilateral");
        } else {
            System.out.println("Le triangle tRec n'est pas equilateral");
        }
        
         if (tIso.isIsocele()) {
            System.out.println("Le triangle tISO est isocèle");
        } else {
            System.out.println("Le triangle tISO n'est pas isocèle");
        }
        if (tIso.isEquilateral()) {
            System.out.println("Le triangle tISO est equilateral");
        } else {
            System.out.println("Le triangle tISO n'est pas equilateral");
        }
        
        if (tRec.isRectangle()) {
            System.out.println("Le triangle tRec est rectangle");
        } else {
            System.out.println("Le triangle tRec n'est pas rectangle");
        }
        if (tIso.isRectangle()) {
            System.out.println("Le triangle tISO est rectangle");
        } else {
            System.out.println("Le triangle tISO n'est pas rectangle");
        }
    }
}
