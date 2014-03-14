import java.awt.*;
import javax.swing.*;
import java.net.*;
import java.io.*;
public class server5 implements Runnable
{
ServerSocket ss;
Socket s1,s2;
BufferedReader br,br1;
PrintWriter pw,pw1;
Thread t1,t2;
String str;
public server5()
    {
    try {
        ss=new ServerSocket(110);
        s1=ss.accept();
        s2=ss.accept();
        br=new BufferedReader(new InputStreamReader(s1.getInputStream()));
        br1=new BufferedReader(new InputStreamReader(s2.getInputStream()));
        pw=new PrintWriter(s1.getOutputStream(),true);
        pw1=new PrintWriter(s2.getOutputStream(),true);
        t1=new Thread(this);
        t2=new Thread(this);
        t1.start();
        t2.start();
        }
    catch(Exception ee)
        {
        System.out.println(ee);
        }
     
    }
public void run()
    {
    try {
   while(true)
    {
    if(Thread.currentThread()==t1)
        {
        str=br.readLine();
        pw1.println(str);
        }
    else
        {
        str=br1.readLine();
        pw.println(str);
        Thread.sleep(600);
        }
    }
    }
   catch(Exception ee)
    {
    System.out.println(ee);
    }
    }
public static void main(String arg[])
    {
    new server();
    }
}