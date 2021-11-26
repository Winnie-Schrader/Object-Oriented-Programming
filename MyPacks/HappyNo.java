import happy.*;
import java.util.*;
public class HappyNo
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    int num,sum=0;
    num=sc.nextInt();
    Happy f= new Happy();
    while(num>9)
    {
      sum=f.factorial(num);
      num=sum;
    }
    System.out.println(sum);
  }
}
