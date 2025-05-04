package oops.EventHandling.layoutmanagers;
import java.awt.*;
import java.awt.event.*;
public class flow  extends Frame{


     Button bt1,bt2,bt3;

     public flow(){

            setLayout(new FlowLayout());

             bt1 = new Button("button 1");
             bt2 = new Button("button 2");
             bt3 = new Button("button 3");

             add(bt1);
             add(bt2);
             add(bt3);

             addWindowListener(new WindowAdapter() {
                public void windowClosing(WindowEvent e) { System.exit(0); }
            });
    
            setSize(300,600);
            setTitle("flow layout example");
            setVisible(true);
            
     }

     public static void main(String[] args) {
        new flow();
     }
}
