 /*
 * Slope
 * Juilee Joshi
 * Finds the slope of a line by taking user input of X1, X2, Y1, and Y2
 *
 * Resources: NONE
 *
 */
import java.util.Scanner;
public class Slope
{
    //declare variables used to store values
    private double yOne;
    private double yTwo;
    private double xOne;
    private double xTwo;
    private double slope;

    public void getVariables()
    {
        //gets the two Y and two X values in order to find the slope
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your Y2 value: ");
        yTwo = input.nextDouble();
        System.out.println("Please enter your Y1 value: ");
        yOne = input.nextDouble();
        System.out.println("Please enter your X2 value: ");
        xTwo = input.nextDouble();
        System.out.println("Please enter your X1 value: ");
        xOne = input.nextDouble();

    }
    public void findSlope()
    {
        //checks if inputs are greater than 100
        if (yTwo >= 100 || yOne >= 100 || xOne >= 100 || xTwo >= 100)
        {
            System.out.println("Error! Please enter a value less than 100!");
            return;
        }

        //equation to find m (the slope) and prints it to the user
        slope = (yTwo - yOne) / (xTwo - xOne);
        System.out.println("The formula for finding the slope is: (Y2 - Y1) / (X2 - X1)");

        //prints the slope
        System.out.println("Your slope is: " + slope);
    }

}
