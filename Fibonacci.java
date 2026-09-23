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
    private int count;
    private int maxValue;
    private int sum;

    public void getValues()
    {
        //asks user to input a value
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a maximum value to count towards: ");
        maxValue = input.nextInt();
    }

    public void solve()
    {
        count = 0;
        for (int i = 0; i < maxValue; i ++)
        {
            sum = sum + (sum + 1);
            count += 2;
        }
    }

    public void printFormula()
    {
        //prints formula to user

    }
    
    public void printAnswer()
    {
        //prints answer to user
    }
}
