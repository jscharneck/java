public class Rooms
{
    int numNonSmoking;
    int numSmoking;
    boolean occupied[];

    public Rooms(int non, int sm)
    {
        occupied = new boolean[sm+non];

        for( int i = 0 ; i<(sm+non); i++)
        {
            occupied[i] = false;
        }

        numSmoking = sm;
        numNonSmoking = non;    

    }

    public int bookRoom(boolean smoking)
    {
        int roomNumber = 0;
        int begin;
        int end;
        
        if(!smoking)
        {
            begin = 0;
            end = numNonSmoking;
        }
        else
        {
            begin = numNonSmoking;
            end = numNonSmoking+numSmoking;
        }

        for(int i = begin; i<end; ++i)
        {
            if(!occupied[i])
            {
                occupied[i] = true;
                roomNumber = i+1;

                i = end;
            }
        }

        return roomNumber;
    }
}