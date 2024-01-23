import java.util.Scanner;
public class Triangle extends Shape {
	private double area,b;
	
	public Triangle() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the height and base of the triangle: ");
		a=sc.nextDouble();
		b=sc.nextDouble();
	}
	
	public void compute_area()
	{
		area=0.5*a*b;
		System.out.println("The formula for area of the triangle is: 1/2 x base x height.");
	}
	
	public void print()
	{
		System.out.println("The area of trianle is: "+area);
	}
}
