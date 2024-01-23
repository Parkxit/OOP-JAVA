import java.util.Scanner;
public class Programmer extends Employee {
	//private double ns,gs;
	private long bp;
	
	public void accept()
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the basic pay: ");
		bp=sc.nextLong();
	}
	
	
	public void print()
	{
	

		System.out.println("The basic pay : "+bp);
		System.out.println("DA: "+0.97*bp);
		System.out.println("HRA: "+0.1*bp);
		System.out.println("The gross salary: "+(bp+(0.97*bp)+(0.1*bp)));
		System.out.println();
		System.out.println("Deductions: ");
		System.out.println("SCF: "+0.001*bp);
		System.out.println("PF: "+0.12*bp);
		System.out.println("\nNet salary: "+((bp+(0.97*bp)+(0.1*bp))-((0.001*bp)+(0.12*bp))));
		
	}
}
