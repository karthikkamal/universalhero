import java.io.*;
abstract class stu{

   stu(int a)
    {   
      a=a*a*a;
      System.out.println(a);
    }
  
  }



class abs1 extends stu{
abs1(int a)
 {
   super(a);
 }
public static void main(String args[])
 {
   abs1 obj=new abs1(10);

 }
}