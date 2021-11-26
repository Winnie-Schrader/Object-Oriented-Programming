import java.io.*;
import java.util.*;
class Stack1
{
int  top=-1;
int stack[]= new int[5];
  public void Push(int data)
  {

    if(top==5)
    {
      System.out.println("Stack Overload");
    }
    else
    {
      top=top+1;
      stack[top]=data;

    }
  }
  public int Pop()
  {
    int data=0;
    if(top==-1)
    System.out.println("Stack underload");
    else
    {
      data=stack[top];
          stack[top]=0;
              top=top-1;;
    }
        return (data);
  }
  public void Show()
  {
    for(int i=0;i<5;i++)
    System.out.println(stack[i]);
  }
}
public class Stacks
{
  public static void main(String args[])
  {
    Stack1 s= new Stack1();
    s.Push(5);
    s.Push(7);
    s.Push(24);
    s.Push(18);
System.out.println("Value Popped: "+ s.Pop());
System.out.println("Value Popped: "+ s.Pop());
    s.Show();

  }
}
