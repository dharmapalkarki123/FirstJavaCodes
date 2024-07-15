import java.util.Scanner;
public class GreatestTen {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a numbers");
		int n, i=1,big=0;
		while(i<=10)
		{
			n=s.nextInt();
			if(n>big)
				big=n;
			i++;
		}
		System.out.println("GreatesNum = "+big);
		

	}

}
