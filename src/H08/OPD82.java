import java.awt.*;
import java.applet.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OPD82 extends Applet {
    Button bmanp;
    Button bvrouwp;
    Button bman;
    Button bvrouw;
    int totaalman=0;
    int totaalvrouw=0;
    int totaalpman=0;
    int totaalpvrouw=0;
    int totaalalles=0;

    public void init() {
        bman = new Button("Man");
        bman.addActionListener(new Knoplistener1());
        add(bman);

        bmanp = new Button("Potentieel Man");
        bmanp.addActionListener(new Knoplistener2());
        add(bmanp);

        bvrouw = new Button("Vrouw");
        bvrouw.addActionListener(new Knoplistener3());
        add(bvrouw);

        bvrouwp = new Button("Potentieel Vrouw");
        bvrouwp.addActionListener(new Knoplistener4());
        add(bvrouwp);
    }

    public void paint(Graphics g) {
        g.drawString("Totaal = "+ totaalalles,20,40);
        g.drawString("Totaal Mannen = "+totaalman,20,50);
        g.drawString("Totaal Potentieel Mannen = "+totaalpman,20,60);
        g.drawString("Totaal Vrouwen = "+ totaalvrouw,20,70);
        g.drawString("Totaal Potentieel Vrouwen = "+totaalpvrouw,20,80);

    }

    class Knoplistener1 implements ActionListener {
        public void actionPerformed( ActionEvent e) {
            totaalman++;
            totaalalles++;
            repaint();
        }
        }
    class Knoplistener2 implements ActionListener{
        public void actionPerformed( ActionEvent e) {
            totaalpman++;
            totaalalles++;
            repaint();
        }
        }
    class Knoplistener3 implements ActionListener{
        public void actionPerformed( ActionEvent e) {
            totaalvrouw++;
            totaalalles++;
            repaint();
        }
        }
    class Knoplistener4 implements ActionListener{
        public void actionPerformed( ActionEvent e) {
            totaalpvrouw++;
            totaalalles++;
            repaint();
        }
        }
}