import java.awt.*;
import java.applet.*;

public class PraktijkH04 extends Applet {
    Color paars = Color.magenta;
    Color zwart = Color.black;
    public void init() {
    }

    public void paint(Graphics g) {
        g.drawLine(20,5,80,5);
        g.drawRect(20,20,100,30);
        g.setColor(paars);
        g.fillRect(20,80,100,40);
        g.setColor(zwart);
        g.drawOval(20,80,100,40);
        g.drawOval(20,140,100,40);
        g.setColor(paars);
        g.fillArc(20,140,100,40,0,45);
        g.setColor(zwart);
        g.drawRoundRect(200,10,100,50,30,30);
        g.setColor(paars);
        g.fillOval(200,80,100,50);
        g.setColor(zwart);
        g.drawOval(200,150,50,50);
 g.drawString("Lijn",30,17);
 g.drawString("Rechthoek",20,65);
 g.drawString("Gevulde rechthoek met ovaal",20,130);
 g.drawString("Taartpunt met ovaal eromheen", 20,190);
 g.drawString("Afgeronde Rechthoek",200,75);
 g.drawString("Gevulde ovaal",200,140);
 g.drawString("Cirkel",200,210);

    }
}