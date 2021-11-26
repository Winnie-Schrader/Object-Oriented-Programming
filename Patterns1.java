import java.io.*;
import java.util.*;
public class Patterns1
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      int i,j,n;
      System.out.println("Enter any number: ");
      n=sc.nextInt();
      for(i=1;i<=n;i++)
        {
          for(j=1;j<=i;j++)
            {
              System.out.print(" ");
            }
            for(j=n;j>=i;j--)
            {
              System.out.print("*");
            }
            System.out.println();
        }

    }
  }
