import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class PraktijkH08 extends Applet implements ActionListener {
    TextField t1, t2;
    Button b1, b2, b3, b4;
    public void init() {
        t1 = new TextField(15);
        add(t1);
        t2 = new TextField(15);
        add(t2);
        b1 = new Button("Plus");
        add(b1);
        b1.addActionListener(this);
        b2 = new Button("Min");
        add(b2);
        b2.addActionListener(this);
        b3 = new Button("Keer");
        add(b3);
        b3.addActionListener(this);
        b4 = new Button("Delen");
        add(b4);
        b4.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            int x = Integer.parseInt(t1.getText());
            int y = Integer.parseInt(t2.getText());
            int plus = x + y;
            t1.setText(" " + plus);
            t2.setText("");
        }
        if (e.getSource() == b2) {
            int x = Integer.parseInt(t1.getText());
            int y = Integer.parseInt(t2.getText());
            int min = x - y;
            t1.setText(" " + min);
            t2.setText("");
        }
        if (e.getSource() == b3) {
            int x = Integer.parseInt(t1.getText());
            int y = Integer.parseInt(t2.getText());
            int keer = x * y;
            t1.setText(" " + keer);
            t2.setText("");
        }
        if (e.getSource() == b4) {
            int x = Integer.parseInt(t1.getText());
            int y = Integer.parseInt(t2.getText());
            int deel = x / y;
            t1.setText(" " + deel);
            t2.setText("");
        }
    }
}