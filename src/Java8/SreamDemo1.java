package Java8;
import java.util.*;
import java.util.stream.*;
public class SreamDemo1 {

	public static void main(String[] args) {
		
		//Ways of traversing and iterating
  List<String> list1 = List.of("apple","orange","mango");
   //Using tradational for loop 
     /* for(int i=0;i<list1.size();i++)
  {
	  System.out.println(list1.get(i));
  }
       */  
  
  //Using enhanced loop -added in java 5 version
  /* 
  for (String s : list1)
     {
	  System.out.println(s);
     }
  */
  
  //using for each loop - added in java 8 version
 // list1.forEach( s -> System.out.println(s));
  
    //method refrence method
  //list1.forEach(System.out::println);
  
  //Creating Stream using List
  /*
  Stream<String> stream1=list1.stream();
  stream1.forEach(System.out::println);
  */
//Creating using List
  Set<String> set1=new HashSet<String>(list1); 
  Stream<String> stream2=set1.stream();
  stream2.forEach(System.out::println);
  //Creating Stream using Arrays
  
  String[] strArray = {"xxx","yyy","zzz"};
  Stream<String> streams3 =Arrays.stream(strArray);
  streams3.forEach(System.out::println);
  
  
  
  
  
  
  
  
  
  
  
  
  
  
	}

}
