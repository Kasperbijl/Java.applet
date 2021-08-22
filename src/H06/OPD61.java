import java.awt.*;
import java.applet.*;


public class OPD61 extends Applet {
    double a, b, uitkomst;
    int breed;
    public void init() {
        breed = 20;
        a = 133;
        b = 4;
        uitkomst = (a) / b;
    }

    public void paint(Graphics g) {
        g.drawString("Ik: " + uitkomst, breed, 20);
        g.drawString("Jan: " + uitkomst, breed, 30);
        g.drawString("Ali: " + uitkomst, breed, 40);
        g.drawString("Jeanette: " + uitkomst, breed, 50);
    }
}