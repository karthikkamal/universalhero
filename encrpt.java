import java.io.*;
class encrpt{
public static void main(String args[])throws Exception                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         {
  String s,s1="",s2="";int i;
  BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
  System.out.println("Enter string:");
  s=b.readLine();
  s=s.toUpperCase();
  System.out.println("Encrypt all char to 4 place before") ;
  for(i=0;i<s.length();i++)
   {
     int k=s.charAt(i)+3,k1;char c;
     if(k>90)
      {
        k=k%90;c='A';
        for(int j=0;j<k;j++)
         {
           c++; 
         }
        s1=s1+c;
       }
     else{c=s.charAt(i);for(int j=0;j<=3;j++){c++;}s1=s1+c;}
   }
   System.out.println(s1);
    s=b.readLine();
  s1=s.toUpperCase();
    for(i=0;i<s1.length();i++)
   {
     int k=s1.charAt(i)-3,k1;char c;
     if(k<65)
      {
        k=s1.charAt(i)+3;
        k=k%65;c='Z';
        for(int j=0;j<k;j++)
         {
           c--; 
         }
        s2=s2+c;
       }
     else{c=s1.charAt(i);for(int j=0;j<=3;j++){c--;}s2=s2+c;}
   }
   System.out.println(s2);
 }
}