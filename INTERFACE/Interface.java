interface Vehicle {
	void change_gear(int g);
	void apply_brakes(int b);
	void speed_up(int s);
	void display();
}

 class Car implements Vehicle{
	private static int speed=0;
	private static int gear=0;
	
	public void change_gear(int g)
	{
	if(g==1)
	{
		if(gear==5)
		{
			System.out.println("The current gear is 5th.Cannot upshift the gear further!");
			
		}
		else {
			gear+=1;
			speed+=g;
			System.out.println("Gear changed to: "+gear);
			System.out.println("The speed has incresed.");
			System.out.println("The current speed is: "+speed);
		}
		}
		else if(g==0)
		{
			if(gear==0)
			{
				System.out.println("The car is at neutral.Cannot further downshift the gear.");
			}
			else if(gear>0 && speed==0)
			{
				gear-=1;
				System.out.println("Gear changed to: "+gear);
				System.out.println("The speed is still 0.");
			}
			
			else if(gear>0 & speed>=gear)
			{
				
				speed=speed-gear;
			gear-=1;
			System.out.println("Gear changed to: "+gear);
			System.out.println("The speed has decresed.");
			System.out.println("The current speed is: "+speed);
		}
			else if(gear>speed)
			{
				gear-=1;
				speed-=1;
				System.out.println("Gear changed to: "+gear);
				System.out.println("Speed decreased.");
				System.out.println("The current speed is: "+speed);
			}
		}
	}
	
	public void speed_up(int s)
	{
		speed=s;
		System.out.println("The speed has incresed.");
		System.out.println("The current speed is: "+speed);
		
	}
	
	public void apply_brakes(int b)
	{
		if(speed>10) {
			speed-=b;
			System.out.println("Brakes applied.Speed reduced.");
			System.out.println("The current speed is: "+speed);
			}
			else if(speed>0 & speed<=10) {
				speed-=1;
				System.out.println("Brakes applied.Slowly decreasing the speed.");
				System.out.println("The current speed is: "+speed);
			}
			else {
				speed=0;
				gear=0;
				System.out.println("Brakes applied.");
				System.out.println("The car has stopped");
			}

	}
	
	public void display()
	{
		System.out.println("The current speed of the car is: "+speed);
		System.out.println("The current gear is: "+gear);
	}
	
 }
 
 
 class Bike implements Vehicle{
		private static int speed=0;
		private static int gear=0;
		
		public void change_gear(int g)
		{
		if(g==1)
		{
			if(gear==5)
			{
				System.out.println("The current gear is 5th.Cannot upshift the gear further!");
				
			}
			else {
				gear+=1;
				speed+=g;
				System.out.println("Gear changed to: "+gear);
				System.out.println("The speed has incresed.");
				System.out.println("The current speed is: "+speed);
			}
			}
			else if(g==0)
			{
				if(gear==0)
				{
					System.out.println("The bike is at neutral.Cannot further downshift the gear.");
				}
				else if(gear>0 && speed==0)
				{
					gear-=1;
					System.out.println("Gear changed to: "+gear);
					System.out.println("The speed is still 0.");
				}
				
				else if(gear>0 & speed>=gear)
				{
					
					speed=speed-gear;
				gear-=1;
				System.out.println("Gear changed to: "+gear);
				System.out.println("The speed has decresed.");
				System.out.println("The current speed is: "+speed);
			}
				else if(gear>speed)
				{
					gear-=1;
					speed-=1;
					System.out.println("Gear changed to: "+gear);
					System.out.println("Speed decreased.");
					System.out.println("The current speed is: "+speed);
				}
			}
		}
		
		public void speed_up(int s)
		{
			speed=s;
			System.out.println("The speed has incresed.");
			System.out.println("The current speed is: "+speed);
			
		}
		
		public void apply_brakes(int b)
		{
			if(speed>10) {
			speed-=b;
			System.out.println("Brakes applied.Speed reduced.");
			System.out.println("The current speed is: "+speed);
			}
			else if(speed>0 & speed<=10) {
				speed-=1;
				System.out.println("Brakes applied.Speed reduced.");
				System.out.println("The current speed is: "+speed);
			}
			else {
				speed=0;
				gear=0;
				System.out.println("Brakes applied.");
				System.out.println("The bike has stopped");
			}
		}
		
		public void display()
		{
			System.out.println("The current speed of the bike is: "+speed);
			System.out.println("The current gear is: "+gear);
		}
		
	 }
	 

 class Bicycle implements Vehicle{
		private static int speed=0;
	
		public void change_gear(int g) {}
	
		public void speed_up(int s)
		{
			speed=s;
			System.out.println("The speed of the bicycle has incresed.");
			System.out.println("The current speed of the bicycle is: "+speed);
			
		}
		
		public void apply_brakes(int b)
		{
			speed-=b;
			System.out.println("Brakes applied.");
			System.out.println("The current speed of the bicycle is: "+speed);
		}
		
		public void display()
		{
			System.out.println("The current speed of the bicycle is: "+speed);

		}
		
	 }
	 


