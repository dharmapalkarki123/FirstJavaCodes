import java.util.Scanner;
public class Circle {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		double PI =3.14;
		System.out.println("Enter the radius of the circle");
		int r =s.nextInt();
		double area = PI *r*r;
		System.out.println("Area of the circle " +area);
		
		

	}

}
