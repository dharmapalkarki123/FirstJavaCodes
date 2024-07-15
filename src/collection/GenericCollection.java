package collection;
import java.util.*;

public class GenericCollection {
public static void main(String[] args) {
	LinkedList<Integer> li =new LinkedList<Integer>();
	li.add(10);
	li.add(20);
	li.add(200);
	li.add(30);
	System.out.println(li);
	for(Integer s :li)
		System.out.println(s);
	


	}

}
