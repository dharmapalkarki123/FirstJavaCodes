import java.util.Scanner;
public class Prime {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a Number");
		int n =s.nextInt();
		if(prime(n))
			System.out.println("Number is prime number");
		else
			System.out.println("Not a prime number");
		

	}
	static boolean prime(int n)
	{
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
			return false;	
		}
		return true;
	}

}
