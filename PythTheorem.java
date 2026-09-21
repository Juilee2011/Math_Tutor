import java.util.Scanner;
public class PythTheorem 
{
    public void getSides()
    {
        //declare variables that store side inputs
        private double a;
        private double b;
        private double missing;
        private double answer;

        //gets user input
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the first given side: ");
        a = input.nextDouble();
        System.out.println("Please enter the second side in order to find the hypotenuse: ");
        b = input.nextDouble();
        input.close();

        //finds missing side (hypotenuse)
        missing = Math.pow(a, 2) + Math.pow(b, 2);
        answer = Math.sqrt(missing);

        //prints answer
        System.out.println("Your hypotenuse is: " + answer);

    }
    
}
