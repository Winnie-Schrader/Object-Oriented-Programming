import java.io.*;
import java.util.*;
public class VectorExample
{
  public static void main(String args[])
  {
    Vector v1= new Vector();
    v1.add("1");
    v1.add("Hello");
    System.out.println("The capacity of vector is: "+v1.capacity());
    System.out.println("The size of vector is: "+v1.size());
    System.out.println("The first element of Vector is: "+v1.firstElement());
  }
}
