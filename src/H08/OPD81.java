import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class OPD81 extends Applet {
    TextField tekstvak;
    Label label;
    String getal;
    Button reset;

    public void init() {
        tekstvak = new TextField("", 20);
        label = new Label("Type hier je tekst");
        tekstvak.addActionListener( new TekstvakListener() );
        reset = new Button("Reset");
        reset.addActionListener(new Knoplistener());
        add(reset);
        add(label);
        add(tekstvak);
    }

    public void paint(Graphics g) {
        g.drawString("Antwoord = " + getal, 50, 60 );
    }
class Knoplistener implements ActionListener{
        public void actionPerformed( ActionEvent e){
            tekstvak.setText("");
            repaint();
        }
}

    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            getal =(tekstvak.getText());
            repaint();
        }
    }
}