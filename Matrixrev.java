import java.io.*;
import java.util.*;
public class Matrixrev
  {
      public static int reverse(int n)
      {
        int r,s=0;
        while(n!=0)
          {
            r=n%10;
            s=s*10+r;
            n=n/10;
          }
          return(s);

      }
      public static void main(String args[])
        {
            Scanner sc=new Scanner(System.in);
          int a[][]=new int[2][2];
          int i,j,b=0,c=0;
          Matrixrev m=new Matrixrev();
          System.out.println("Enter the values of the matrix: ");
          for(i=0;i<2;i++)
          {
            for(j=0;j<2;j++)
              {
                a[i][j]=sc.nextInt();
              }
          }
          for(i=0;i<2;i++)
            {
              for(j=0;j<2;j++)
              {
                b=m.reverse(a[i][j]);
                a[i][j]=b;
                }
            }
              System.out.println("The reversed numbers in a matrix are: ");
            for(i=0;i<2;i++)
              { System.out.println();
                for(j=0;j<2;j++)
                {
                  System.out.print(a[i][j]+"\t");
                }
              }
        }
  }
