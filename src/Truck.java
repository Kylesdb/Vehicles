public class Truck extends Car
{
    //instance variables
    private final boolean hasBed;
    //contructors

    public Truck(String name, boolean isWorking, String tank, double speed, int year, int wheels, int cylinders, boolean hasBed)
    {
        super(name, isWorking, tank, speed, year, wheels, cylinders);
        this.hasBed = hasBed;
    }
    //toString to output
    public String toString()
    {
        return super.toString() + "\nHas Bed: " + hasBed;
    }
}
