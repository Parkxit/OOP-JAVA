import java.util.Scanner;
public class Matrixx_op
{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter the number of rows for matrix 1: ");
        int r = sc.nextInt();
        System.out.print("Enter the number of columns for matrix 1: ");
        int cols = sc.nextInt();
        int m1[][]=new int[r][cols];
       
        System.out.println("Enter values for matrix 1:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < cols; j++) {
               m1[i][j]=sc.nextInt();
            }
        }
        
        Matrixx matrix1 = new Matrixx(r, cols,m1);
        System.out.println("Matrix 1:");
        matrix1.display();
   
        
        System.out.print("Enter the number of rows for matrix 2: ");
        int ro = sc.nextInt();
        System.out.print("Enter the number of columns for matrix 2: ");
        int col = sc.nextInt();
        int m2[][]=new int[ro][col];
        
        
        System.out.println("Enter values for matrix 2:");
        for (int i = 0; i < ro; i++) {
            for (int j = 0; j < col; j++) {
            	m2[i][j]=sc.nextInt();
            }
        }
        
         Matrixx matrix2 = new Matrixx(ro,col,m2);
         System.out.println("Matrix 2:");
         matrix2.display();
         
         int ch;
         int m4[][]=new int[r][cols];
         Matrixx matrix3 = new Matrixx(m4,r,cols);
          
         do {
         System.out.println("\n\n1.Addition.\n2.Substraction\n3.Multiplication\n4.Transpose of first matrix\n5.Transpose of second matrix\n6.Exit.");
       System.out.println("Choose the operation that you want to perform on the entered two matrices: ");
        ch=sc.nextInt();
        switch(ch) {
        	case 1:
        		if (r == ro & cols == col){
        			System.out.println("The Sum of the entered matrices is:");
            		matrix3.add(matrix1, matrix2);
                    
                }
        		else {
        		System.out.println("Matrix dimensions do not match for addition.");
        		}
        	       
        		  break;
        		
        	case 2:
        	{
        		if (r == ro & cols == col){
        			System.out.println("The difference of the entered matrices is:");
            		matrix3.subtract(matrix1,matrix2);
                   
                }
        		else {
        			 System.out.println("Matrix dimensions do not match for subtraction.");
        		}    
        		break;
        	}
        		
        	case 3:
        		if (cols != ro){
                    System.out.println("Matrix dimensions do not match for multiplication.");
                }
        		else {
        			
        		System.out.println("The product of the entered matrices is:");
        		matrix3.multiply(matrix1,matrix2,ro,col);
        		}
        	        
        		 break;
        	case 4:
        		System.out.println("The transpose matrix of the first entered matrix is: ");
        		 matrix1.transpose(matrix1,r,cols);
        		 break;
        		 
        	case 5:
        		System.out.println("The transpose matrix of the second entered matrix is: ");
        		 matrix2.transpose(matrix2,ro,col);
        		 break;
        		 
        	case 6:
        		System.out.println("ok");
        		break;
        		
        		default:
        			System.out.println("Enter valid choice.");
         
        }
         }while(ch!=6);
    
    }

 
}
