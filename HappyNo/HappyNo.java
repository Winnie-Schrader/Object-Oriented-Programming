import java.io.*;
//import java.util.*;
  public class HappyNo
  {
    public static int Happy(int n)
    {

        int r=0;
        int a=0;
            while(n!=0)
          {
            r=n%10;
            a=a + (r*r);
            n=n/10;

          }

          return(a);

    }
      public static void main(String args[])
      {
      //Scanner sc = new Scanner(System.in);
          HappyNo h=new HappyNo();
          int num=82;
          while(num>9)
          {
            num=h.Happy(num);
          }
          System.out.println(num);
          if(num==1)
          System.out.println("It is a happy Number");
          else
          System.out.println("It is not a happy number");
      }
  }
