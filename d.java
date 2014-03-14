import java.io.*;
class b{
  int a=10;
  void display1()
   {
    System.out.println("b");
   }
 }
class  d extends b
 {
    int b=11;
    void display()
   {
    System.out.println(b);
   }

   public static void main(String args[])
    {
       b obj=new d();
       obj.display1();
       System.out.println(obj.b);       
    }

 }