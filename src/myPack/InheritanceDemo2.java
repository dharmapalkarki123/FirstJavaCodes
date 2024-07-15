package myPack;

class Base{
	int i;
	int j;
 void input(int i, int j)	
 {
	 this.i=i;
	 this.j=j;
 }
 void display() {
	 System.out.println("i= "+i+" "+"j= "+j);
 }
}
 class Derive extends Base
 {
	 int k;
	 void input(int k) //Method  Overloadding
	 {
		 this.k=k;
	 }
	 void display() //Method Overidding
	 {
		 super.display();//Invokes Base class display()
		 System.out.println("k= "+k);
	 }
 }

public class InheritanceDemo2 {

	public static void main(String[] args) {
		Base b= new Base();
         b.input(10,20);
         b.display();
         Derive s =new Derive();
         s.input(30,10);
         s.display();//s.i=30 s.j=40
         s.input(50);//d.k=5
         s.display();//k=50
         

	}

}

