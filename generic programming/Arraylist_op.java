import java.util.Scanner;
public class Arraylist_op {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Arraylist obj = new Arraylist();
		int ch;
		Scanner sc = new Scanner(System.in);
		
		
		do
		{
	       System.out.println("\n\nEnter 1 for Integer Array. ");
	       System.out.println("Enter 2 for String Array. ");
	       System.out.println("Enter 3 to exit. ");
	       ch = sc.nextInt();
	       
	       switch (ch) {
		case 1: {
			obj.addnumbers();
			obj.get_even_numbers();
			obj.get_prime_numbers();
			obj.display();
			break;
		    }
		case 2:
		{
			obj.addStrings();
			obj.get_palindrome_String();
			break;
		}
		
		}
	      
		}while(ch!=3);
	}
}

