package pcgTrain;

public class Locomotive
{
    private Person driver;
    private Engine engine;

    public Person GetDriver()
    {
        return driver;
    }

    public void SetDriver(Person value)
    {
        driver = value;
    }

    public Engine GetEngine()
    {
        return engine;
    }

    public void SetEngine(Engine value)
    {
        engine = value;
    }

    public Locomotive()
    {

    }

    public Locomotive(Person driver, Engine engine)
    {
        this.driver = driver;
        this.engine = engine;
    }

    public String toString()
    {
        return " s ridicem " + this.driver.toString();
    }
}
