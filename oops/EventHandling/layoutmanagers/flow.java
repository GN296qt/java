package oops.EventHandling.layoutmanagers;
import java.awt.*;
import java.awt.event.*;
// inhrits frame class
public class flow  extends Frame{

     // declare buttons
     Button bt1,bt2,bt3;

    //constructor
     public flow(){

           //layout manager
            setLayout(new FlowLayout());

            // intialization of buttons
             bt1 = new Button("button 1");
             bt2 = new Button("button 2");
             bt3 = new Button("button 3");

             // add buttons to frame
             add(bt1);
             add(bt2);
             add(bt3);

             // handling window closing event
             addWindowListener(new WindowAdapter() {
                public void windowClosing(WindowEvent e) { System.exit(0); }
            });
    
            // setting window properties
            setSize(300,600);
            setTitle("flow layout example");
            setVisible(true);
            
     }
// main method
     public static void main(String[] args) {
        new flow();// new instance
     }
}
