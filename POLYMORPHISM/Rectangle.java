import java.util.Scanner;
public class Rectangle extends Shape{
	private double area,b;
	
	public void accept()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length of the rectangle: ");
		a=sc.nextDouble();
		System.out.println("Enter the breadth of the rectangle: ");
		b=sc.nextDouble();
		
	}
	
	public void compute_area()
	{
		area=a*b;
		System.out.println("The formula for area of the rectangle is: length x breadth .");
	}
	
	public void output()
	{
		System.out.println("The area of rectangle is: "+area);
	}
	
	
}
