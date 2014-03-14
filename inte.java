import java.io.*;

interface quotation{
 public  void displayitem(){} 
  
 }
class invoice extends quotation{

  public void displayitem(){

  }

 }
class inte{
 public static void main(String args[]){
   invoice a=new invoice();
   a.displayitem();   
  }
}

