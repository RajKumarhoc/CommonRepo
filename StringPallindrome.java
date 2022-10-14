import java.util.Scanner ;

public class StringPallindrome
{
	public static void main(String arr[])
	{
		String str,rev = "" ;
		Scanner s  = new Scanner(System.in) ;
		System.out.print("Enter a String :\t") ;
		str = s.nextLine() ;
		int len = str.length() ;
		for (int i = len -1 ; i >= 0 ; i--)
		{
			rev += str.charAt(i) ;
		}
		if ( str.equals(rev))
		{
			System.out.print(str + " is a pallindrome.") ;
		}
		else
		{
			System.out.print(str + " is not a pallindrome.") ;
		}
	}
}