import java.util.Scanner;

public class Main {

 public static void main(String[] args) {
  /* Math Methods();
  Math.max(x,y);
  Math.min(x,y);
  Math.abs(y);
  Math.sqrt(x);
  Math.round(x);
  Math.ceil(x);
  Math.floor(x);
   */
  double x;
  double y;
  double z;
  
  Scanner scanner = new Scanner(System.in);
    
  System.out.println("Enter side x: ");
  x = scanner.nextDouble();
  System.out.println("Enter side y: ");
  y = scanner.nextDouble();
  
  z = Math.sqrt((x*x)+(y*y));
  
  System.out.println("The hypotenuse is : "+z);
  
  scanner.close();   
 }
}
//Copied from "Bro Code 12 Hours Java Course";