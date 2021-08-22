import java.awt.*;
import java.applet.*;

public class OPD43 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
g.fillRect(0,0,20,180);
g.setColor(Color.red);
g.fillRect(20,0,70,30);
g.setColor(Color.white);
g.fillRect(20,30,70,30);
 g.setColor(Color.blue);
g.fillRect(20,60,70,30);
    }

}