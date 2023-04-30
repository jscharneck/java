import java.awt.*;
import java.awt.event.*;
import javax.swing.JOptionPane;
import javax.swing.tree.RowMapper;
import javax.swing.*;


public class Reservations extends Frame implements ActionListener
{
    Color lightRed = new Color(255, 90, 90);
    Color lightGreen = new Color(140, 215, 40);

    int roomNonSmoking = 22;
    int roomSmoking = 3;

    Rooms  rooms = new Rooms(roomNonSmoking, roomSmoking);

    Panel roomPanel = new Panel();
        TextArea roomDisplay[] = new TextArea[roomNonSmoking+roomSmoking];

    Panel buttonPanel = new Panel();
        Button bookButton = new Button("Book Room");

    Panel inputPanel = new Panel();
        Label custNameLabel = new Label("Name");
        TextField nameField = new TextField(15);

        Label custPhoneLabel = new Label("Phone number");
        TextField phoneField = new TextField(15);

        Label numLabel = new Label("Number in party:");
        
        Choice numberOfGuests = new Choice();
        CheckboxGroup options = new CheckboxGroup();
            Checkbox nonSmoking = new Checkbox("NonSmoking", false, options);
            // Checkbox smoking = new Checkbox("Smoking", options, false);
            Checkbox smoking = new Checkbox("Smoking", false, options);
            Checkbox hidden = new Checkbox("", true, options);


    public Reservations()
    {
        this.setLayout(new BorderLayout());
            roomPanel.setLayout(new GridLayout(6, 4 , 10, 10));
            buttonPanel.setLayout(new FlowLayout());    
            inputPanel.setLayout(new FlowLayout());    

        for(int i= 1; i<(roomNonSmoking+roomSmoking ); i++ )
        {
            roomDisplay[i] = new TextArea(null, 3, 5, 3);
            // if(i<6)
            if(i<roomNonSmoking)
            {
                roomDisplay[i].setText("Room " + i + " Non Smoking");
            }
            else
            {
                roomDisplay[i].setText("Room "+ i + " Smoking");
            }

            roomDisplay[i].setEditable(false);
            roomDisplay[i].setBackground(lightGreen);
            roomPanel.add(roomDisplay[i]);
        }

        buttonPanel.add(bookButton);

        inputPanel.add(custNameLabel);
        inputPanel.add(nameField);
        inputPanel.add(custPhoneLabel);
        inputPanel.add(phoneField);
        inputPanel.add(numLabel);
        inputPanel.add(numberOfGuests);
            for(int i = 8; i <= 20; i++)
            {
                numberOfGuests.add(String.valueOf(i));
            }

        inputPanel.add(nonSmoking);
        inputPanel.add(smoking);


        add(buttonPanel, BorderLayout.SOUTH);
        add(inputPanel, BorderLayout.CENTER);
        add(roomPanel, BorderLayout.NORTH);

        bookButton.addActionListener(this);

        addWindowListener(
            new WindowAdapter() {
                public void windowClosing(WindowEvent we)
                {
                    System.out.println("closing window");
                    System.exit(0);
                }
            }
        );        
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        System.out.println("hidden getstate"+ hidden);

        if(hidden.getState())
        {            
            JOptionPane.showMessageDialog(null, "you must select Smoking or non smoking", "Error", JOptionPane.ERROR_MESSAGE);            
        }
        else
        {
            // continue here 

        }
    }

    
    
    
    public static void main(String[] args) 
    {
        Reservations reservations = new Reservations();
        reservations.setBounds(200, 200, 1080, 920);
        reservations.setTitle("Reserve a party Room");
        reservations.setVisible(true);
    }

}
