import java.io.*;
interface quotation{  
void displayitem(int k,int[] a,int c);
  
}  
  
interface payout{  
void amountpay(int t1,int t);  
}  
  
class invoice implements quotation,payout{  
  
public void displayitem(int k,int[] a,int c){
 System.out.println("Amount Of Items:"+ k);
 System.out.println("cost of each item:");
 for(int i=0;i<k;i++)
  {
   System.out.println("Amount Of "+(i+1)+"Item :"+a[i]); 
  }                         
 System.out.println("total cost:"+c);                                                                 
}  
public void amountpay(int t,int c){System.out.println("Amount paid:"+ t);System.out.println("cost given by supplier:"+c);}  
  
public static void main(String args[])throws Exception{  
invoice obj = new invoice();
System.out.println("Enter no. items");
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
 
String s;
s=b.readLine();
int k,t=0;
k=Integer.parseInt(s);
int cost[]=new int[k];
System.out.println("enter cost of each item:");
for(int i=0;i<k;i++)
 {
  s=b.readLine();
  cost[i]=Integer.parseInt(s); 
  t=t+cost[i]; 
 } 
obj.displayitem(k,cost,t);  
s=b.readLine();
k=Integer.parseInt(s);
obj.amountpay(t,k-t);  
 }  
}  