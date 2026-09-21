import java.util.Scanner;
public class Slope
{
    public void getVariables()
    {
        //declare variables used to store values
        private int yOne;
        private int yTwo;
        private int xOne;
        private int xTwo;
        private int slope;

        //gets the two Y and two X values in order to find the slope
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your Y2 value: ");
        yTwo = input.nextInt();
        System.out.println("Please enter your Y1 value: ");
        yOne = input.nextInt();
        System.out.println("Please enter your X2 value: ");
        xTwo = input.nextInt();
        System.out.println("Please enter your X1 value: ");
        xOne = input.nextInt();
        input.close();

        //equation to find m (the slope)
        slope = (yTwo - yOne) / (xTwo - xOne);

        //prints the slope
        System.out.println("Your slope is: " + slope);

        
    }   
}
