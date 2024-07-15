package collection;
import java.util.*;
public class RemovingDublicate {

	public static void main(String[] args) {
		
		 List<Integer> mb =new ArrayList<Integer>(); 
		  mb.add(1111);  
		  mb.add(2222);
		  mb.add(1111);
		  mb.add(3333); 
		  mb.add(4444); 
		  mb.add(5555); 
		  mb.add(3333);
		 
		//List<Integer> mb = List.of(1111,2222,1111,3333,4444,5555,3333);
		System.out.println(mb);  // [1111, 2222, 1111, 3333, 4444, 5555, 3333]
       //to remove duolicate always use set
	  
		
		Set<Integer> m =new LinkedHashSet<Integer>();
		m.addAll(mb);
		System.out.println(m); // [1111, 2222, 3333, 4444, 5555]

	}

}
