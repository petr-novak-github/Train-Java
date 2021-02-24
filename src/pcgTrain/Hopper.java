package pcgTrain;

class Hoper implements IWagon
{
    double loadingCapacity;

    public double GetLoadingCapacity()
    {
        return loadingCapacity;
    }

    public void SetLoadingCapacity(double value)
    {
        loadingCapacity = value;
    }
    public Hoper()
    {

    }

    public Hoper(double loadingCapacity)
    {
        this.loadingCapacity = loadingCapacity;
    }

    
    public void ConnectWagon(Train train) { train.GetWagons().add(this); }
    public void DisconnectWagon(Train train)
    {
        if (train.GetWagons().contains(this))
        {
            train.GetWagons().remove(this);
        }
    }




    public String toString()
    {
        return "-- " + getClass().getName().substring(9) + " a ma kapacitu nakladu "+ (int)loadingCapacity;
    }
}