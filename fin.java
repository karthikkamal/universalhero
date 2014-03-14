import java.io.*;
 class stu{

   final int a=10; 
   stu (int a1)
    {
      System.out.println(a);
    }
   abstract void display(int a)
    {
      
    }
  
  }



class fin extends stu{
fin(int a)
 {
   super(a);
 }
public static void main(String args[])
 {
   fin obj=new fin(10);
   obj.display(10);

 }
}