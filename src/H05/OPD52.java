import java.awt.*;
import java.applet.*;

public class OPD52 extends Applet {
    int gewichtjeroen = 100;
    int gewichthans = 80;
    int gewichtvalerie = 40;

    public void init() {
    }

    public void paint(Graphics g) {
        g.drawString("0Kg",0,20);
        g.drawString("20Kg",0,40);
        g.drawString("40Kg",0,60);
        g.drawString("60Kg",0,80);
        g.drawString("80Kg",0,100);
        g.drawString("100Kg",0,120);

        g.setColor(Color.green);
        g.fillRect(40,20,20,gewichtjeroen);
        g.setColor(Color.red);
        g.fillRect(85,20,20,gewichthans);
        g.setColor(Color.blue);
        g.fillRect(130,20,20,gewichtvalerie);
        g.setColor(Color.black);
        g.drawString("Jeroen",40,20);
        g.drawString("Hans",85,20);
        g.drawString("Valerie",130,20);
        g.setColor(Color.black);
        g.drawLine(0,20,180,20);
        g.drawLine(0,40,180,40);
        g.drawLine(0,60,180,60);
        g.drawLine(0,80,180,80);
        g.drawLine(0,100,180,100);
        g.drawLine(0,120,180,120);
    }
}