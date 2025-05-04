package oops.EventHandling.layoutmanagers;
import java.awt.*;
import java.awt.event.*;
// inherits frame class
public class gridbag extends Frame{

    // declaration of buttons
    Button bt1,bt2,bt3,bt4;

    // constructor
    public gridbag(){
        // layout manager
        setLayout(new GridBagLayout());

        // intializationof buttons
        bt1 = new Button(" gridbag  1");        
        bt2 = new Button(" gridbag  2");
        bt3 = new Button(" gridbag  3");
        bt4 = new Button(" gridbag  4");    
        
        // gridbag constraints
        GridBagConstraints gbc = new GridBagConstraints();// gbc is an object of gridbagconstraints class

        // adding components to position in frame

        gbc.gridx = 0;
        gbc.gridy = 1;
        add(bt1,gbc);

        gbc.gridx = 1;
        add(bt2,gbc);

        gbc.gridx = 1;
        gbc.gridy = 0;
        add(bt3,gbc);

        gbc.gridx = 0;
        add(bt4,gbc);

        // handling window closing event
        addWindowListener(new WindowAdapter (){
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });

        //  setting window properties
        setSize(300,400);
        setTitle(" gridbag example");
        setVisible(true);
    }
    // main method
    public static void main(String[] args) {
            new gridbag();//new instance
    }
}
