import java.rmi.*;  
import java.io.*;
  
public class MyClient{  
  
public static void main(String args[])throws Exception{  
try{  
  
cal stub=(cal)Naming.lookup("rmi://localhost:9000/sum");
System.out.println("Enter two number:");
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
String a=b.readLine();
int k=Integer.parseInt(a);  
a=b.readLine();
int k1=Integer.parseInt(a);
System.out.println("enter operation:");
a=b.readLine();
int k2=Integer.parseInt(a);
if(k2==1){
System.out.println(stub.add(k,k1));}
if(k2==2){  
System.out.println(stub.sub(k,k1));}
if(k2==3){
System.out.println(stub.mul(k,k1));}
if(k2==4){
System.out.println(stub.div(k,k1));}
  
}catch(Exception e){}  
}  
  
}  