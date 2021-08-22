import java.awt.*;
import java.applet.*;

public class OPD47 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        g.drawRoundRect(40,40,45,45,10,10);
        g.fillOval(50,50,8,8);
g.fillOval(70,50,8,8);
g.fillOval(50,70,8,8);
g.fillOval(70,70,8,8);
    }
}