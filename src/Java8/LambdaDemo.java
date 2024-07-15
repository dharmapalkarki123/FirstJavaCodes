package Java8;
@FunctionalInterface
interface Phone
{
	void call(int no);
}
/*class AndroidPhone implements Phone
{

	public void call() 
	
	{
		System.out.println("Calling");
		
	}
	
}
*/


public class LambdaDemo {

	public static void main(String[] args) {
    /*  
     
     Phone p =new AndroidPhone();
      p.call();
*/
   
		//Anonymous InnerClass
		
	/*	
	 
	 
	 Phone p = new Phone()
				{
			public void call() 
			
			{
				System.out.println("Calling");
				
			}
				};
				p.call();
	*/
		
		//Lambda Expression
		
	 /*  Phone p=() -> { System.out.println("Calling");};
		p.call();
		*/
		
	/*	Phone p=() -> System.out.println("Calling");
		p.call();
		
	*/
		
	/*
	 	Phone p=(int no) -> System.out.println("Calling = " +no);
	    p.call(999);	
	*/
	
	/*
		Phone p=(no) -> System.out.println("Calling = " +no);
	    p.call(999);
	    */
		
	    Phone p=(no) -> System.out.println("Calling = " +no);
	    p.call(999);
		
		
		
		
		
	}

}
