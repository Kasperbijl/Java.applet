import java.awt.*;
import java.applet.*;

public class OPD41 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
g.drawLine(0,0,50,0);
   g.drawLine(50,0,0,50);
    g.drawLine(0,50,0,0);
    }
}