import java.awt.*;
import java.applet.*;

public class OPD extends Applet {
int sommetje = 10;
String naam;
Color rood = Color.red;
public void init() {
sommetje += 8;
System.out.println(sommetje);
    sommetje = 40;
    System.out.println(sommetje);
naam = "Aardappel stampot";
System.out.println(naam);

}

    public void paint(Graphics g) {
g.setColor(rood);
    g.drawRect(sommetje,sommetje,40,40);
    }
}