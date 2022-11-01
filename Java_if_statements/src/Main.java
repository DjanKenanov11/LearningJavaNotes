import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner answer = new Scanner(System.in);
		
		System.out.println("What is the value of the \"Pi\" in math?");
		
		// if statement = performs a block of code if it's condition evaluates to be true
		
		double pi = answer.nextDouble();
		
		if(pi == 3.14) // True
		{
			System.out.println("Okey.");
		}
		else if(pi == 3.14159) // True
		{
			System.out.println("Great.");
		}
		else if(pi == 3.141592653589793238) // True
		{
			System.out.println("Okey okey i get you like math.");
		}
		else if(pi != 3.14 && (pi != 3.14159 || pi != 3.141592653589793238 )) // False
		{ // i didn't expand pi != to every last digit; 
			System.out.println("Nah... mate Check it on Google.");
		}
          // logical operators = used to connect two or more expressions
           // && = (AND) both conditions must be true
            // || = (OR) either condition must be true
             // ! = (NOT) reverses boolean value of condition
		
		/* Example 2 - Copied from "Bro Code 12 Hours Java Course";
		Scanner scanner = new Scanner(System.in);		

		System.out.println("You are playing a game! Press esc or ESC to quit");

		String response = scanner.next();

		if(!response.equals("esc") && !response.equals("ESC")) {
			System.out.println("You quit the game");
		}
		else {
			System.out.println("You are still playing the game *pew pew*");
		}
        */	
	}
}