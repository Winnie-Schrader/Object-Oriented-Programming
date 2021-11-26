import java.io.*;
import java.util.*;
public class Pattern
  {
      public static void main(String args[])
      {
        Scanner sc=new Scanner(System.in);
          int i,j,n,m,s=0;
          int count=0;
          System.out.print("Enter the limit: ");
          n=sc.nextInt();
          for(i=1;i<=n;i++)
          {
            for(j=1;j<=i;j++)
            { count++;
              s=count*count;
              System.out.print(s);
            }
              System.out.println();
          }
      }
  }
