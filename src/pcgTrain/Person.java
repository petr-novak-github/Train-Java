package pcgTrain;

public class Person
{
    String firstName;
    String lastName;

    public String GetFirstName()
    {
        return firstName;
    }

    public void SetFirstName(String value)
    {
        firstName = value;
    }

    public String GetLastName()
    {
        return lastName;
    }

    public void SetLastName(String value)
    {
        lastName = value;
    }

    public Person()
    {
            
    }

    public Person(String firstName, String lastName)
    {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public  String toString()
    {
        return " se jmenem: "+ firstName + " "+ lastName;
    }
}
