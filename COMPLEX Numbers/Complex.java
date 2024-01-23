
public class Complex 
{
	private double real,img;
	
	
	public Complex(double real,double img) 
	{
		this.real=real;
		this.img=img;
	}
	
	
	public Complex()
	{
		real=0;
		img=0;
	}
	
	
	public void display()
	{
		System.out.println(real+"+"+"("+img+"i)");
	}
	
	
	public void add(Complex c1,Complex c2) 
	{
		real=c1.real+c2.real;
		img=c1.img+c2.img;
	}
	
	
	public void sub(Complex c1,Complex c2) 
	{
		real=c1.real-c2.real;
		img=c1.img-c2.img;
	}
	
	
	public void mult(Complex c1,Complex c2) 
	{
		real=(c1.real*c2.real)-(c1.img*c2.img);
		img=(c1.real*c2.img)+(c1.img*c2.real);

	}
	
	public void div(Complex c1,Complex c2)
	{
		
		real=((c1.real*c2.real)+(c1.img*c2.img))/(((c2.real)*(c2.real))+((c2.img)*(c2.img)));
		img=((c1.img*c2.real)-(c1.real*c2.img))/(((c2.real)*(c2.real))+((c2.img)*(c2.img)));
	}

}
