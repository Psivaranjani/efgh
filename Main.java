# efgh
import java.util.*;
import java.io.*;
public class Main{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
char ch;
ch=sc.next().charAt(0);
if((ch=='a')||(ch=='e')||(ch=='i')||(ch=='o')||(ch=='u')&&(ch=='A')||(ch=='E')||(ch=='I')||(ch=='O')||(ch=='U'))
{
System.out.println("vowels");
}
else
{
System.out.println("consonant");
}
}
}
