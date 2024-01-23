import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Employee {
	
	private String name,adr,email,id,mob;
	 


	int y,m,d,l;
	
	 public static boolean isValidMobileNumber(String mobileNumber)
	 {
		 String regex="^[789]\\d{9}$";
		 Pattern pattern=Pattern.compile(regex);
		 Matcher matcher=pattern.matcher(mobileNumber);
		 return matcher.matches();
	 }
	
	 public static boolean isValidEmail(String email)
	 {
		 String regex="^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
		 Pattern pattern=Pattern.compile(regex);
		 Matcher matcher=pattern.matcher(email);
		 return matcher.matches();
	 }
	

	 public static boolean isValidName(String name)
	 {
		 String regex="^[a-zA-Z ]+$";
		 Pattern pattern=Pattern.compile(regex);
		 Matcher matcher=pattern.matcher(name);
		 return matcher.matches();
	 }
	 
	 public static boolean isValidid(String id)
	 {
		 String regex="^[0-9 ]+$";
		 Pattern pattern=Pattern.compile(regex);
		 Matcher matcher=pattern.matcher(id);
		 return matcher.matches();
	 }
	
	 
	public void getdata()
	{
	
		Scanner sc=new Scanner(System.in);
		int i=0;
		do {
		System.out.println("Enter Name(first name only): ");
		name=sc.next();
		if(isValidName(name)) {
			i=1;
		}
		else {
			System.out.println("Invalid name.Please enter name correctly.");
		}
		}while(i!=1);
		
		
		 i=0;
		do
		{
			System.out.println("Enter id(only number): ");
			id=sc.next();
			if( isValidid(id)) {
				i=1;
			}
			else {
				System.out.println("Invalid id.ID should consist of only numbers.");
			}
			
		}while(i!=1);
		

		i=0;
		do {
			System.out.println("Enter email id: ");
			email=sc.next();
			if( isValidEmail(email)) {
				i=1;
			}
			else {
				System.out.println("Invalid email id.Enter the correct email id.");
			}
			
		}while(i!=1);
		
		
	 i=0;
      do {
		System.out.println("Enter mobile number: ");
		mob=sc.next();
		if(isValidMobileNumber(mob)) {
		
			 i=1;
		}
		else {
			System.out.println("Invalid mobile number.The mobile number should start with either 9,8 or 7 and it must be exactly of 10 digits.");
		}
      }while(i!=1);
		System.out.println("Enter date of birth: ");
		do {
		System.out.println("Enter year of birth(eg.2004): ");
		y=sc.nextInt();
		
		if(y<=1921 || y>2005)
		{
			System.out.println("Invalid birth year.The employee's age must be between 18 and 10.");
		}
		}while(y<=1922||y>=2005);
do {
			System.out.println("Enter birth month(eg.10): ");
			m=sc.nextInt();
			if(m<1 || m>12 )
			{
				System.out.println("Incorrect birth month: ");
			}
}while(m<1 || m>12);
			do {
				System.out.println("Enter the birth date(eg.23): ");
				d=sc.nextInt();
				if(m==1||m==3||m==5||m==7||m==8||m==10||m==12)
				{
					if(d<=1||d>=31)
					System.out.println("Incorrect birth date.");
					
				}
				}while(d<1||d>31);
			do {
				 if(m==2||m==4||m==6||m==9||m==11)
						 {
						 if(d<=1||d>=30){
							 System.out.println("Incorrect birth date.");
						 }
				
					else if(m==2 && ((y%400==0)||(y%4==0&&y%100!=0)  &&(d<1 || d>29)))
					System.out.println("Incorrect birth date.");
				}
				 }while(d<1||d>31);
			
		System.out.println("Enter address: ");
		adr=sc.next();	
	}
	
	
public void display()
{
	System.out.println("\nName : "+name+"\nId : "+id+"\nEmail id : "+email+"\nMobile no. : "+mob+"\nDOB : "+d+"/"+m+"/"+y+"\nAddress : "+adr);
}

}

