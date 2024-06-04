public class Main
{
    public static void main(String[] args)
    {
        //list of all the cars and their attributes
        Vehicle common = new Vehicle("Motorcycle",true,"15 gal",215,2012);
        Car lambo = new Car("Lamborghini Aventador",true,"22.5 gal",220,2022,4,6);
        rCar w15 = new rCar("Mercedes W15",true,"1.6L",270,2024,4,8,true);
        Truck f150 = new Truck("Ford F150",false,"23 gal",110,2024,4,0,true);
        Car tPower = new Car("Chevrolet Bel Air Impala Tri-Power",true,"17 gal",175,1958,0,0);
        Quiz quiz = new Quiz("Final Quiz Ever",true,3000);

        Car[] allCars = {lambo, w15, f150, tPower}; //List that references all in Quiz class

        //traversing allCars to make the user guess the speed
        System.out.println(quiz.carQuestions(allCars)); //Outputs the questions

    }
}