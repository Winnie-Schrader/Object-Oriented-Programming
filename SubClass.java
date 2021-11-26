import java.io.*;
import java.util.*;
class Base
  {
    int a,b,c;
    public Base(int a,int b)
    {
      this.a=a;
      this.b=b;
    }
    public void add()
    {
      c=a+b;
      System.out.println("The Output is: "+c);
    }
  }
    class Derived extends Base
      {
        public Derived(int a,int b)
        {
          super(a,b);
        }
      }
      class Der1 extends Derived
      {
        public Der1(int a,int b)
        {
          super(a,b);
        }
      }
  public class SubClass
    {
      public static void main(String args[])
      {
        Der1 d=new Der1(4,3);
        d.add();
      }
    }
