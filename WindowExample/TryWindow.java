import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.plaf.TreeUI;

public class TryWindow 
{
    public TryWindow()
    {
        JFrame aWindow = new JFrame("This is the Window Title");
        int windowWidth = 400; // Window width in pixels
        int windowHeight = 150; // Window height in pixels
        aWindow.setBounds(50, 100, windowWidth, windowHeight); // and size
        aWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        aWindow.setVisible(true); // Display the window
        aWindow.setDefaultLookAndFeelDecorated(true);

    } 
    public static void createWindow()
    {
        
    }
    public static void main(String[] args) 
    {
        SwingUtilities.invokeLater(
            new Runnable()
            {
                public void run() 
                {
                    new TryWindow();
                    new TryWindow();
                }
            }
        );
    }
}