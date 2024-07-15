class Items{
int itemNum;
String itemName;
Items(int itemNum,String itemName)
{
	this.itemNum=itemNum;
	this.itemName=itemName;
	}
Items(){}//default constructor
void display() {
	System.out.println("Item Num= "+itemNum);
	System.out.println("Item Name= "+itemName);
}
}
public class Demo2Constructor {

	public static void main(String[] args) {
		Items s =new Items(111,"Iphone");
		s.display();
		Items n =new Items();
        n.display();
	}

}
