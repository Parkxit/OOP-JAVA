
public class bag1 {

		private int w;
		private String c;
		private static int wt=0;
		private static int count=0;
		 public static void output(int n)
		 {
			 if(n==0) 
			 {
				 wt=0;
				 System.out.println("The total weight of the bag is:"+wt+".");
			 }
			 else 
			 {
			 System.out.println("The total weight of the bag is:"+wt+".");
			 }
		 }
		 
		 
		public void display() 
		{	
			System.out.print("\t\t\t"+c+"\t\t\t\t"+w);
			System.out.println();
		}
		
		
		public bag1(String c,int w) 
		{
			this.c=c;
			this.w=w;
	        wt=wt+w;
	        count++;
		}
		
		
		public bag1() 
		{
			w=20;
			c="red";
			wt=wt+w;	
			count++;
		}
		
		
		public bag1(String c) 
		{
		this.c=c;
	    w=20;
		wt=wt+w;
		count++;
		}

		
		public bag1(int w) 
		{	
		c="red";
		this.w=w;
		wt=wt+w;
		count++;
		}

		
	    public static int return_obj()
	    {
	    	return count;
	    }
		
	    
		public static void delete_record(bag1[] obj, int num) 
		{
			
			wt=wt-obj[num-1].w;
			for(int i=num;i<count;i++)
			{
				obj[i-1]=obj[i];
			}
			count=count-1;
			
		}
		
		
	}

