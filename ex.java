import java.io.*;
class wrongexception extends Exception{
   wrongexception(String e)
   {
   }
  String get()
   {
     String s="invalid date";
     return s;
   }

 }

class ex{
 void pass(int d,int m,int y)throws wrongexception{
  
 if(d<1||d>31)
  {
    //System.out.println(d);
    throw new wrongexception("invalid");
  } 
 else if((m<1||m>12))
  {
    //System.out.println(m);
    throw new wrongexception("invalid");
  } 
 else if((y<1950||y>2020))
  {
    //System.out.println(y);
    throw new wrongexception("invalid");
  }
 else if(y%100!=0&&y%400!=0&&d>=29&&m==2)
  {
    throw new wrongexception("invalid");
  }
 System.out.println("Valid date");
  }   
 public static void main(String args[])throws Exception{
      ex a=new ex();
       int d,m,y;
       String s;
       BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
       System.out.println("Enter date:");
       s=b.readLine();
       d=Integer.parseInt(s);
       System.out.println("Enter month:");
       s=b.readLine();
       m=Integer.parseInt(s);
       System.out.println("Enter year:");
       s=b.readLine();
       y=Integer.parseInt(s);
     try{
      System.out.println(d+"/"+m+"/"+y);
      a.pass(d,m,y);
      }
      catch(wrongexception e){
        System.out.println(e.get());
      }  
     
 }
} 