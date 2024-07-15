
public class SumFact {

	public static void main(String[] args) {
		int sum=0;
		System.out.println("_________________________");
		System.out.println("Number           Factorial");
		System.out.println("__________________________");
		for(int n=1;n<=5;n++)
		{
			System.out.println(" "+n+"         "+fact(n));
			sum=sum+fact(n);
		}
		System.out.println("___________________________");
		System.out.println(" Sum  =               " +sum);
		System.out.println("___________________________");

	}
	 static int fact(int n)
	{
		int f =1;
		for (int i =n;i>=1;i--)
			f=f*i;
		return f;
	}

}
