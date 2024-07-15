package mypack2; 
 
class Base{
	int i;
	int j;
 void input(int i, int j)	
 {
	 this.i=i;
	 this.j=j;
 }
 Base(){}
 
 void display() 
 {
	 System.out.println("i= "+i+" "+"j= "+j);
 }
}
 class Derived extends Base
 {
	 int k;
	 Derived(int k) //Method  Overloadding
	 {
		
		 this.k=k;
	 }
	 void display() //Method Overidding
	 {
		 super.display();//Invokes Base class display()
		 System.out.println("k= "+k);
	 }
 }

public class InheritanceDemo3 {

	public static void main(String[] args) {
		Base b = new Base();
		b.input(20,10);
         b.display();
          Derived d =new Derived(50);
         d.display();
         

	}

}


