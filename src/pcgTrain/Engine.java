package pcgTrain;

public class Engine
{
    String type;

    public String GetType()
    {
        return type;
    }

    public void SetType(String value)
    {
        type = value;
    }

    public Engine()
    {

    }

    public Engine(String type)
    {
        this.type = type;
    }

    public String toString()
    {
        return "Motor je typu:"+ type;
    }
}