

public class CMD
{
   
    public static void main(String[] args)
    {
        try
        {
            // Just one line and you are done ! 
            // We have given a command to start cmd
            // /K : Carries out command specified by string
           Runtime.getRuntime().exec(new String[] {"cmd", "/K", "Start"});
  
        }
        catch (Exception e)
        {
            System.out.println("HEY Buddy ! U r Doing Something Wrong ");
            e.printStackTrace();
        }
    }
}