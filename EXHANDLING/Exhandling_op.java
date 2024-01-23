import java.util.Scanner;
//1)arith,inputmm
//2)array i of b
public class Exhandling_op{
	public static void main(String[] args)
	{
		int ch;
		Scanner sc=new Scanner(System.in);
		do {
			System.out.println("1)Arithmatic Exception.\n2)InputMismatch Exception.\n3)ArrayIndexOutOfBoundException.");
		ch=sc.nextInt();
		
		switch(ch)
		{
		case 1:{
			Exhandling e=new Exhandling();
			e.getdata();
			break;
		}
			
		case 2:{
			Exhandling e=new Exhandling();
			e.getdata();
			break;
		}
		case 3:{
			Exhandling e=new Exhandling();
			e.array();
			break;
		}
		
		case 4:
			System.out.println("OK");
			break;
		}
		
		}while(ch!=4);
	}
}