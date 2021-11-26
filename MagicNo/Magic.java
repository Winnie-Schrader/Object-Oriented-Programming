import java.io.*;
import java.util.*;
public class Magic
  {
    public static int Sumofdig(int n)
      {
        int r,s=0;
        while(n!=0)
        {
          r=n%10;
          s=s+r;
          n=n/10;
        }
        return(s);
      }
        public static void main(String args[])
        {
          int num=192,sum;
          Magic m=new Magic();
          while(num>9)
          {
            sum=num;
          num=m.Sumofdig(sum);
          }
            System.out.println(num);
            if(num==1)
            System.out.println("The entered number is a Magic Number");
            else
            System.out.println("The Entered Number is not a Magic Number");
        }
  }
