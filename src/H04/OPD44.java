import java.awt.*;
import java.applet.*;

public class OPD44 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
g.drawString("100Kg",0,20);
g.drawString("80Kg",0,40);
 g.drawString("60Kg",0,60);
 g.drawString("40Kg",0,80);
g.drawString("20Kg",0,100);
g.drawString("0Kg",0,120);

g.setColor(Color.green);
g.fillRect(40,20,20,100);
g.setColor(Color.red);
g.fillRect(85,40,20,80);
g.setColor(Color.blue);
g.fillRect(130,80,20,40);
g.setColor(Color.black);
g.drawString("Jeroen",40,130);
g.drawString("Hans",85,130);
g.drawString("Valerie",130,130);
g.setColor(Color.black);
g.drawLine(0,20,180,20);
g.drawLine(0,40,180,40);
g.drawLine(0,60,180,60);
g.drawLine(0,80,180,80);
g.drawLine(0,100,180,100);
g.drawLine(0,120,180,120);
    }
}