package collection;
import java.util.*;
public class SetDemo {

	public static void main(String[] args) {
    //Hashset =unordered and no duplicate
		HashSet hs = new HashSet();
		hs.add("Monitor");
		hs.add("Speaker");
		hs.add("Mouse");
		hs.add("CPU");
		hs.add("Keyboard");
		hs.add("Speaker");
		System.out.println(hs);
		
	//LinkedHashSet
	LinkedHashSet lh = new LinkedHashSet();
	lh.add("Monitor");
	lh.add("Speaker");
	lh.add("Mouse");
	lh.add("CPU");
	lh.add("Keyboard");
	System.out.println(lh);
	
	
	//TreeSet =sorted
	TreeSet ts =new TreeSet();
	ts.add("Monitor");
	ts.add("Speaker");
	ts.add("Mouse");
	ts.add("CPU");
	ts.add("Keyboard");
	System.out.println(ts);
	System.out.println(ts.descendingSet());
	
		
		
	}

}
