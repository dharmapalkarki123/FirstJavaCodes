package exception;
class Product
{
	int Pid;
	String PName;
	double Price;
	Product(int Pid,String PName,double Price)
	{
	 this.Pid=Pid;
	 this.PName=PName;
	 this.Price=Price;
	}
	Product(){}
	public String toString()
	{
	return Pid+" "+PName+" "+Price;
	

}
}


public class ToStringDemo {

	public  static void main(String[] args) {
		Product prod = new Product(111,"Mouse",500.00);
		System.out.println(prod);

	}

}
