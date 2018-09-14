 import java.util.*;
 import java.util.Scanner;
 class  Main
 {
  public static void main(String args[])
  {
      Scanner obj = new Scanner(System.in);
      String a=obj.next();
      int i;
      char b[]=a.toCharArray();
      
      for(i=0;i<a.length();i++)
      { 
      if(Character.isLowerCase(b[i]))
      {
       b[i]=(char)(b[i]-32);

      }
      else
      {
     b[i]=(char)(b[i]+32);
      }
      }
 for(i=0;i<b.length;i++)
 {
   System.out.print(b[i]);
 }

  }  
 }