import java.util.Scanner;
public class vehicle_op {

	public static void main(String[] args) {
		int s,b,g,ch;
		do {
			System.out.println("\nWhat do you want to drive?\n1.Car.\n2.Bike.\n3.Bicycle.\n4.Exit.\nEnter your choice: ");
			Scanner sc=new Scanner (System.in);
			ch=sc.nextInt();
			
			switch(ch) {
			case 1:
				System.out.println("OK!...You are driving a car now!");
				int c;
			Vehicle ca=new Car();
				do {
					System.out.println("\n1.Change the gear.\n2.Increase the speed.\n3.Apply the brakes.\n4.Display all the current status.\n5.Exit.");
					System.out.println("Choose what you want to do: ");
					c=sc.nextInt();
				switch(c)
				{
				case 1:

					System.out.println("Enter 1 to shift up the gear and 0 to shift it down: ");
					g=sc.nextInt();
					if(g==1)
					{
						ca.change_gear(1);
					}
					else if(g==0)
					{
						ca.change_gear(0);
					}
					break;
					
					 
				case 2:
					System.out.println("Enter the speed to achieve: ");
					s=sc.nextInt();
					 ca.speed_up(s);
					 break;
					
				case 3:
					ca.apply_brakes(10);
					break;
					
				case 4:
					ca.display();
					break;
					
				case 5:
					System.out.println("OK!");
					break;
					
				default:
					System.out.println("Enter correct choice: ");
				}
		
			}while(c!=5);
				break;
			
				
				
			case 2:
				System.out.println("OK!...You are driving a bike now!");
				int cho;
			Vehicle bi=new Bike();
				do {
					System.out.println("\n1.Change the gear.\n2.Increase the speed.\n3.Apply the brakes.\n4.Display all the current status.\n5.Exit.");
					System.out.println("Choose what you want to do: ");
					cho=sc.nextInt();
				switch(cho)
				{
				case 1:

					System.out.println("Enter 1 to shift up the gear and 0 to shift it down: ");
					g=sc.nextInt();
					if(g==1)
					{
						bi.change_gear(1);
					}
					else if(g==0)
					{
						bi.change_gear(0);
					}
					break;
					
					 
				case 2:
					System.out.println("Enter the speed to achieve: ");
					s=sc.nextInt();
					 bi.speed_up(s);
					 break;
					
				case 3:
					bi.apply_brakes(10);
					break;
					
				case 4:
					bi.display();
					break;
					
				case 5:
					System.out.println("OK!");
					break;
					
				default:
					System.out.println("Enter correct choice: ");
				}
		
			}while(cho!=5);
				break;
			
				
			case 3:
				System.out.println("OK!...You are driving a bicycle now!");
				int choo;
			Vehicle bc=new Bicycle();
				do {
					System.out.println("\n1.Increase the speed.\n2.Apply the brakes.\n3.Display the current status.\n4.Exit.");
					System.out.println("Choose what you want to do: ");
					choo=sc.nextInt();
				switch(choo)
				{
				case 1:

					System.out.println("Enter the speed to achieve: ");
					s=sc.nextInt();
					 bc.speed_up(s);
					 break;
					
					
					 
				case 2:
					bc.apply_brakes(10);
					break;
				
				case 3:
					bc.display();
					break;
					
				case 4:
					System.out.println("OK!");
					break; 
					
				default:
					System.out.println("Enter correct choice: ");
				}
		
			}while(choo!=4);
				
				break;
			
			}
		}while(ch!=4);
		
		
	

	}

}
