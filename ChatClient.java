import java.io.* ;
import java.net.* ;

public class ChatClient
{
 	public static void main(String [] array) throws Exception
  	{
		Socket sock = new Socket("localhost", 9999) ;
		BufferedReader sendRead = new BufferedReader(new InputStreamReader(System.in)) ;
		OutputStream ofstream = sock.getOutputStream() ;
		PrintWriter pwrite = new PrintWriter(ofstream, true) ;
		InputStream istream = sock.getInputStream() ;
		BufferedReader receivedread = new BufferedReader(new InputStreamReader(istream)) ;
		System.out.println("client ready for chatting") ;
		String receivemessage, sendmessage ;
		while(true)
		{
	  		sendmessage=sendRead.readLine() ;
	  		pwrite.println(sendmessage) ;
	  		System.out.flush() ;
	   		if((receivemessage = receivedread.readLine()) != null)
	  		{
	     			System.out.println(receivemessage) ;
	  		}
		}
    	}
}
