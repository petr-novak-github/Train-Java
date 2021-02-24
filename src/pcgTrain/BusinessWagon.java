package pcgTrain;

public class BusinessWagon extends PersonalWagon
{
    Person steward;

    Person GetSteward()
    {
        return steward;
    }

    void SetSteward(Person value)
    {
        steward = value;
    }

    public BusinessWagon()
    {

    }

    public BusinessWagon(Person steward)
    {
        this.steward = steward;
    }

    public BusinessWagon(int numberOfChairs)
    {
     super(numberOfChairs);
    }

    public BusinessWagon(int numberOfChairs, Person steward)
    {
    	super(numberOfChairs);
        this.steward = steward;
    }

    public String toString()
    {
        return super.toString() + " a ma stewarda " + steward.toString();
    }
}
