public class Vehicle
{
    //instance variables
    private String name;
    private boolean isWorking;
    private String tank;
    double speed;
    int year;
    //constructors
    public Vehicle(String name, boolean isWorking, String tank, double speed, int year)
    {
        this.name = name;
        this.isWorking = isWorking;
        this.tank = tank;
        this.speed = speed;
        this.year = year;
    }

    //getters
    public String getName()
    {
        return name;
    }
    public double getSpeed()
    {
        return speed;
    }
    public String setName(String reName)
    {
        name = reName;
        return reName;
    }

    public String toString(String output)
    {
        output = "\nCar Name: " + name + "\nIs Working: " + isWorking + "\nTank Limit: " +
                tank + "\nSpeed: " + speed + "\nYear: " + year + "\n";
        return output;
    }
}
