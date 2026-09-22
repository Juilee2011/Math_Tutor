 /*
 * Sphere_Volume
 * Juilee Joshi
 * Finds the volume of a sphere after the user inputs the radius of the sphere
 *
 * Resources: NONE
 *
 */
import java.util.Scanner;
public class Sphere_Volume 
{
    public void getInput()
    {
        double radius;
        
        //gets the radius of the sphere
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the radius of the sphere: ");
        radius = input.nextDouble();
        input.close();
    }
    public void solveVolume()
    {
        double volume = (4 * (Math.PI * Math.pow(radius, 3))) / 3;
        System.out.println("The formula for finding the volume of a sphere is: (4 * (pi * radius ^ 3)) / 3");
        System.out.println("Your volume is: " + volume);
    }
    
}
