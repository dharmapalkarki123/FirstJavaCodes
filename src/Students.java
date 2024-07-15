import java.util.Scanner;
public class Students {

	public static void main(String[] args) {
	Scanner s = new Scanner (System.in);
	System.out.println("Enter the Student Name ");
	String Name= s.next();
	System.out.println("Enter the Roll no");
	int Roll = s.nextInt();
	System.out.println("Enter the marks of three subjects ");
	double marks1=s.nextDouble();
	double marks2=s.nextDouble();
	double marks3=s.nextDouble();
	double total= marks1+marks2+marks3;
	double average = total / 3;
	System.out.println("Name " +Name);
	System.out.println("Roll no of student " +Roll);
	System.out.println("Total Marks=" +total);
	System.out.println("Average Marks " +average);
	}

}
