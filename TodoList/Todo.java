
import java.sql.*;
//import org.sqlite.JDBC;



public class Todo
{

    public static void main(String[] args) 
    {
        Connection c = null;

        try 
        {
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:test.db");

            c.close();
        } 
        catch ( Exception e )
        {
            System.err.println( e.getClass().getName() + ": " + e.getMessage() );
            System.exit(0);
        }
         
        System.out.println("Opennnned database successfully");

        // System.out.println("Hello Todo  ");

        // System.out.println(TodoList.getList());
    }
}