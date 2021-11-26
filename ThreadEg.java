import java.io.*;
import java.util.*;
class Thread1 extends Thread
{
  boolean a = true;
  public void run()
  {
    for(int i=0;i<100000;i++)
    {
      if(a==false)
      break;
      System.out.println(i);
    }
  }
}
public class ThreadEg extends Thread
{
  public static void main(String[] args) throws IOException
  {
  Thread1 k = new Thread1();
  Thread t1 = new Thread(k);
  t1.start();
  System.in.read();
  k.a=false;
  }
}
