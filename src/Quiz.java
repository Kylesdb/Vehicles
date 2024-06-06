import java.util.Scanner; //Getting ready for a user input
public class Quiz
{  //                    --------------------------Instance Variables--------------------------
    private String name;
    private boolean isWorking;
    private double speed;

    public Quiz(String name, boolean isWorking, double speed)
    {
        this.name = name;
        this.isWorking = isWorking;
        this.speed = speed;
    }
    // Car questions method made to give the user a quiz about the car information
    public String carQuestions(Car[] all)
    {
        int userInput = 0;
        int score = 0;

            for (int i = 0; i < all.length; i++) //for loop to traverse "all" array
            {
                Scanner guess = new Scanner(System.in);
                System.out.println("What's the speed of " + all[i].getName() +"?"); // Asking the user a question
                userInput = guess.nextInt(); //Saving the user input in the variable userInput


                if (userInput != 0) // Not = 0 because 0 means the user quits
                {
                    if (userInput > all[i].getSpeed()) //Checking if the userInput is equivalent to that of the car speed
                    {

                        System.out.println("INCORRECT! Too High.(Enter Any number to continue or enter "0" to quit.): "); 
                        //If too high, the user is told, then prompted to continue to the next car
                        userInput = guess.nextInt();
                    }
                    else if (userInput < all[i].getSpeed() && userInput != 0)
                    {
                        System.out.println("INCORRECT! Too Low.(Enter Any number to continue or enter "0" to quit.): "); 
                        // If too low, the user is told, then prompted to continue to the next car
                        userInput = guess.nextInt();
                    }
                    else if (userInput == all[i].getSpeed())  //If the user guesses correctly, then go onto the next car
                    {
                        score++; //One point is added to the score
                        System.out.println("CORRECT!"); //What's returned when the answer's correct
                        userInput = guess.nextInt();
                    }
                }
                else
                {
                    System.out.println("GoodBye!");//The game closes when the user quits
                    break;
                }
            }
        if(score == 4) //return the score percentage
        {
            String output = "% Correct";
            score = score * 25;
            return score + output;
        }
        else if(score == 3)
        {
            score = score * 25;
            return score + output;
        }
        else if(score == 2)
        {
            score = score * 25;
            return score + output;
        }
        else if(score == 1)
        {
            score = score * 25;
            return score + output;
        }
        return score + output;
    }
}
