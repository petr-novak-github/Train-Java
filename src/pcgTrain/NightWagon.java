package pcgTrain;

import java.util.ArrayList;
import java.util.List;

public class NightWagon extends PersonalWagon
{
    List<Bed> beds;
    int numberOfBeds;

    public NightWagon()
    {

    }
        

    public NightWagon(int numberOfBeds, int numberOfChairs)
    {
    	super(numberOfChairs);
        this.numberOfBeds = numberOfBeds;

        List<Bed> beds = new ArrayList<Bed>(numberOfBeds);

        for (int i = 0; i < numberOfBeds; i++)
        {
            var postel = new Bed(i);
            beds.add(postel);
        }

    }

    public String toString()
    {
        return super.toString() + " a ma"+ numberOfBeds + " posteli";
    }
}