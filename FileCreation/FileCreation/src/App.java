import java.io.File;

public class App 
{
    public static void main(String[] args) throws Exception 
    {     

        
        try 
        {
            File myObjFile = new File("./files/WTF.txt");

            if(myObjFile.createNewFile())
            {
                System.out.println("New file has been created!");
            }
            else
            {
                System.out.println("File already exists");
            }

        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Error has errorrrrrrrrrrrrrr");
        }

    }
}
