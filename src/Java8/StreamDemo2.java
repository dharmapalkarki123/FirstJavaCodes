package Java8;
import java.util.*;
import java.util.stream.*;
import java.util.List;

class Product
{
	int id;
	String pname;
	int price;
	Product(int id,String pname,int price)
	{
		this.id=id;
		this.pname=pname;
		this.price=price;
	}
	
	Product(){}
	 public String toString()
	 {
		 return id+""+pname+""+price;
	 }
	
	
}

public class StreamDemo2 {

	public static void main(String[] args) {
		List<Product> list1= new ArrayList<Product>();
		
		for(Product prod: getProducts())
		{
			if(prod.price>1000) {
			 list1.add(prod);
			}
			
		}
		
		list1.forEach(System.out::println);
        //Using Stream API
		List<Product> list2= getProducts().stream().filter((prod) -> prod.price>1000).collect(Collectors.toList());
		list2.forEach(System.out::println);
		
		
		
		
	}
	
	private static List<Product> getProducts()
	{
	List<Product> ProductList = new ArrayList();
	ProductList.add(new Product(1111,"Monitor",5555));
	ProductList.add(new Product(2222,"Keyboard",555));
	ProductList.add(new Product(1111,"Mouse",333));
	ProductList.add(new Product(1111,"Speaker",1111));
	return ProductList;
		
	}
	
	

}
