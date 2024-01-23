#include<iostream>
using namespace std;

class feet_inch;
class metre_centimetre
{
	int mt,cm;
	friend metre_centimetre add(metre_centimetre m1,feet_inch f1);
	friend feet_inch add(feet_inch f1,metre_centimetre m1);
	friend metre_centimetre sub(metre_centimetre m1,feet_inch f1);
	friend feet_inch sub(feet_inch f1,metre_centimetre m1);
	public:
		void display();
		metre_centimetre(int m,int c);
		metre_centimetre();
};


	 metre_centimetre::metre_centimetre(int m,int c)
	{	
		mt=m;
		cm=c;
	}
	
	metre_centimetre::metre_centimetre()
	{
	 mt=0;
	 cm=0;	
	}	


	void metre_centimetre::display()
	{
		cout<<"\nThe value in metres is:"<<mt;
		cout<<"\nThe value in centimetres is:"<<cm;
	}
	
	


class feet_inch
{	
	int ft,in;
	public:
		void display();
		friend metre_centimetre add(metre_centimetre m1,feet_inch f1); 
		friend feet_inch add(feet_inch f1,metre_centimetre m1);
		friend metre_centimetre sub(metre_centimetre m1,feet_inch f1);
		friend feet_inch sub(feet_inch f1,metre_centimetre m1);
		feet_inch();
		feet_inch(int feet,int inch);
};


	feet_inch::feet_inch(int feet,int inch)
	{
		ft=feet;
		in=inch;
	}
	

	feet_inch::feet_inch()
	{
		ft=0;
		in=0;
	}
	
	void feet_inch::display()
	{
		cout<<"\nThe feet value is:"<<ft;
		cout<<"\nThe inch value is:"<<in;
	}
	
	
		metre_centimetre sub(metre_centimetre m1,feet_inch f1)
	{
		float c;
		int n;
		
		metre_centimetre temp;
		c=((m1.mt*100)+(m1.cm))-((f1.ft*30.48)+(f1.in*2.54));
		n=c;
		temp.mt=n/100;
		temp.cm=n%100;
		return temp;
	}
	
	
		metre_centimetre add(metre_centimetre m1,feet_inch f1)
	{
		float c;
		int n;
		
		metre_centimetre temp;
		c=(m1.mt*100)+(m1.cm)+(f1.ft*30.48)+(f1.in*2.54);
		n=c;
		temp.mt=n/100;
		temp.cm=n%100;
		return temp;
	}
	
	
	
	feet_inch add(feet_inch f1,metre_centimetre m1)
	{
		float c;
		int n;
		
		feet_inch temp;
		c=(m1.mt*39.37)+(m1.cm*0.394)+(f1.ft*12)+(f1.in);
		n=c;
		temp.ft=n/12;
		temp.in=n%12;
		return temp;
	}
	
	feet_inch sub(feet_inch f1,metre_centimetre m1)
	{
		float c; 
		int n;
		 
		feet_inch temp;
		c=((m1.mt*39.37)+(m1.cm*0.394))-((f1.ft*12)+(f1.in));
		n=c;
		temp.ft=n/12;
		temp.in=n%12;
		return temp;
	}
	

	

	
	int main()
	{
		int m,c,feet,inch;
		cout<<"Enter value in metres:";
		cin>>m;
		cout<<"Enter value in centimetres:";
		cin>>c;
		cout<<"Enter value feet:";
		cin>>feet;
		cout<<"Enter value in inches:";
		cin>>inch;
		
		metre_centimetre m1(m,c);
		feet_inch f1(feet,inch);
		m1.display();
		f1.display();
		int ch;
		do{
		cout<<"\n\nChoose the conversion that you want:\n1)Sum and Unit:Feet and Inches\n2)Sum and Unit:Metres and Centimetres\n3)Substraction and output in metre centimetres\n4) Substraction and output in feet and inches\n5)None(Exit)\n:";
		cin>>ch;
		switch(ch)
		{
			case 1:{		
				f1=add(f1,m1);
				f1.display();
				}
			break;
			
			case 2:{
				m1=add(m1,f1);
				m1.display();
				}
				break;	
		
			case 3:{
				m1=sub(m1,f1);
				m1.display();
				}
				break;
		
			case 4:{
				f1=sub(f1,m1);
			        f1.display();
				}
				break;
		
			default:
				cout<<"Thankyou!";
		}
}while(ch!=5);
}
