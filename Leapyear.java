# efgh
import java.util.*;
import java.io.*;
public class Leapyear{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the year");
    int a=sc.nextInt();
    
    if((a%400==0)||(a%4==0))
    {
      System.out.println("leap year");
    }
    else
    {
      System.out.println("not a leap year");
    }
  }
}
