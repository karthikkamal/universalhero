import java.rmi.*;  
import java.rmi.registry.*;  
  
public class MyServer{  
  
public static void main(String args[]){  
try{  
  
cal stub=new calcp();  
Naming.rebind("rmi://localhost:9000/sum",stub);  
  
}catch(Exception e){System.out.println(e);}  
}  
  
}  
