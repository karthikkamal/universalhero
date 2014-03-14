import java.io.*;
import java.net.*;
class clientt{
	public static void main(String args[])throws Exception{
		DataOutputStream dos;
		DataInputStream dis;
		 Socket s=new Socket("192.168.117.178",1231);
		//while(true){

		 dos=new DataOutputStream(s.getOutputStream());
		 BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
		  dis=new DataInputStream(s.getInputStream());
		try{
		 while(true){
		 String s1=b.readLine();
		 dos.writeUTF(s1);
		
		 String m=dis.readUTF();
		 System.out.println(m);
		
		}}
		catch(Exception e){System.out.println(e);}
		dos.close();
		dis.close();


	}
}