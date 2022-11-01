
public class Main {

	public static void main(String[] args) {
		int[] masiv = new int[200];
		for(int i = 0 ;i < masiv.length ; i++)
		{
			masiv[i] = i + 1;
		}
		int sum = 0;
		for(int n :masiv)
		{
			sum += n;
		}
		
		System.out.println(sum);

	}

}
