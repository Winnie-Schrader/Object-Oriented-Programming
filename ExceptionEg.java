import java.io.*;
import java.util.*;
class MyException extends Exception
{
  MyException(String s)
  {
    super(s);
  }
}
public class ExceptionEg
{
  public static void main(String[] args)
  {
    int a;
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter any number");
    a=sc.nextInt();
    if(a>4000)
    {
      try
      {
        through new MyException(">4000 is invalid");
      }
      catch(Exception e)
      {
      System.out.println(e);
      }
    }
  }
}
