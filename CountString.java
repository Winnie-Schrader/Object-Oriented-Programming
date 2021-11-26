import java.io.*;
import java.util.*;
public class CountString
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
      int i,count=0;
      int count1=0;
      int count2=0;
      String s = new String("");
      System.out.println("Enter a Text blyat: ");
      s= sc.nextLine();
    //  int count[]=new count[s.length()];
      for(i=0;i<s.length();i++)
      {
        if(s.charAt(i)=='A'|| s.charAt(i)=='a'||s.charAt(i)=='E'||s.charAt(i)=='e'||s.charAt(i)=='I'||
        s.charAt(i)=='i'|| s.charAt(i)=='O'|| s.charAt(i)=='o'|| s.charAt(i)=='U'|| s.charAt(i)=='u')
        {
        count++;
        }

        else if(s.charAt(i)>='A'&& s.charAt(i)<='Z'|| s.charAt(i)>='a' && s.charAt(i)<='z')
        {
          count1++;
        }
        else
        {
          count2++;
        }
      }
      System.out.println("The no of vowels are: "+count);
      System.out.println("The Number of Consonents are:"+count1);
      System.out.println("Number of extra Characters are: "+count2);
    }
}
