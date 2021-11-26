import java.io.*;
import java.util.*;
public class Bubble
  {
    public static void main(String args[])
      {
        Scanner sc= new Scanner(System.in);
        int n,i,j,tmp;
        System.out.println("Enter the limit :");
        n= sc.nextInt();
        int a[]=new int[n];
        for(i=0;i<n;i++)
        {
          System.out.print("Enter any number: ");
          a[i]=sc.nextInt();
        }
         for(i=0;i<n;i++)
          {
            for(j=0;j<n-i-1;j++)
            {
              if(a[j]>a[j+1])
              {
                tmp=a[j];
                a[j]=a[j+1];
                a[j+1]=tmp;
              }
            }
          }
          for(i=0;i<n;i++)
          {
              System.out.print(" "+a[i]);
          }
      }
  }
