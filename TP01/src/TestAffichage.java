
import java.awt.*;
import javax.swing.JFrame;

public class TestAffichage extends Canvas {

    public void paint(Graphics g) {
        setBackground(Color.WHITE);

        g.drawString("Affichage de triangles", 230, 10);

        Point o = new Point(0, 0);
        Point p0 = new Point(50, 100);
        Point p1 = new Point(170, 100);
        Point p2 = new Point(50, 180);
        Point p3 = new Point(55, -100);
        Point p4 = new Point(-55, -100);
        Point p5 = new Point(0, 60);

        // Exemple d'un triangle rectangle
        Triangle tRec = new Triangle(p0, p1, p2);
        Color red = new Color(255, 0, 0);
        drawTriangle(g, tRec, "T1 (rectangle)", red);

        tRec.rotate(Math.PI / 2.0);
        Color green = new Color(0, 255, 0);
        drawTriangle(g, tRec, "T2(rotation)", green);

        // Exemple d'un triangle isocèle
        Triangle tIso = new Triangle(p3, p4, p5);
        Color blue = new Color(0, 0, 255);
        drawTriangle(g, tIso, "T3(isocèle)", blue);

    }

    private void drawTriangle(Graphics g, Triangle t, String name, Color c) {
        g.setColor(c);
        Segment c1 = new Segment(t.getP1(), t.getP2());
        Segment c2 = new Segment(t.getP2(), t.getP3());
        Segment c3 = new Segment(t.getP3(), t.getP1());
        drawSegment(g, c1, "C1");
        drawSegment(g, c2, "c2");
        drawSegment(g, c3, "C3");

        drawPoint(g, t.getP1(), "P1");
        drawPoint(g, t.getP2(), "P2");
        drawPoint(g, t.getP3(), "P3");

        drawPoint(g, t.getBaryCentre(), name);
    }

    private void drawPoint(Graphics g, Point p, String name) {
        int x = (int) (centerCoord(p.getX()));
        int y = (int) (centerCoord(p.getY()));
        g.drawString(name, x, y);
    }

    private void drawSegment(Graphics g, Segment s, String name) {
        int x1 = (int) (centerCoord(s.getP1().getX()));
        int y1 = (int) (centerCoord(s.getP1().getY()));
        int x2 = (int) (centerCoord(s.getP2().getX()));
        int y2 = (int) (centerCoord(s.getP2().getY()));
        g.drawLine(x1, y1, x2, y2);

        g.drawString(name, (x1 + x2) / 2, (y1 + y2) / 2);
    }

    private double centerCoord(double coord) {
        return coord + 255;
    }

    public static void main(String[] args) {
        TestAffichage m = new TestAffichage();

        JFrame f = new JFrame();
        f.add(m);
        f.setSize(500, 500);
        f.setVisible(true);
    }
}
