 /*
 * PythTheorem
 * Juilee Joshi
 * Takes user input and finds the missing hypotenuse side of a right triangle using Pythagorean Theorem
 *
 * Resources: NONE
 *
 */
import java.util.Scanner;
public class PythTheorem 
{
    //declare variables that store side inputs
    private double a;
    private double b;
    private double missing;
    private double answer;

    public void getSides()
    {
        //gets user input
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the first given side: ");
        a = input.nextDouble();
        System.out.println("Please enter the second side in order to find the hypotenuse: ");
        b = input.nextDouble();

        //checks if sides are negative
        if (a < 0)
        {
            System.out.println("Error! Please enter a positive side!");
        }
        if (b < 0)
        {
            System.out.println("Error! Please enter a positive side!");
        }

        // prints the formula to the user and finds the missing side (hypotenuse)
        System.out.println("The Pythagorean Theorem is: a ^ 2 + b ^ 2 = c ^ 2");
        missing = Math.pow(a, 2) + Math.pow(b, 2);
        answer = Math.sqrt(missing);

        //prints answer
        System.out.println("Your hypotenuse is: " + answer);

    }
    
}
