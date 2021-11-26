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
class Der extends Base
{
  void sub(int a, int b)
  {
    c=a-b;
    System.out.println("The Substraction of two numbers are: "+c);
  }
}
class Derived extends Der
{
  void mul(int a, int b)
  {
    System.out.println("The multiplication of two numbers are: "+a*b);
  }
}
   public class Inheritance
   {
     public static void main(String args[])
     {
      Derived in =new Derived();
       in.add(5,7);
       in.sub(10,4);
       in.mul(12,6);
     }
   }
