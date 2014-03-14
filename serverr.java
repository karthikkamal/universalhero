import java.io.*;
import java.net.*;
class serverr{
	public static void main(String args[])throws Exception{
		DataOutputStream dos;
		DataInputStream dis;
	  	ServerSocket s=new ServerSocket(500);

 		//while(true){
 		 
			Socket ss=s.accept(); 	
		 dis=new DataInputStream(ss.getInputStream());
		  BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
		  dos=new DataOutputStream(ss.getOutputStream());
		try{while(true){
		 String m=dis.readUTF();
		 System.out.println(m);
		  
		
		 String s1=b.readLine();
		 dos.writeUTF(s1);
           
		}}
		catch(Exception e){
		System.out.println(e);}
		dos.close();
		dis.close();

	}
}