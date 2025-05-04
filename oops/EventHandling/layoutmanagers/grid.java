package oops.EventHandling.layoutmanagers;
import java.awt.*;
import java.awt.event.*;
public class grid extends Frame{

      Button bt1,bt2,bt3,bt4;
       public grid(){

         setLayout(new GridLayout(2,2));
         bt1 = new Button("grid 1");        
         bt2 = new Button("grid 2");
         bt3 = new Button("grid 3");
         bt4 = new Button("grid 4");

         add(bt1);
         add(bt2);
         add(bt3);
         add(bt4);         
         
        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                 System.exit(0);
            }
         });
        
         setSize(300,400);
         setTitle("grid layout example");
         setVisible(true);
       }
       public static void main(String[] args) {
         new grid();
       }
}
