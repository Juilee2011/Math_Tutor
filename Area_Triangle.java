/*
 * Area_Triangle
 * Juilee Joshi
 * Gets user input and finds the area of the triangle with the base and height that is inputted
 *
 * Resources: NONE
 *
 */
import java.util.Scanner;
public class Area_Triangle 
{
    public void getInput()
    {
        private double base;
        private double height;
        private double answer;

        //asks for user input
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the base of your triangle: ");
        base = input.nextDouble();
        System.out.println("Please enter your height: ");
        height = input.nextDouble();
        input.close();
    }
    public void outputFormula()
    {
        //prints the formula for the user to know
        System.out.println("The formula for finding the area of a triangle is: (base * height) / 2");

        //uses formula to solve for the area
        answer = (base * height) / 2;
        System.out.println("Your area is: " + answer);

    }
    
}
