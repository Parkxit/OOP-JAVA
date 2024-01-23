import java.util.Scanner;
public class Operation {
	
	
	public static void main(String[] args) {
		int ch;

		do {
			System.out.println("\n\n1)Generate payment slip for programmer.\n2)Generate the payment slip for Project Manager."
					+"\n3)Generate the payment slip for the Assistant Project Manager.\n4)Generate the payment slip for the Team Lead.\n5)Exit.");
		System.out.println("Enter choice: ");
			
			Scanner sc=new Scanner(System.in);
		ch=sc.nextInt();
		switch(ch)
		{
		
		
		case 1:
			Programmer p=new Programmer();
			System.out.println("Enter the programmer details below: ");
			p.getdata();
			p.accept();
		
			System.out.println("\t\t\tPayment slip for programmer : ");
			p.display();
			p.print();
			break;
			
			
			
			
			
		case 2:
			Project_Manager m=new Project_Manager();
			System.out.println("Enter the Project manager details: ");
			m.getdata();
			m.receive();
			System.out.println("\t\t\tPayment slip for Project Manager: ");
			m.display();
			m.give();
			break;
		
			
			
		case 3:
			Assistant_Project_Manager a=new Assistant_Project_Manager();
			System.out.println("Enter Assistant Project Manager details: ");
			a.getdata();
			a.get();
			System.out.println("\t\t\tPayment slip for Assistant Project Manager :  ");
			a.display();
			a.send();
			break;
			
			
			
		case 4:
			Team_lead t=new Team_lead();
			System.out.println("Enter the team lead details below: ");
			t.getdata();
			t.input();
		
			System.out.println("\t\t\tPayment slip for Team Lead details : ");
			t.display();
			t.output();
			break;
			
			
			
			
		case 5:
			
			System.out.println("OK!");
			break;
			
			
			
			
			default:
				System.out.println("Please enter valid choice.");
		}
		}while(ch!=5);

	}

}
