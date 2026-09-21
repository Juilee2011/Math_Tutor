import java.util.Scanner;
public class Factorial 
{
    public void getValue()
    {
        //create variable to store input
        private int value;

        //gets user input
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a whole number: ");
        value = input.nextInt();
        input.close();
    }
    public void findFactorial()
    {
        //declare variable to store answer
        private int solution = 1;

        //uses for loop to decrement the value and multiply to get answer
        for (int j = value; j > 0; j--)
        {
            solution = solution * j;
        }

        //prints answer
        System.out.println("Your factorial answer is: " + solution);
    }
    
}
