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
    //create variable to store input and answer
    private int value;
    private int solution = 1;

    public void getValue()
    {
        //gets user input
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a positive whole number: ");
        value = input.nextInt();
    }
    public void findFactorial()
    {

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
