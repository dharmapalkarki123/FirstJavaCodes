package exception;

public class MultipleCatchDemo {

	public static void main(String[] args) {
		try {
			int n1 = Integer.parseInt(args[0]);
			int n2 = Integer.parseInt(args[1]);
			int res = n1 / n2;
			System.out.println("Result = " + res);
		} catch (ArithmeticException e) {
			System.err.println("Divide By zero not allowed");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.err.println("Require two number");
		} catch (NumberFormatException e) {
			System.err.println("Enter number only");
		} catch (RuntimeException e) {
			System.err.println("Runtime exception occured");
		} catch (Exception e) {
			System.err.println("Exception occured");
		}

	}

}