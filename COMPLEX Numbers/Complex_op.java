import java.util.*;
public class Complex_op {

	public static void main(String[] args) {
		double r1,i1,r2,i2;
		int ch;
		
		Scanner sc=new Scanner(System.in);
		
		do {
			System.out.println("\nEnter the serial number of the operation that you want to perform on complex numbers:\n");
			System.out.println("1)Addition.  2)Substraction  3)Multiplication  4)Division  5)Exit. ");
			ch=sc.nextInt();
			
			 if(ch<5 & ch>0) 
			 {
				System.out.println("\nEnter the first complex number:");
				r1=sc.nextDouble();
				i1=sc.nextDouble();
				Complex c1=new Complex(r1,i1);
				System.out.println("The first complex number is:");
				c1.display();
		
				System.out.println("\nEnter the second complex number:");
				r2=sc.nextDouble();
				i2=sc.nextDouble();
				Complex c2=new Complex(r2,i2);	
				System.out.println("The second complex number is:");
				c2.display();
			
				Complex c3=new Complex();
				switch(ch) {
		
					case 1:
						
						c3.add(c1,c2);
						System.out.println("\nThe sum of the entered complex numbers is:");
						c3.display();
						break;
					
					
					case 2:
						
						c3.sub(c1,c2);
						System.out.println("\nThe difference of the entered complex numbers is:");
						c3.display();
						break;
					
					case 3:
					
						c3.mult(c1,c2);
						System.out.println("\nThe product of the entered complex numbers is:");
						c3.display();
						break;
							
							
					case 4:
				
						c3.div(c1, c2);
						System.out.println("\nThe division of the entered complex numbers is:");
						c3.display();
						break;
							
							}
								
				}
			 
					else if(ch==5)
					{
						System.out.println("\n\t\t\t\t\tThankyou!");
					}
						 
					else 
					{
						System.out.println("\nEnter valid number.");
					}
						 
			}while(ch!=5);				
}
}

