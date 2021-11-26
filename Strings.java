import java.io.*;
import java.util.*;
public class Strings
  {
    public static void main(String args[])
      {
        String s= new String("Leo");
        String s1 = new String("Vermilion");
        String s2= new String("");
        System.out.println("The differnce between 2 strings : "+s.compareTo(s1));
        System.out.println("The length of 1st String is: "+s.length());
        System.out.print("The reverse order of 1st String is: ");
        for(int i=s.length()-1;i>=0;i--)
          {
            System.out.print(s.charAt(i));
          }
          System.out.println();
          if(s.equals(s1))
          {
            System.out.println("The 2 strings are equal");
          }
            else
            {
            System.out.println("The 2 Strings are not equal");
            }
            s2=s+s1;
            System.out.println("My Name is: "+s2);
            System.out.println("My Nickname is: "+s.replace("Leo","Vermilion"));
            System.out.println(s.substring(0,3));
      }
  }
