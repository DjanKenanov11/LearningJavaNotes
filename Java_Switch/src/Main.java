import java.util.Scanner;

public class Main {

 public static void main(String[] args) {
  Scanner answer = new Scanner(System.in);
  // switch = statement that allows a variable to be tested for equality against a list of values
  
  //String day = "Friday";
  
  String day = answer.nextLine(); // This is the User Input Method.
  
  switch(day) {
   case "Sunday": System.out.println("It is Sunday!");
   break;
   case "Monday": System.out.println("It is Monday!");
   break;
   case "Tuesday": System.out.println("It is Tuesday!");
   break;
   case "Wednesday": System.out.println("It is Wednesday!");
   break;
   case "Thursday": System.out.println("It is Thursday!");
   break;
   case "Friday": System.out.println("It is Friday!");
   break;
   case "Saturday": System.out.println("It is Saturday!");
   break;
   default: System.out.println("That is not a day!"); // if there is no match it prints out this.
  }
  
 }
}
//Copied from "Bro Code 12 Hours Java Course";