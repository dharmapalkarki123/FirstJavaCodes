class Base{
	int i;
	int j;
 void inputJ(int i, int j)	
 {
	 this.i=i;
	 this.j=j;
 }
// Base(){} 
 
 void displayJ() {
	 System.out.println("i= "+i+" "+"j= "+j);
 }
  
}
 class Derived extends Base
 {
	 int k;
	 void inputK(int k)
	 {
		 this.k=k;
	 }
	 void displayK()
	 {
		 System.out.println("k= "+k);
	 }
 }

public class InheritanceDemo1 {

	public static void main(String[] args) {
		Base b= new Base();
         b.inputJ(10,20);
         b.displayJ();
         Derived s =new Derived();
         s.displayJ(); 
         s.inputK(50);
         s.displayK();
        
         

	}

}
