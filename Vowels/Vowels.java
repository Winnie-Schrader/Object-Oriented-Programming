import java.io.*;
import java.util.*;
public class Vowels
  {
    public static void main(String args[])
      {
        Scanner sc=new Scanner(System.in);
        String a;
        System.out.println("Enter any alphabet");
          a=sc.nextLine();
          switch(a)
          {
            case "a":
                  System.out.println("The entered letter is a Vowel: "+a);
                  break;
            case "A":
                  System.out.println("The entered letter is a Vowel: "+a);
                  break;
            case "e":
                  System.out.println("The entered letter is a Vowel: "+a);
                  break;
            case "E":
                  System.out.println("The entered letter is a Vowel: "+a);
                  break;
            case "i":
                  System.out.println("The entered letter is a Vowel: "+a);
                  break;
            case "I":
                  System.out.println("The entered letter is a Vowel: "+a);
                  break;
            case "o":
                  System.out.println("The entered letter is a Vowel: "+a);
                  break;
            case "O":
                  System.out.println("The entered letter is a Vowel: "+a);
                  break;
            case "u":
                 System.out.println("The entered letter is a Vowel: "+a);
                 break;
            case "U":
                 System.out.println("The entered letter is a Vowel: "+a);
                 break;
            default:
                 System.out.println("The Entered letter is a Consonant:  "+a);
                 break;
          }
      }
  }
