import java.util.Scanner;
public class CheckChar {

	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("Enter a Character");
	char ch =s.next().toLowerCase().charAt(0);
	if(Character.isAlphabetic(ch))
	{
		switch(ch)
		{
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u': System.out.println("Giver Character is a Vowels");break;	
		default:System.out.println("Giver character is a Consonent");	
		}
	}
	else
		System.out.println("Given Character is not a alphabets");

	}

}
