//class Employee{
//int empNum;
//String empName;
//double empSalary;
//void setEmpDetails()
//{
//	empNum=111;
//	empName="Raj";
//	empSalary=10000;
//}
//void displayEmpDetails()
//{
//	 System.out.println("Emp Num ="+empNum);
//	 System.out.println("Emp Name ="+empName);
//	 System.out.println("Emp Salary ="+empSalary);
//	 
//}
//
//
//}
//public class EmployeeTest {
//
//	public static void main(String[] args) {
//    Employee el = new Employee();
//    el.setEmpDetails();
//    el.displayEmpDetails();
//	}
//
//}

/*PASSING ARGUMENT TYPES*/

class Employee{
int empNum;
String empName;
double empSalary;
void setEmpDetails(int num, String name, double salary)
{
	empNum=num;
	empName=name;
	empSalary=salary;
}
void dispEmpDetails()
{
	 System.out.println("Emp Num = "+empNum);
	 System.out.println("Emp Name = "+empName);
	 System.out.println("Emp Salary = "+empSalary);
	 
}


}
public class EmployeeTest {

	public static void main(String[] args) {
    Employee el = new Employee();
    el.setEmpDetails(111,"Ram",100.0);
    el.dispEmpDetails();
	}

}

// When datatype and argument are same

//class Employee{
//int empNum;
//String empName;
//double empSalary;
//void setEmpDetails(int empNum, String empName, double empSalary)
//{
//	this.empNum=empNum;
//	this.empName=empName;
//	this.empSalary=empSalary;
//}
//void dispEmpDetails()
//{
//	 System.out.println("Emp Num = "+empNum);
//	 System.out.println("Emp Name = "+empName);
//	 System.out.println("Emp Salary = "+empSalary);
//	 
//}
//
//
//}
//public class EmployeeTest {
//
//	public static void main(String[] args) {
//    Employee el = new Employee();
//    el.setEmpDetails(111,"Ram",100.0);
//    el.dispEmpDetails();
//	}
//
//}











