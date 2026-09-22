/*
 * Factorial
 * Juilee Joshi
 * Gets user input and finds the factorial of the number that is inputted
 *
 * Resources: NONE
 *
 */
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

        //prints the formula to the user
        System.out.println("This is the formula for doing factorial: " + value + "!");
        System.out.println("This means that your number will be multiplied by every positive integer less than itself, stopping at one");

        //uses for loop to decrement the value and multiply to get answer
        for (int j = value; j > 0; j--)
        {
            solution = solution * j;
        }

        //prints answer
        System.out.println("Your factorial answer is: " + solution);
    }
    
}
