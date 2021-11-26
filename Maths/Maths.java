import java.io.*;
import java.util.*;
public class Maths
{
    public static double factorial(double n)
      {
          double i;
          double fact=1;
          for(i=n;i>=1;i--)
          {
            fact=fact*i;
          }
            return (fact);
       }
   public static void main(String args[])
      { Scanner sc =new Scanner(System.in);
        double x,i,n,fact;
        double s=1;
        double j=0;
        System.out.println("Enter the limit");
        n=sc.nextInt();
        System.out.println("Enter any number");
        x=sc.nextInt();
        Maths m=new Maths();
        for(i=1;i<=n;i++)
          {
              j=j+2;
              fact=m.factorial(j);
              if(i%2==0)
              {
                s=s+(Math.pow(x,j)/fact);
              }
              else
                s=s-(Math.pow(x,j)/fact);
          }
          System.out.println("The Output is:"+s);
      }
}
