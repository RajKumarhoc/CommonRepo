import java.io.* ;
import java.util.Scanner ;
public class Matrix_Multiplication
{
    public static void main(String arr[])
    {
        int r1,c1,r2,c2 ;
        Scanner s = new Scanner(System.in) ;
	System.out.print("Matrix Multiplication\n") ;
        System.out.print("For First matrix\nEnter no.of rows:\t") ;
	r1 = s.nextInt() ;
	System.out.print("\nEnter no.of columns:\t") ;
	c1 = s.nextInt() ;
	System.out.print("For Second matrix\nEnter no.of rows:\t") ;
	r2 = s.nextInt() ;
	System.out.print("\nEnter no.of columns:\t") ;
	c2 = s.nextInt() ;
	if (c1 != r2)
	{
		System.out.print("Matrix Multiplication is not possible") ;
		System.exit(0) ;
	}
	int [][] A = new int[r1][c1] ;
	int [][] B = new int[r2][c2] ;
	int [][] C = new int[r1][c2] ;
	int i,j,k ;
	System.out.print("\nEnter First Matrix Elements :\n") ;
	for (i = 0 ; i<r1 ; i++)
	{
		for (j = 0 ; j<c1 ; j++)
		{
			A[i][j] = s.nextInt() ;
		}
	}
	System.out.print("\nEnter Second Matrix Elements :\n") ;
	for (i = 0 ; i<r2 ; i++)
	{
		for (j = 0 ; j<c2 ; j++)
		{
			B[i][j] = s.nextInt() ;
		}
	}
	System.out.print("Resultant Matrix :\n") ;
	for (i = 0 ; i<r1 ; i++)
	{
		for (j = 0 ; j<c2 ; j++)
		{
			for(k = 0 ; k<c1 ; k++)
			{
				C[i][j] += A[i][j]* B[i][j] ;
			}
		}
	}
	for(int row[] : C)
	{
		for(int column : row)
		{
			System.out.print(column+"\t") ;
		}
		System.out.print("\n") ;
	}
    }
}