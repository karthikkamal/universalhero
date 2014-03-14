 import java.io.*;
class stu{

 stu()
  {
    System.out.println("1");
  }
 void print()
  {
  
  } 
 void print(String s)
  {
    System.out.println(s);
  }
 void print(int a)
  {
    System.out.println(a);
  }

}
class over{
 public static void main(String args[]){
    stu obj[]=new stu[5];
    obj[0]=new stu(); 
    obj[0].print();
    obj[0].print("kamal");
    obj[0].print(1);   
 }
}