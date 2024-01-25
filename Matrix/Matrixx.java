public class Matrixx
{
    private int rows;
    private int columns;
    private int[][] mat=new int[rows][columns];
  
    public Matrixx(int rows, int columns, int[][] mat) 
    {
    	 this.rows = rows;
         this.columns = columns;
         this.mat = mat ;
	
	}
    
    public Matrixx(int[][] mat,int rows, int columns) 
    {
    	
         this.mat = new int[rows][columns];
        
	}
    
    
    
    public void add(Matrixx m1,Matrixx m2)
    {
    
    	 int m4[][]=new int[m1.rows][m1.columns];
         Matrixx matrix3 = new Matrixx(m4,rows,columns);
    	  
    	  
    		  for (int i = 0; i < m1.rows; i++) {
    			 
    	            for (int j = 0; j < m1.columns; j++) {
    	            
    	               this.mat[i][j] = m1.mat[i][j] + m2.mat[i][j];
    	            }
    	        }
    		  
    		  for (int i = 0; i < m1.rows; i++) 
  	        {
  	            for (int j = 0; j < m1.columns; j++) 
  	            {
  	            	System.out.print(mat[i][j]+" ");
  	            }
  	            System.out.println();
  	        }
    	  
    	 
    	
    }
    
    public void subtract(Matrixx m1, Matrixx m2) 
    {
    	 int m4[][]=new int[m1.rows][m1.columns];
         Matrixx matrix3 = new Matrixx(m4,rows,columns);
 
    		
    		 for (int i = 0; i < m1.rows; i++) {
    	            for (int j = 0; j < m1.columns; j++) {
    	                mat[i][j] = m1.mat[i][j] - m2.mat[i][j];
    	}
    	}
    		  for (int i = 0; i < m1.rows; i++) 
    	        {
    	            for (int j = 0; j < m1.columns; j++) 
    	            {
    	            	System.out.print(mat[i][j]+" ");
    	            }
    	            System.out.println();
    	        }
    	
    }
    
    
    public void multiply(Matrixx m1, Matrixx m2,int ro,int col) {
        
        	for (int i = 0; i < m1.rows; i++) {  
       
            for (int j = 0; j < m2.columns; j++) {
            
                int sum = 0;
                for (int k = 0; k < m1.columns; k++) {
               
                    sum += m1.mat[i][j] * m2.mat[k][j];
                }
              
                mat[i][j] = sum;
            }
        } 
        	 for (int i = 0; i < m1.rows; i++) 
 	        {
 	            for (int j = 0; j < m2.columns; j++) 
 	            {
 	            	System.out.print(mat[i][j]+" ");
 	            }
 	            System.out.println();
 	        }
        }
 
    
    
    
    public void transpose(Matrixx m1,int rows,int columns)
    {

   	 for (int i = 0; i < m1.columns; i++) 
        {
            for (int j = 0; j < m1.rows; j++) 
            {
            	System.out.print(mat[j][i]+" ");
            }
            System.out.println();
        }
    }
    
    public void display()
    {

		  for (int i = 0; i < rows; i++) 
	        {
	            for (int j = 0; j < columns; j++) 
	            {
	            	System.out.print(mat[i][j]+" ");
	            }
	            System.out.println();
	        }
    }
  
    }
    