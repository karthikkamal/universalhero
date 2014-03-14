import java.io.*;
import java.util.*;
class stack{ 
 int top;
 LinkedList<Integer> a=new LinkedList<Integer>(); 
 stack()
  {
   top=0;
  } 
 void push(int b)
  {
      
    a.add(b);
    top++;
     
  } 
 void pop()
  {
    if(top>=0)
     {
       a.removeLast();top--;
     }    
     else{System.out.println("stack is empty!");}
  }
 void top1()
  {
    int k=0;
    for(int i: a)
     {
       if(k==top-1)
        { 
          System.out.println("top:"+i);break;
        }
       k++;   
     }
  } 
 public static void main(String args[])throws Exception
   {
        
      BufferedReader B=new BufferedReader(new InputStreamReader(System.in));
       stack k=new stack();
      while(true)
       {
          System.out.print("Enter 1 for push,2 for pop,3 for top,4 for break:");
          String s=B.readLine();
          int n=Integer.parseInt(s);
          if(n==1)
            {
               System.out.println("Enter the number to add:");
               String s1=B.readLine();
               int n1=Integer.parseInt(s1);
               k.push(n1);
            } 
          else if(n==2)
            {
              k.pop();
            }
          else if(n==3)
            {
              k.top1();
            }  
          else
             {
                break;
             } 
       }
    
   }
}