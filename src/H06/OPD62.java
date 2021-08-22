import java.awt.*;
import java.applet.*;

public class OPD62 extends Applet {
    int jaar ,dag, uur ,sec,uitjaar,uitdag,uituur;

    public void init() {
        jaar = 365;
        dag = 24;
        uur = 60;
        sec = 60;
        uituur = (sec*uur);
        uitdag = (uituur*dag);
        uitjaar = (uitdag*jaar);

    }

    public void paint(Graphics g) {
        g.drawString("Seconden in een uur: " + uituur,20,20);
        g.drawString("Seconden in een dag: " + uitdag,20,30);
        g.drawString("Seconden in een jaar: "+ uitjaar,20,40);

    }
}