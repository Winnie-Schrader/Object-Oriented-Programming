import java.io.*;
import java.util.*;
public class LongestWord
  {
    public static void main(String args[])
    {
      int i,j,k=0;
      int max;
      int count[] =new int[50];
      String s= new String("TATA Steel Jamshedpur ");
      String s1="";
      for(i=0;i<s.length();i++)
      {
        count[k]=0;
        if(s.charAt(i)!=' ')
        {
          s1+=s.charAt(i);
        }
        else
        {
          count[k]=s1.length();
          k++;
          s1="";
        }

      }
      max=count[0];
      for(j=0;j<k;j++)
      {
        if(count[j]>max)
        {
          max=count[j];
        }
      }
      System.out.println("The length of the Largest word present in the String is: "+max);//Well,got the length now I need the Word to be printed//
    }
  }
