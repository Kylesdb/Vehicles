public class Car extends Vehicle
{
    //instance variables
    private int wheels;
    private int cylinders;
    //constructors
    public Car(String name, boolean isWorking, String tank, double speed, int year, int wheels, int cylinders)
    {
        super(name, isWorking, tank, speed, year);
        this.wheels = wheels;
        this.cylinders = cylinders;
    }
    public void getCylinders()//gets the amount of cylinders a car will have based off this
    {
        if(speed >= 200)
        {
            cylinders = 12;
        }
        else if(speed > 150)
        {
            cylinders = 8;
        }
        else
        {
            cylinders = 4;
        }
    }
    //toString to output
    public String toString()
    {
        return super.toString() + "Wheels: " + wheels + "\nCylinders: " + cylinders;
    }
}
