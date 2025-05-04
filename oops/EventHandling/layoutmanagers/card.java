package oops.EventHandling.layoutmanagers;
import java.awt.*;
import java.awt.event.*;
public class card extends Frame implements ActionListener {
    // instance variable declaration
    CardLayout card;// manage multiple pannel
    Panel mainPanel; // holds diff layouts
    Button btnNext; // switch between panels

    public card(){
        // setting layout for frame
         setLayout(new BorderLayout());

        //  intializing cardlayout
        card = new CardLayout();
        mainPanel = new Panel(card);

        // creating panels
        Panel p1 = new Panel();
        p1.setBackground(Color.RED);
        p1.add(new Label("panel 1 - red"));

        Panel p2 = new Panel();
        p2.setBackground(Color.GREEN);
        p2.add(new Label("panel 2 - green"));

        // adding panels to cardlayout
        mainPanel.add(p1,"Panel1");
        mainPanel.add(p2,"panel2");

        // intializing button
        btnNext = new Button("next panel");
        btnNext.addActionListener(this);

        // add components to frame
        add(mainPanel,BorderLayout.CENTER);   
        add(btnNext,BorderLayout.SOUTH);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) { System.exit(0); }
        });

        setSize(400, 300);
        setTitle("CardLayout Example");
        setVisible(true);
     }

     public void actionPerformed(ActionEvent e) {
         card.next(mainPanel);
     }
      public static void main(String[] args) {
              new card();
}

}
