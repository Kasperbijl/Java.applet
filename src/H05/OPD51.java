import java.awt.*;
import java.applet.*;

public class OPD51 extends Applet {
    Color opvul = Color.magenta;
    Color lijn = Color.black;
    int Breedte;
    int Breedte2;
    public void init() {
        Breedte = 20;
        Breedte2 = 200;
    }


    public void paint(Graphics g) {
        g.drawLine(Breedte,5,80,5);
        g.drawRect(Breedte,20,100,30);
        g.setColor(opvul);
        g.fillRect(Breedte,80,100,40);
        g.setColor(lijn);
        g.drawOval(Breedte,80,100,40);
        g.drawOval(Breedte,140,100,40);
        g.setColor(opvul);
        g.fillArc(Breedte,140,100,40,0,45);
        g.setColor(lijn);
        g.drawRoundRect(Breedte2,10,100,50,30,30);
        g.setColor(opvul);
        g.fillOval(Breedte2,80,100,50);
        g.setColor(lijn);
        g.drawOval(Breedte2,150,50,50);
        g.drawString("Lijn",30,17);
        g.drawString("Rechthoek",Breedte,65);
        g.drawString("Gevulde rechthoek met ovaal",Breedte,130);
        g.drawString("Taartpunt met ovaal eromheen", Breedte,190);
        g.drawString("Afgeronde Rechthoek",Breedte2,75);
        g.drawString("Gevulde ovaal",Breedte2,140);
        g.drawString("Cirkel",Breedte2,210);

    }
}