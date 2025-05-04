package oops.applets;
//imports
import java.awt.*;
import java.awt.event.*;

// main class
public class awt1 extends Frame implements ActionListener{
    
    // declaration of awt controllers
    Label lbl;
    TextField tf;
    Button btn ;
    TextArea ta ;
    Choice c;
    List l;
    Checkbox cb1,cb2;
    Scrollbar sb ;

    //constructor
    public awt1(){

        // layout manager
        setLayout(new FlowLayout());

        //intialization of awt controller
        lbl = new Label("awt example");
        tf = new TextField(20);
        ta = new TextArea("write something here",4,30);
        btn = new Button("click me");

        c = new Choice();
        c.add("option 1");
        c.add("option 2");
        c.add("option 3");

        l = new List(3);// list of 3 items
        l.add("item 1");
        l.add("item 2");
        l.add("item 3");

        sb = new Scrollbar(Scrollbar.HORIZONTAL,50,10,0,100);//horizontal scrollbar

        cb1 = new Checkbox("check me");// default unchecked
        cb2 = new Checkbox("agrre me",true);// default checked

        // register button to action listener
        btn.addActionListener(this);

        // add components to frame
        add(lbl);
        add(btn);
        add(tf);
        add(ta);
        add(c);
        add(sb);
        add(cb1);
        add(cb2);
        add(l);

        // window listener for closing
        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });
        
       // setting window properties
        setSize(400,300);
        setTitle("awt controllers");
        setVisible(true);

    }
    // action performed for button clicks
        public void actionPerformed(ActionEvent e){
              lbl.setText("Button clicked");
        }
        // main method
        public static void main(String[] args) {
             new awt1();// new instance of awt1 class
        }

} 
