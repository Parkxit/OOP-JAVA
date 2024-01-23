import java.util.*;
public class Exhandling{
	private int num1,num2;
	private double ans;
	public void getdata()
	{
		try {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number: ");
		num1=sc.nextInt();
		System.out.println("Enter second number: ");
		num2=sc.nextInt();
		ans=num1/num2;
		System.out.println("Division is: "+ans);
	}
		catch(ArithmeticException e){
			System.out.println("You cannot divide by zero...\n\t\t\tEnter valid denominator: ");
		}
		catch(InputMismatchException e)
		{
			System.out.println("You have to enter integer values...please enter only integer values");
		}
	}
	
	public void array()
	{
		int i;
		int[]arr= {1,2,3,4,5}	;
		Scanner sc=new Scanner(System.in);
		System.out.println("Array is: " );
		for(int j=0;j<5;j++)
		{
			System.out.println(arr[j]);
		}
		System.out.println("Enter the position of element to access: ");
		i=sc.nextInt();
		try {
			System.out.println(arr[i]);
		}
		catch(Exception e)
		{
			System.out.println("There is no element at that position!");
		}
	}
}