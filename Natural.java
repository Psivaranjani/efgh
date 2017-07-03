# efgh
import java.io.*;
import java.util.*;
public class Natural 
{
  public static void main(String args[])
   {
         int a, i = 1 ;
         int sum = 0;
         System.out.println("Enter Number of items :");
         Scanner s = new Scanner(System.in);
         a= s.nextInt();
         while(i <= a)
         {
         sum = sum +i;
          i++;
          }
         System.out.println("Sum of "+a+" numbers is :"+sum);
     } 
 }
