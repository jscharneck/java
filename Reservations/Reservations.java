import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class Reservations extends Frame  implements ActionListener

{

    public Reservations()
    {
        Rooms rooms = new Rooms(5, 3);
        
        addWindowListener(
            new WindowAdapter()
            {
                public void windowClosing(WindowEvent e)
                {
                    System.exit(0);
                }
            }
        );
    }


    @Override
    public void actionPerformed(ActionEvent e)
    {

        
        
    }
    
    public static void main(String[] args) {
        Reservations reservations = new Reservations();
        reservations.setBounds(200,200,600,300);
        reservations.setTitle("Reserve a Party Room");
        reservations.setVisible(true);
    }
}
