/*
 * Math_Tutor
 * Juilee Joshi
 * Helps solve 6 types of problems
 *
 * Resources: https://www.mathsisfun.com/numbers/fibonacci-sequence.html
 *
 */
import java.util.Scanner;
public class Fibonacci 
{
    //declare variables to store input
    private int maxValue;

    public void getValues()
    {
        //asks user to input a value
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a maximum value to count towards: ");
        maxValue = input.nextInt();

        //checks if input is 0 or 1
        if (maxValue == 0 || maxValue == 1)
        {
            System.out.println("Error! Please enter a value other than 0 or 1!");
            return;
        }
    }

    public void solve()
    {
        int f1 = 0;
        int f2 = 1;
        int sum = 1;
        
        System.out.println("Your Fibonacci sequence is: ");
        System.out.println(f1);
        System.out.println(f2);
        while ((sum + f1) <= maxValue)
        {
            sum = f1 + f2;
            System.out.println(sum);
            f1 = f2;
            f2 = sum;
        }
    }

    public void printFormula()
    {
        System.out.println("The Fibonacci sequence starts with the sum of 0 and 1,");
        System.out.println("with the next number being found by adding up the two numbers before it");

    }

}
