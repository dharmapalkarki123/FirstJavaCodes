/*WAP to find area of rectangle*/
import java.util.Scanner;
public class Rectangle {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Length");
		int length = s.nextInt();
		System.out.println("Enter Breadth");
		int breadth = s.nextInt();
		int Area = length * breadth;
		System.out.println("Area of Rectangle=" +Area);

	}

}
