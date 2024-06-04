public class rCar extends Car
{
    //instance variables
    private boolean canRace;
    //constructors
    public rCar(String name, boolean isWorking, String tank, double speed, int year, int wheels, int cylinders, boolean canRace)
    {
        super(name, isWorking, tank, speed, year, wheels, cylinders);
        this.canRace = canRace;
    }
    public boolean getCanRace() //checks the race car to see if it can race
    {
        if(getSpeed() <= 215)
        {
            canRace = false;
        }
        else
        {
            canRace = true;
        }
        return canRace;
    }
    public String toString() //toString to output it
    {
        return super.toString() + "\nCan Race: " + getCanRace();
    }
}
