# efgh
import java.util.*;
import java.io.*;
public class Positive{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number");
    int a=sc.nextInt();
    if(a==0)
    {
      System.out.println("zero");
    }
    else if(a>0)
    {
      System.out.println("positive");
    }
    else
    {
      System.out.println("negative");
          }
  }
}
