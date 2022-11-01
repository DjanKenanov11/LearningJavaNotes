public class Main {
	public static void main(String[] args)
	{
		String[][] laptops = new String[3][3];
		
		laptops[0][0] = "Macbook";
		laptops[0][1] = "MacBook Air 12";
		laptops[0][2] = "MacBook Pro 12";
		laptops[1][0] = "MacBook Air 15";
		laptops[1][1] = "MacBook Pro 15";
		laptops[1][2] = "MacBook Air 17";
		laptops[2][0] = "MacBook Pro 17";
		laptops[2][1] = "MacBook Air M1";
		laptops[2][2] = "MacBook Pro M1";
		
		for(int i = 0; i < laptops.length; i++)
		{
			System.out.println();
			for(int j = 0 ; j < laptops[i].length ; j++)
			{
				System.out.println(laptops[i][j]+"");
			}
		}
	}	
}