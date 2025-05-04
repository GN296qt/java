package oops.EventHandling;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class swings extends JFrame implements ActionListener {
    JLabel lb;
    JButton btn;
    JTextField tf;
    JTextArea ta;
    JComboBox<String> c;
    JList<String> l;
    JSlider s;
    JCheckBox cb1, cb2;
    JPanel p;

    public swings() {
        setLayout(new BorderLayout());

        p = new JPanel();
        p.setLayout(new FlowLayout());

        lb = new JLabel(" swing control");

        btn = new JButton("click me");
        btn.addActionListener(this);

        tf = new JTextField(20);

        ta = new JTextArea("writes aomething here", 4, 30);

        c = new JComboBox(new String[] { "option 1", "option 2", "option 3" });

        l = new JList(new String[] { "item A", "item B", "item C" });
        l.setVisibleRowCount(3);

        s = new JSlider(JSlider.HORIZONTAL, 0, 100, 50);

        cb1 = new JCheckBox("check me");
        cb2 = new JCheckBox("Agree", true);

        p.add(lb);
        p.add(btn);
        p.add(tf);
        p.add(ta);
        p.add(c);
        p.add(cb1);
        p.add(cb2);

        add(p, BorderLayout.CENTER);
        add(s, BorderLayout.SOUTH);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 300);
        setTitle("Swing Controls Demo");
        setVisible(true);

    }

    public void actionPerformed(ActionEvent e) {
        lb.setText("button clicked");
    }

    public static void main(String[] args) {
        new swings();
    }

}
