package collection;
import java.util.*;
public class MapDemo {

	public static void main(String[] args) {
     HashMap hs = new HashMap();
     hs.put("Monitor", 5000);
     hs.put("Keyboard", 6000);
     hs.put("Speaker", 70000);
     hs.put("CPU", 8000);
     hs.put("Mouse",9000);
     System.out.println(hs);
     
     
     LinkedHashMap lhs = new LinkedHashMap();
     lhs.put("Monitor", 5000);
     lhs.put("Keyboard", 6000);
     lhs.put("Speaker", 70000);
     lhs.put("CPU", 8000);
     lhs.put("Mouse",9000);
     System.out.println(lhs);
     
     TreeMap tr = new TreeMap();
     tr.put("Monitor", 5000);
     tr.put("Keyboard", 6000);
     tr.put("Speaker", 70000);
     tr.put("CPU", 8000);
     tr.put("Mouse",9000);
     System.out.println(tr);
     System.out.println(tr.descendingMap());

	}

}
