package pcgTrain;

public class Bed
{
    int number;
    boolean reserved;

    public int GetNumber()
    {
        return number;
    }

    public void SetNumber(int value)
    {
        number = value;
    }

    public boolean GetReserved()
    {
        return reserved;
    }

    public void SetReserved(boolean value)
    {
        reserved = value;
    }

    public Bed()
    {

    }

    public Bed(int number)
    {
        this.number = number;
    }

    public Bed(int number, boolean reserved)  
    {
    	this(number);
        this.reserved = reserved;
    }


}
