import java.util.Scanner;
public class GreatestNum {

	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("Enter three Numbers");
	int a=s.nextInt();
	int b=s.nextInt();
	int c=s.nextInt();
	if(a>b&&a>c)
		System.out.println("Greates Number is"  +a);
           else
        	   if(b>a&&b>c)
        		   System.out.println("Greates number is"  +b);
        	   else
        		   System.out.println("Greates number is"  +c);
	}

}
