import java.awt.*;
import java.applet.*;

public class OPD46 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
 g.setColor(Color.black);
        g.fillRect(0,0, 90,200);
      g.setColor(Color.red);
        g.fillOval(20,20,50,50);
g.setColor(Color.yellow);
        g.fillOval(20,80,50,50);
   g.setColor(Color.green);
    g.fillOval(20, 140,50,50);

    }

}