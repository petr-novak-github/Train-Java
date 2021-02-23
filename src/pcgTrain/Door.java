package pcgTrain;

public class Door
{
    double height;
    double width;

    public double GetHeight()
    {
        return height;
    }

    public void SetHeight(double value)
    {
        height = value;
    }

    public double GetWidth()
    {
        return width;
    }

    public void SetWidth(double value)
    {
        width = value;
    }

    public Door()
    {

    }

    public Door(double height, double width)
    {
        this.height = height;
        this.width = width;
    }




}