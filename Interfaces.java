import java.io.*;
import java.util.*;
interface Base
{
  public void add(int a, int b);
}
public class Interfaces implements Base
{
  int c;
  public void add(int a, int b)
  {
    c=a+b;
    System.out.println("The Sum of two numbers are: "+c);
  }
  public static void main(String args[])
  {
    int a,b;
    Interfaces obj= new Interfaces();
    obj.add(4,6);
  }
}
