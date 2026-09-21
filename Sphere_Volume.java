import java.util.Scanner;
public class Sphere_Volume 
{
    public void getInput()
    {
        private double radius;
        
        //gets the radius of the sphere
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the radius of the sphere: ");
        radius = input.nextDouble();
        input.close();
    }
    public void solveVolume()
    {
        double volume = (4 * (Math.PI * Math.pow(radius, 3))) / 3;
        System.out.println("Your volume is: " + volume);
    }
    
}
