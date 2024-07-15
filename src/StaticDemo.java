class MyClass{
	int m;
	static int n;
	void xxx() {
		m=10;
		n=20;
	}
	static void  yyy() {
	//	m=30; non static variable cannot be declared in sataic method
		n=40;
	}
	void display() {
		System.out.println("m= "+m+" "+"n= "+n);
	}
}
public class StaticDemo {

	public static void main(String[] args) {
	MyClass m1=new MyClass();
	m1.xxx();
	m1.display();
	MyClass m2=new MyClass();
	m2.display();
	m2.yyy();
	m1.display();
	m2.display();
	MyClass.n=50;
	m1.display();
	m2.display();

	}

}
