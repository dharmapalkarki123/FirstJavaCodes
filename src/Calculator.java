import java.util.Scanner;
public class Calculator {

	public static void main(String[] args) {
		int res=0;
       Scanner s =new Scanner(System.in);
		System.out.println("Enter Two number");
		int n1=s.nextInt();
		int n2=s.nextInt();
		System.out.println("1.Add");
		System.out.println("2.Subtract");
		System.out.println("3.Multiply");
		System.out.println("4.Divide");
		System.out.println("Enter Your Choice");
		int ch=s.nextInt();
		switch(ch)
		{
		case 1:res=n1+n2;break;
		case 2:res=n1-n2;break;
		case 3:res=n1*n2;break;
		case 4:res=n1/n2;break;
		default:System.out.println("Invalid Choice");
		}
		System.out.println("Result= " +res);
		
		
		
	}

}
