import java.io.*;
import java.util.*;
public class Sorting
{
  public static void main(String args[])
  {
    int n,i,j;
    String tmp = new String("");
    Scanner sc= new Scanner(System.in);
    Scanner s1=new Scanner(System.in);
    System.out.println("Enter the range: ");
    n=sc.nextInt();
    String s[]= new String[n];
    for(i=0;i<n;i++)
    {
      System.out.println("Enter your name: ");
      s[i]=s1.nextLine();
    }
    for(i=0;i<n;i++)
    {
      for(j=0;j<n-i-1;j++)
      {
        if(s[j].compareTo(s[j+1])>0)
        {
          tmp=s[j];
          s[j]=s[j+1];
          s[j+1]=tmp;
        }
      }
    }
    System.out.println("The names in Sorted order are: ");
    for(i=0;i<n;i++)
    {
      System.out.println(s[i]);
    }
  }
}
