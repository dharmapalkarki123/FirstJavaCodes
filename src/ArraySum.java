import java.util.Scanner;
public class ArraySum {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("Enter a Array size");
	int size =s.nextInt();
	int[] n = new int[size];
	System.out.println("Enter "+size+" Values");
	int sum=0;
	for(int i=0;i<n.length;i++)
		n[i]=s.nextInt();
//	System.out.println("Sum of array is");
	for(int i=0;i<n.length;i++)
	{
		sum=sum+n[i];
	}
	System.out.println("Sum of array elements are " +sum);
	}

}
