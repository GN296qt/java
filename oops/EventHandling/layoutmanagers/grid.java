package oops.EventHandling.layoutmanagers;
import java.awt.*;
import java.awt.event.*;
// inherits from frame class
public class grid extends Frame{
    // declaration of buttons
      Button bt1,bt2,bt3,bt4;

      //constructor
      public grid(){
             // layout manager
         setLayout(new GridLayout(2,2));
         bt1 = new Button("grid 1");        
         bt2 = new Button("grid 2");
         bt3 = new Button("grid 3");
         bt4 = new Button("grid 4");

         // add buttons to frame
         add(bt1);
         add(bt2);
         add(bt3);
         add(bt4);         
         
         // handling window closing evnt
        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                 System.exit(0);
            }
         });
        
         // seeting window properties
         setSize(300,400);
         setTitle("grid layout example");
         setVisible(true);
       }
       // main method
       public static void main(String[] args) {
         new grid();//new instance 
       }
}
