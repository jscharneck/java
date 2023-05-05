import javax.swing.JFrame;
import javax.swing.JLabel;

public class App extends JFrame
{

    static UserRecord userRecord = new UserRecord("Jose", 35);
    
    public App(){

        
    }

    public static void main(String[] args) 
    {
        
        System.out.println(userRecord.name());
        App app = new App();

        JLabel nameLabel = new JLabel(userRecord.name() +" "+ userRecord.age());
        app.add(nameLabel);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.setSize(600, 400);
        app.setVisible(true);


       
       
    }
}


