import java.io.*;
import java.util.*;
public class Frequency
{
    public static void main(String args[])
      {
        int count[]=new int[20];
        String s=new String("Hell ya");
        int i,j;
          char s1=' ';
            for(i=0;i<s.length();i++)
          {
            count[i]=1;
            for(j=i+1;j<s.length();j++)
            {
              if(s.charAt(i)==s.charAt(j))
                {
                  count[i]++;

                }
            }
              if(count[i]>1&&s.charAt(i)!=' ')
              {
              System.out.println(s.charAt(i)+" = "+count[i]);
                s1=s.charAt(i);
            }

          }
            System.out.println("The characters occured only one time:");
            for(i=0;i<s.length();i++)
            {
              if(s1!=s.charAt(i)&&s.charAt(i)!=' ')
              {
                  System.out.println(s.charAt(i)+" = "+count[i]);
              }
            }

      }
}
