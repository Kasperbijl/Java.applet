import java.awt.*;
import java.applet.*;

public class PraktijkH06 extends Applet {
    double c1,c2,c3,uitkomst;
    int geheel;
    double gebroken;
    public void init() {
        c1 = 6.3;
        c2 = 6.9;
        c3 = 5.9;
        uitkomst = (c1+c2+c3) / 3;
        uitkomst *=10;
        uitkomst = (int) uitkomst;
        uitkomst /=10;

    }

    public void paint(Graphics g) {
        g.drawString("Het gemiddelde is: " + uitkomst,20,20);

    }
}