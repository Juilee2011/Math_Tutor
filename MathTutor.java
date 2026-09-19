 /*
 * Math_Tutor
 * Juilee Joshi
 * Helps solve 6 types of problems
 *
 * Resources :
 *
 */

 import java.io.IOException;
 import java.util.Scanner ;

 public class MathTutor
 {
 public static void main ( String [] args ) throws IOException
 {
    //creates variables that will store each answer
    private int selection;

    // asks to choose which problem to solve
    Scanner input = new Scanner(System.in);
    System.out.println("Welcome to Math Tutor! Please decide one question: ");
    System.out.println("1. Volume of a sphere");
    System.out.println("2. Pythagorean Theorem");
    System.out.println("3. Factorial");
    System.out.println("Please select one: ");
    selection = input.nextInt();

    //calls one chosen method according to selection
    if (selection == 1)
    {
        //call volume of sphere method
    }
    else if (selection == 2)
    {
        //call pythagorean method
    }
    else if (selection == 3)
    {
        //call factorial method
    }
    else
    {
        System.out.println("Error! Please enter a value between 1-6 accordingly");
    }

    }
}
