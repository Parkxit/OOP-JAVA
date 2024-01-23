import java.util.Scanner;
public class Programmer_op {

	public static void main(String[] args) {
		Programmer p=new Programmer();
		System.out.println("Enter the programmer details below: ");
		p.getdata();
		p.accept();
	
		System.out.println("The programmer details are: ");
		p.display();
		p.print();
		
		
	}

}
