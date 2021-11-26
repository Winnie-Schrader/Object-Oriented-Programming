import java.io.*;
import java.util.*;
public class StringRev
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    String s= new String("");
    String s1= new String("");
    System.out.println("Enter any Shits: ");
    s=sc.nextLine();
    for(int i=s.length()-1;i>=0;i--)
    {
      s1+=s.charAt(i);
    }
      System.out.println("The reversed Shit is: "+s1);
    if(s.equals(s1)==true)
      {
        System.out.println("The Shit is a Palindrome blyat");
      }
      else
      {
        System.out.println("The Shit is not a Palindrome blyat");
      }
  }
}
