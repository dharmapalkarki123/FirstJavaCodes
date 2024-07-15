package collection;
import java.util.*;
public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList al= new ArrayList();
		al.add(10);
		al.add(20);
		al.add("xxx");
		al.add("yyy");
		al.add("zzz");
		System.out.println(al); //[10, 20, xxx, yyy, zzz]
		al.add(2,5);
		System.out.println(al); //[10, 20, 5, xxx, yyy, zzz]
		al.set(2,90);
		System.out.println(al); ///[10, 20, 90, xxx, yyy, zzz]
		al.remove("xxx");
		System.out.println(al); ///[10, 20, 90, yyy, zzz]
		al.remove(0);
		System.out.println(al); //[20, 90, yyy, zzz]
		//System.out.println("Size= "+al.size());
		//String s = (String) al.get(2);
		//System.out.println(s); //yyy
		

	}

}
