import java.util.Scanner ; 
class EB
{
	public static void main(String []array)
	{
		double amt ;
		Scanner s = new Scanner(System.in) ;
		System.out.print("EB\nEnter your cno. :\t") ;
		int cno = s.nextInt() ;
		System.out.print("\nEnter your name :\t") ;
		String cname = s.next() ;
		System.out.print("\nEnter your previous reading :\t") ;
		int previous = s.nextInt() ;
		System.out.print("\nEnter your current readings :\t") ;			
		int current = s.nextInt() ;
		System.out.println("\nEnter your connection type :\n\t1.Domestic\n\t2.Commerical") ;
		int type = s.nextInt() ;
		double units = current - previous ;
		double dunits = units - 100 ;
		switch(type)
		{
			case 1 :
				if(units <= 100)
				{
					amt = units ;
				}
				else if(dunits <= 200 && dunits >= 101)
				{
					amt = 100 + dunits * 2.50 ;	
				}
				else if(dunits <= 500 && dunits >= 201)
				{
					amt = 100 + dunits * 4 ;
				}
				else
				{
					amt = 100 + dunits * 6 ;
				}
				System.out.println("\nCustomer NO :\t" + cno + "\nCustmer Name :\t" + cname + "\nBill Amount :\t" + amt) ;
				break ;
			case 2 :
				if(units <= 100) 
				{
					amt = units * 2 ;
				}
				else if(dunits <= 200 && dunits >= 101)
				{
					amt = 10 + dunits * 4.50 ;
				}
				else if(dunits <= 500 && dunits >= 201)
				{
					amt = 10 + dunits * 6 ;
				}
				else
				{
					amt  = dunits * 7 ;
				}
				System.out.println("\nCustomer NO :\t" + cno + "\nCustmer Name :\t" + cname + "\nBill Amount :\t" + amt) ;
				break ;
			default :
				System.out.println("\nPlease Enter a Valid Choice.") ;
		}
	}
}