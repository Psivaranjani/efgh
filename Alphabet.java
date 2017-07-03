# efgh
import java.util.*;
import java.io.*;
public class Alphabet{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    char ch;
    ch=sc.next().charAt(0);
    if((ch>='a')&&(ch<='z')||(ch>='A')&&(ch<='Z'))
    {
      System.out.println("alphabet");
    }
    else
    {
      System.out.println("not an alphabet");
    }
  }
}
