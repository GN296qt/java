package oops.EventHandling.layoutmanagers;
import java.awt.*;
import java.awt.event.*;
// inherits frame class
public class border extends Frame {
    // declare buttons
    Button bt1,bt2,bt3,bt4,bt5;

    // constructor
    public border(){

        // layout manager
       setLayout(new BorderLayout());

       // intialization of buttons
       bt1 = new Button("noth");
       bt2 = new Button("south");
       bt3 = new Button("east");
       bt4 = new Button("west");
       bt5 = new Button("center");      
       
       // add buttons to frame
       add(bt1);
       add(bt2);
       add(bt3);
       add(bt4);
       add(bt5);       

       // handling window closing event
       addWindowListener( new WindowAdapter(){
          public void windowClosing(WindowEvent e){
              System.exit(0);
          }
       });

       // setting window properties
       setSize(300,400);
       setTitle("border layout example");
       setVisible(true);

    }

    // main method
    public static void main(String[] args) {
        new border();//new instance
    }
}
