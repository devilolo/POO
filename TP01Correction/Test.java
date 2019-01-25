public class Test {

    public static void main(String[] args) {
        Point o = new Point(0.0, 0.0);
        System.out.println("Point o: " + o.toString());
        Point p1 = new Point(3.5, 0.0);
        System.out.println("Point p1: " + p1.toString());
        Point p2 = new Point(0.0, 5.0);
        System.out.println("Point p2: " + p2.toString());
        Point p3 = new Point(-3.5, 0.0);
        System.out.println("Point p3: " + p3.toString());
        // Exemple de Segment
        Segment s1 = new Segment(p1, p2);
        System.out.println("Segment: " + s1.toString());
      //  System.out.println("Longueur du segment: " + s1.getLongueur());
        // Exemple d'un triangle rectangle
        Triangle tRec = new Triangle(o, p1, p2);
        System.out.println(tRec.toString());
       /* if (tRec.isRectangle()) {
            System.out.println("Ce triangle est rectangle.");
        }*/
        if (tRec.isIsocele()) {
            System.out.println("Ce triangle est isocèle.");
        }
       System.out.println("Barycentre: " + tRec.getBaryCentre().toString());
        System.out.println("Périmètre: " + tRec.getPerimetre());
        System.out.println("Surface: " + tRec.getSurface());
        System.out.println();
        // Exemple d'un triangle isocèle
        Triangle tIso = new Triangle(p1, p2, p3);
        System.out.println("Essai avec le triangle isocèle");
        System.out.println(tIso.toString());
      /*  if (tIso.isRectangle()) {
           System.out.println("Ce triangle est rectangle.");
        }*/
        if (tIso.isIsocele()) {
           System.out.println("Ce triangle est isocèle.");
        }
        System.out.println("Barycentre: " + tIso.getBaryCentre().toString());
        System.out.println("Périmètre: " + tIso.getPerimetre());
        System.out.println("Surface: " + tIso.getSurface());
        // Rotation du triangle rectangle
        tRec.rotate(Math.PI / 2.0);
        System.out.println("Après rotation de 90°: ");
        System.out.println(tRec);
    }

}