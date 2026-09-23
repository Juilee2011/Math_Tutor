 /*
 * Math_Tutor
 * Juilee Joshi
 * Helps solve 6 types of problems
 *
 * Resources: NONE
 *
 */
 import java.util.Scanner ;

 public class MathTutor
 {
    public static void main ( String [] args )
    {
        //creates variables that will store each answer/input
        int selection = 1;
        String choice;

        while (selection > 0)
        {
            // asks to choose which problem to solve
            Scanner input = new Scanner(System.in);
            System.out.println("Welcome to Math Tutor! Please decide one question: ");
            System.out.println("1. Volume of a sphere");
            System.out.println("2. Pythagorean Theorem");
            System.out.println("3. Factorial");
            System.out.println("4. Slope of a line");
            System.out.println("5. Fibonacci series");
            System.out.println("Please select one: ");
            selection = input.nextInt();
    
            //calls one chosen method according to selection
            if (selection == 1)
            {
                Sphere_Volume sphere = new Sphere_Volume();
                sphere.getInput();
                sphere.solveVolume();
            }
            else if (selection == 2)
            {
                PythTheorem triangle = new PythTheorem();
                triangle.getSides();
            }
            else if (selection == 3)
            {
                Factorial factorial = new Factorial();
                factorial.getValue();
                factorial.findFactorial();
            }
            else if (selection == 4)
            {
                Slope slope = new Slope();
                slope.getVariables();
            }
            else if (selection == 5)
            {
                Fibonacci fib = new Fibonacci();
                fib.getValues();
                fib.printFormula();
                fib.solve();
                fib.printAnswer();
            }
            else
            {
                System.out.println("Error! Please enter a value between 1-6 accordingly");
            }

            //asks if they want to have another question solved
            Scanner option = new Scanner(System.in);
            System.out.println("Would you like to have another problem solved (Y/N)? ");
            choice = option.nextLine();

            //used if statements to exit loop if not wanting to continue
            if (choice.equals("Y"))
            {
                selection = 1;
            }
            if (choice.equals("y"))
            {
                System.out.println("Error! Please enter an uppercase Y!");
            }
            if (choice.equals("n"))
            {
                System.out.println("Error! Please enter an uppercase N!");
            }
            if (choice.equals("N"))
            {
                selection = 0;
                System.out.println("Thank you for using Math Tutor!");
            }

        }
    }
 }
