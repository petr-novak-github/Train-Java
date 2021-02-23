package pcgTrain;

import java.util.ArrayList;
import java.util.List;



public abstract class PersonalWagon implements IWagon
{
    List<Door> doors;
    List<Chair> sits;
    int numberOfChairs;

    public int GetNumberOfChairs()
    {
        return numberOfChairs;
    }

    public void SetNumberOfChairs(int value)
    {
        numberOfChairs = value;
    }

    public List<Chair> GetSits()
    {
        return sits;
    }

    public void SetSits(List<Chair> value)
    {
        sits = value;
    }

    public PersonalWagon()
    {

    }

    public void ConnectWagon(Train train)
    {
        if (train.Wagons.Count() < 5)
        {
            train.Wagons.Add(this);
        }


        else
        {
            System.out.println("too many wagons, not possible connect another..");
        }
    }

    public void DisconnectWagon(Train train)
    {
        if (train.Wagons.Contains(this))
        {
            train.Wagons.Remove(this);
        }
    }

    protected PersonalWagon(int numberOfChairs)
    {
        this.SetNumberOfChairs(numberOfChairs);

        this.sits = new ArrayList<Chair>(numberOfChairs);

        for (int i = 0; i < numberOfChairs; i++)
        {
            var kreslo = new Chair(i);
            sits.add(kreslo);
        }


    }

    public  String toString()
    {
        return "--" + getClass().getName()+" s poctem sedadel"+ GetNumberOfChairs() ;
    }
}
