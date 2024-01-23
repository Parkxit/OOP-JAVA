import java.util.Scanner;
public class Circle extends Shape {
	
	private double area;
	public void getdata() 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the radius of the circle: ");
		a=sc.nextDouble();
	}
	
	public void compute_area()
	{
		area=3.14*a*a;
		System.out.println("Formula of area of a circle is: 3.14*r*r.");
	}
	
	public void display()
	{
		System.out.println("Area of circle is: "+area);
	}
}
