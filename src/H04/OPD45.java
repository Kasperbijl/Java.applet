import java.awt.*;
import java.applet.*;

public class OPD45 extends Applet {

    public void init() {
        setBackground(Color.blue);
    }

    public void paint(Graphics g) {
        g.setColor(Color.yellow);
        g.fillArc(40,40,100,80,0,360);
    }
}