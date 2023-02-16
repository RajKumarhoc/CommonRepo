import java.io.* ;
import java.net.* ;

public class ChatServer
{
 	public static void main(String [] array) throws Exception
  	{
		ServerSocket sersock = new ServerSocket(9999) ;
		System.out.println("Server ready for chatting") ;
		Socket sock = sersock.accept() ;
		BufferedReader sendRead = new BufferedReader(new InputStreamReader(System.in)) ;
		OutputStream ofstream = sock.getOutputStream() ;
		PrintWriter pwrite = new PrintWriter(ofstream,true) ;
		InputStream istream = sock.getInputStream() ;
		BufferedReader receivedread = new BufferedReader(new InputStreamReader(istream)) ;
		String receivemessage,sendmessage ;
		while(true)
		{
	  		if((receivemessage = receivedread.readLine()) != null)
	  		{
	     			System.out.println(receivemessage) ;
	  		}
	  		sendmessage = sendRead.readLine() ;
	  		pwrite.println(sendmessage) ;
	  		System.out.flush() ;
		}
    	}
}
