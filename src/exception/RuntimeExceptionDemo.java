package exception;

public class RuntimeExceptionDemo {

	public static void main(String[] args) {
	//arithemetic exception
//		int n = 10/0;  
		//ArrayIndexOutofBondException
//		int[] n = {10,20,30,40,50};
//		System.out.println(n[8]);
		//StringIndexOutofBoundsException
//		String s ="Hello";
//		System.out.println(s.charAt(8));
		//NegativeArraySizeExcetion
//		int[] n = new int[-5];
//		NumberFormatException
//		String s="xx";
//		int n = Integer.parseInt(s);
		//NullPointerException
		String s=null;
		System.out.println(s.equals("Hello"));
	}

}
