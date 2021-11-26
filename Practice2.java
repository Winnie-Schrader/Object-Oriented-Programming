import java.io.*;
import java.util.*;
public class Practice2
  {
    public static int solution(int n)
    {
      int r,s=0;
      while(n!=0)
      {
        r=n%10;
        s=s+(r*r);
        n=n/10;
      }
          return(s);
    }
      public static void main(String args[])
        {
          Scanner sc =new Scanner(System.in);
          int num,sum=0;
          num=sc.nextInt();
          Practice2 p1=new Practice2();
            while(num>9)
            {
              sum=p1.solution(num);
              num=sum;
            }
              System.out.println(sum);
              if(sum==1)
              {
                System.out.println("Entered number is a Happy number");

              }
              else
              System.out.println("Entered number is not a Happy Number");
        }
  }
