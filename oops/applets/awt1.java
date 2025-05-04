package oops.applets;
import java.awt.*;
import java.awt.event.*;

public class awt1 extends Frame implements ActionListener{
    
    Label lbl;
    TextField tf;
    Button btn ;
    TextArea ta ;
    Choice c;
    List l;
    Checkbox cb1,cb2;
    Scrollbar sb ;

    public awt1(){

        setLayout(new FlowLayout());
        lbl = new Label("awt example");
        tf = new TextField(20);
        ta = new TextArea("write something here",4,30);
        btn = new Button("click me");
        c = new Choice();
        c.add("option 1");
        c.add("option 2");
        c.add("option 3");

        l = new List(3);
        l.add("item 1");
        l.add("item 2");
        l.add("item 3");

        sb = new Scrollbar(Scrollbar.HORIZONTAL,50,10,0,100);

        cb1 = new Checkbox("check me");
        cb2 = new Checkbox("agrre me",true);

        btn.addActionListener(this);

        add(lbl);
        add(btn);
        add(tf);
        add(ta);
        add(c);
        add(sb);
        add(cb1);
        add(cb2);
        add(l);

        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });
        
       
        setSize(400,300);
        setTitle("awt controllers");
        setVisible(true);

    }
        public void actionPerformed(ActionEvent e){
              lbl.setText("Button clicked");
        }
        
        public static void main(String[] args) {
             new awt1();
        }

} 
