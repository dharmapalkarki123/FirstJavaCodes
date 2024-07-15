package collection;
import java.util.*;
public class IterateMapDemo {

	public static void main(String[] args) {
		HashMap<String,Integer> hs = new HashMap<String,Integer>();
	     hs.put("Monitor", 5000);
	     hs.put("Keyboard", 6000);
	     hs.put("Speaker", 70000);
	     hs.put("CPU", 8000);
	     hs.put("Mouse",9000);
	     System.out.println(hs);
	     Set<String> keys=hs.keySet();
	     for(String k :keys)
	    	 System.out.println(k+":"+hs.get(k));
	     
	     

	}

}
