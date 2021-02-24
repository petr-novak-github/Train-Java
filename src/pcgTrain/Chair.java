package pcgTrain;

public class Chair
{
    Boolean nearWindow;
    int number;
    Boolean reserved;

    public Boolean GetNearWindow()
    {
        return nearWindow;
    }

    public void SetNearWindow(Boolean value)
    {
        nearWindow = value;
    }

    public int GetNumber()
    {
        return number;
    }

    public void SetNumber(int value)
    {
        number = value;
    }

    public Boolean GetReserved()
    {
        return reserved;
    }

    public void SetReserved(Boolean value)
    {
        reserved = value;
    }

    public Chair()
    {

    }

    public Chair(int number)
    {
        this.number = number;
        this.reserved=false;
    }

    public Chair(int number, Boolean reserved)
    {
    	this(number);
        this.reserved = reserved;
    }
    // volani pretizeneho konstruktoru c sharp
    //public Chair(int number, bool reserved) : this(number)
    //{
    //    this.reserved = reserved;
    //}

    public Chair(Boolean nearWindow, int number, Boolean reserved)
    {
    	this(number, reserved);
        this.nearWindow = nearWindow;
       
    }




}
