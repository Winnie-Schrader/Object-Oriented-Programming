import java.io.*;
import java.util.*;
public class Vowelsstr
  {
    public static void main(String args[])
    {

    String s=new String("TATA Steel Jamshedpur");
    int i;
    for(i=0;i<s.length();i++)
    {
      if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'
      ||s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U')
        {
         System.out.print("*");
        }
        else
          System.out.print(s.charAt(i));
    }

     }
  }
