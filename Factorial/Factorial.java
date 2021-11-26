import java.io.*;
import java.util.*;
public class Factorial
  {
    public static void main(String[] args)
    {

          int i,n;
          int fact=1;
            Scanner sc = new Scanner(System.in);
          System.out.println("Enter any Number");
           n=sc.nextInt();
           for(i=n;i>=1;i--)
            {
              fact=fact*i;
            }
          System.out.println("The Number is: "+fact);
    }
  }
