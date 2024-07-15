class Employer {
	private int age ;
	void setAge(int a)
	{
		if(a>=18 && a<=60)
			age=a;
		else
			System.out.println("Invalid Age");
	}
	
}
public class Encapculation {

	public static void main(String[] args) {
	Employer e = new Employer();
	e.setAge(30);

	}

}
