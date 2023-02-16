import java.io.* ;
import java.net.* ;

class TraceRoute
{
	public static void main(String [] array) throws Exception
	{
		String str ;
 		System.out.print("Enter the website address to be traced :\t") ;
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in)) ;
		String ip = br.readLine() ;
		Runtime H=Runtime.getRuntime();
		Process p=H.exec("tracert " + ip);
		InputStream in = p.getInputStream() ;
		BufferedReader br1 = new BufferedReader( new InputStreamReader(in)) ;
		while((str = br1.readLine()) != null)
		{
			System.out.println(" " + str) ;
		}
	}
}