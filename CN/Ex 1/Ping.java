
import java.io.*;
import java.net.*;

class Ping
{
public static void main(String args [])throws Exception
{
String str;
System.out.println("Enter the IP Address to be ping: ");
BufferedReader buf1=new BufferedReader(new InputStreamReader(System.in));
String ip=buf1.readLine();
Runtime H=Runtime.getRuntime();
Process p=H.exec("ping " + ip);
InputStream in=p.getInputStream();
BufferedReader buf2=new BufferedReader(new InputStreamReader(in));
while((str=buf2.readLine())!=null)
{
System.out.println(" " + str);
}
}
}