// package
package oops.EventHandling;
// imports
import java.awt.*;
import java.awt.event.*;
// Eventdemo is public class inheriting from frame class
public class Delegationevent extends Frame {
     //declaration of awt controllers
     Button btn1,btn2;
     Label lbl;
     // constructor
     public Delegationevent (){
          // layoiut manager
          setLayout(new FlowLayout());
          
          //intialiazaton of awt controller
          lbl = new Label("click a button");
          btn1 = new Button("ok");
          btn2 = new Button("cancel");
          
          // addcomponents to frame
          add(lbl);
          add(btn1);
          add(btn2);
         
         // registers an event listener for btn1 using inner class
         // when btn1 is clicked . it triggers ButtonHandler
          btn1.addActionListener(new ButtonHandler());

          // registers an event ahndler for btn2 using anonymous inner class
          // when btn2 is clicked it updates the label
          btn2.addActionListener(new ActionListener(){
               public void actionPerformed(ActionEvent e){
                    lbl.setText("cancel pressed");
               }
          });
          
          // handling window closing event
          addWindowListener(new WindowAdapter(){
               public void windowClosing(WindowEvent e){// WindowAdapter id an adapter class to handle window closing events
                    System.exit(0);// exits the program when the user closes the window
               }
          });

          // setting window properties
          setSize(300,400);
          setTitle("event handling demo");
          setVisible(true);

        }

        //inner class - implemnts ActionListener in button class
          class ButtonHandler implements ActionListener{
               public void actionPerformed(ActionEvent e){
                    lbl.setText("ok pressed");
               }
          }

          // main method - entry point of execution
          public static void main(String[] args) {
               new Delegationevent();// instance od Eventdemo
          }
         
     }

// Delegation Event Model: Events are delegated to specific listeners
//  Event Classes & Listeners: ActionEvent, ActionListener used for handling button clicks
//  Adapter Classes: WindowAdapter used for handling window closing
// Inner Classes:
// - Regular Inner Class (ButtonHandler)
// - Anonymous Inner Class (ActionListener for btn2)

