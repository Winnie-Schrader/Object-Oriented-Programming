import java.io.*;
import java.util.*;
public class Practice
  {
    public static int magic(int n)//Must be called recursively
      {
        int r,s=0;
        while(n!=0)
        {
          r=n%10;
          s=s+r;
          n=n/10;
        }
            return(s);//retrun the  value to "sum" from the void main;
        }
          public static void main(String args[])
            { Scanner sc=new Scanner(System.in);
                int num;
                System.out.print("Enter any Number: ");
                num=sc.nextInt();
                int sum=0;
                Practice p=new Practice();
                while(num>9)
                {
                         //sum= return(s);
                  sum=p.magic(num);//(num)=int n from the function;
                num=sum;//Changing the number in order to continue the loop till I get number > 9 i.e to keep adding up
                //the digits until I get the values ranged from 1 to 9.Which will let me to determine whether the number
                //is a Magic Number or Not.//
                }
                System.out.println(sum);

                  if(sum==1)
                  {
                    System.out.println("Entered number is a Magic Number"+sum);
                  }
                  else
                    System.out.println("Entered number is not a Magic Number"+sum);

            }
      }
