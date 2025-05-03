package oops.applets;
import java.awt.*;// all awt classes
import java.awt.event.*;// all event handling classes


//awtwindow is a public class which inherits from frame class 1. making a window to display gui componnets 2. and also handles action events by implemnting ActionListener
public class awtwindow extends Frame implements ActionListener{
    // declaration instance avriables
      Label l1,l2,l3;
      Button bt1,bt2,bt3;
      String msg = "";
      
      // constructorcd basci
      public awtwindow(){

            // layout manager : flowlayout(aranges components sequentially from l to r)
             setLayout(new FlowLayout());
            // intialization labels 
             l1 = new Label("one");
             l2 = new Label("two");
             l3 = new Label("three");
            // intialization buttons
             bt1 = new Button("ok");
             bt2 = new Button("cancel");
             bt3 = new Button("retry");
            // add components to the frame : display components on frame
             add(l1);
             add(l2);
             add(l3);
             add(bt1);
             add(bt2);
             add(bt3);
            // registering Action Listener for buttons
            // Attaches the current object (this) as the listener for button click events using addActionListener.
            // When any of these buttons are clicked, the actionPerformed method in this class will be invoked
             bt1.addActionListener(this);
             bt2.addActionListener(this);
             bt3.addActionListener(this);
            // addWindowListener
            // Adds a window listener using addWindowListener to handle window-closing events.
            //WindowAdapter: allowing you to override only the required method (windowClosing).
            //windowClosing: Ensures the program exits when the user closes the window
             addWindowListener(new WindowAdapter(){
                 public void windowClosing(WindowEvent e){
                      System.exit(0);
                 }
     
             });

      }
      // handling button click events
      //actionPerformed: Method required by the ActionListener interface. Handles button click events.
      //ActionEvent ae: Represents the event triggered when a button is clicked.
      //ae.getActionCommand(): Retrieves the label of the button that was clicked (e.g., "ok", "cancel")
      public void actionPerformed(ActionEvent ae){
        String str = ae.getActionCommand();
        //checking button labels
        // Compares the label of the button (str) to determine which button was clicked.
        // Updates the message (msg) based on the button label
        if(str.equals("ok")){
            msg ="you pressed ok";

        }else if(str.equals("cancel")){
            msg = "you pressed cancel";
        }
        repaint();//Calls the paint() method to redraw the frame with the updated message.

      }
      //painting the message
      public void paint(Graphics g){//Called automatically when repaint() is invoked.
        g.drawString(msg,20,100);// Draws the string stored in msg at coordinates (20, 100) on the frame.
      }
      public static void main(String[] args) {
        awtwindow w1 = new awtwindow(); //instance
        // seetting frame properties
        w1.setSize(new Dimension(300,200));//dimensions
        w1.setTitle("awt window demo");//title
        w1.setVisible(true);//window visible to user
      }
}

// execution flow 

// The awtwindow constructor sets up the GUI components (labels, buttons, layout).
// Clicking a button triggers the actionPerformed method, which updates the message (msg) and refreshes the frame using repaint().
// The message is drawn on the frame using the paint(Graphics g) method.
// Closing the window exits the program via System.exit(0).
