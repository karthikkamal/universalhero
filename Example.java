import java.io.*;
class email{
  
 email(String f,String l){
 int i;String s="";
 for(i=0;i<3;i++)
  {
    s=s+f.charAt(i);
  }
 for(i=0;i<4;i++)
  {
    s=s+l.charAt(i);
  } 
  System.out.println(s+"@gmail.com");
 }


}

class Example{
  public static void main(String args[])throws Exception{

   System.out.print("FIRST NAME:");

   BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
      
   String s=b.readLine(); 
   System.out.print("LAST  NAME:");      
    
   String s1=b.readLine();

   email s2=new email(s,s1);
 }
}

