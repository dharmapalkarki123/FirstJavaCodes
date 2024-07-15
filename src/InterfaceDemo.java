interface Shape{
	
	/* from java 8 version, we can define methods in interfaces using default keyword*/
	
	void draw(); //by default public ra abstract hunx
	default void fill() {
		System.out.println("Filling");
	}
	
}
class Square implements Shape
{
	public void draw() //interface ko method public vako karan la yeta ni public naie hunu parx
	{
		System.out.println("Drawing a C ircle");
	}
}
public class InterfaceDemo {

	public static void main(String[] args) {
		Shape s = new Square();
		s.draw();
		s.fill();

	}

}
