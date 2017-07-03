# efgh
import java.util.*;
import java.io.*;
public class Maximum{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter three numbers");
    int a=sc.nextInt();
    int b=sc.nextInt();
    int c=sc.nextInt();
    if((a>b)&&(a>c))
    {
      System.out.println("Maximum number is "+a);
    }
    else if((b>c)&&(b>a))
    {
      System.out.println("Maximum number is "+b);
    }
    else
    {
      System.out.println("Maximum number is "+c);
    }
  }
}
