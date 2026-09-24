 /*
 * SphereVolume
 * Juilee Joshi
 * Finds the volume of a sphere after the user inputs the radius of the sphere
 *
 * Resources: NONE
 *
 */
import java.util.Scanner;
public class SphereVolume 
{
    //declares variable to store radius value
    private double radius;

    public void getInput()
    {
        //gets the radius of the sphere
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the radius of the sphere: ");
        radius = input.nextDouble();

        //checks if radius is equal to 0
        if (radius == 0)
        {
            System.out.println("Error! Please enter a radius greater than 0!");
            return;
        }
    }
    public void solveVolume()
    {
        double volume = (4 * (Math.PI * Math.pow(radius, 3))) / 3;
        System.out.println("The formula for finding the volume of a sphere is: (4 * (pi * radius ^ 3)) / 3");
        System.out.println("Your volume is: " + volume);
    }
    
}
