import javax.swing.JFrame;

public class Program extends JFrame
{
    public static void main(String[] args) 
    {
        var p1 = new Person("JoseS", 37);
        
        Program frame =  new Program();
        frame.setBounds(200, 200, 400,300);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}