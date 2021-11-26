import java.io.*;
import java.util.*;
class Base
{
  int c;
  void add(int a, int b)
  {
    c=a+b;
    System.out.println("The Sum of two numbers are: "+c);
  }
}
class Derived extends Base
{
  void sub(int a, int b)
  {
    c=a-b;
    System.out.println("The Substraction of two numbers are: "+c);
  }
}
   public class SingleIn
   {
     public static void main(String args[])
     {
      Derived in =new Derived();
       in.add(5,7);
       in.sub(12,6);
     }
   }
