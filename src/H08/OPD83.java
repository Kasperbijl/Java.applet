import java.awt.*;
import java.awt.event.*;
import java.applet.*;


public class OPD83 extends Applet implements ActionListener {
    TextField t1, t2;
    Button b1;
    Label l1, l2;

    public void init() {
        l1 = new Label("Ex Btw");
        add(l1);
        t1 = new TextField("", 20);
        add(t1);
        t1.addActionListener( new EnterListener() );
        l2 = new Label("Inc Btw");
        add(l2);
        t2 = new TextField("", 20);
        add(t2);
        b1 = new Button("Ok");
        add(b1);
        b1.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            double x = Double.parseDouble(t1.getText());
            double y = 1.21;
            double btw = x * y;
            t1.setText("");
            t2.setText("" + btw);
            repaint();
        }
    }
    class EnterListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            double x = Double.parseDouble(t1.getText());
            double y = 1.21;
            double btw = x * y;
            t1.setText("");
            t2.setText("" + btw);
            repaint();
        }
    }
}
