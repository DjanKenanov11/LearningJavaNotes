public class Main {
	public static void main(String[] args) {

		// array = used to store multiple values within a single variable

		String[] cars = new String[3];

		cars[0] = "Camaro";
		cars[1] = "Corvette";
		cars[2] = "Tesla";

		for(int i=0; i<cars.length; i++) {
			System.out.println(cars[i]);
		}
	}
}
//Copied from "Bro Code 12 Hours Java Course";