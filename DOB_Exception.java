import java.io.*;
import java.util.*;
class YearException extends Exception
{
  YearException(String s)
  {
    super(s);
  }
}
class MonthException extends Exception
{
  MonthException(String s1)
  {
    super(s1);
  }
}
class DayException extends Exception
{
  DayException(String s2)
  {
    super(s2);
  }
}
public class DOB
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    int year,day,month;
    System.out.println("Enter the year");
    year=sc.nextInt();
    System.out.println("Enter the month");
    month=sc.nextInt();
    System.out.println("Enter the day");
    day=sc.nextInt();
    if(year>2019|| year<1910)
    {
      try
      {
      throw new YearException("Please enter a valid Year");
      }
      catch(Exception e)

      {
        System.out.println(e);
      }
    }

    if(month>12||month<1)
    {
      try
      {
      throw new MonthException("Please enter a valid month");
      }
      catch(Exception e)

      {
        System.out.println(e);
      }
    }

    switch (month)
    {
      case 1:
      if(day>31||day<1)
      {
        try
        {
        throw new DayException("Days cannot be more than 31 in January");
        }

      catch(Exception e)
      {
        System.out.println(e);
      }
    }
    break;
    case 2:
    if(day>29&& year%4==0)
    {
      try
      {
      throw new DayException("Invalid Date for the month of February");
      }

    catch(Exception e)
    {
      System.out.println(e);
    }
 }
 if(day>28 && year%4!=0)
 {
   try
   {
   throw new DayException("Days cannot be more than 28 in Feb ");
   }

 catch(Exception e)
 {
   System.out.println(e);
 }
}
   break;
   case 3:
   if(day>31||day<1)
   {
     try
     {
       throw new DayException("Invalid date for the month of March");
     }
     catch(Exception e)
     {
       System.out.println(e);
     }
   }
   break;
   case 4:
   if(day>30||day<1)
   {
     try
     {
       throw new DayException("Invalid date for the month of April");
     }
     catch(Exception e)
     {
       System.out.println(e);
     }
   }
   break;
   case 5:
   if(day>31||day<1)
   {
     try
     {
       throw new DayException("Invalid date for the month of May");
     }
     catch(Exception e)
     {
       System.out.println(e);
     }
   }
   break;
   case 6:
   if(day>30||day<1)
   {
     try
     {
       throw new DayException("Invalid date for the month of June");
     }
     catch(Exception e)
     {
       System.out.println(e);
     }
   }
   break;
   case 7:
   if(day>31||day<1)
   {
     try
     {
       throw new DayException("Invalid date for the month of July");
     }
     catch(Exception e)
     {
       System.out.println(e);
     }
   }
   break;
   case 8:
   if(day>31||day<1)
   {
     try
     {
       throw new DayException("Invalid date for the month of August");
     }
     catch(Exception e)
     {
       System.out.println(e);
     }
   }
   break;
   case 9:
   if(day>30||day<1)
   {
     try
     {
       throw new DayException("Invalid date for the month of September");
     }
     catch(Exception e)
     {
       System.out.println(e);
     }
   }
   break;
   case 10:
   if(day>31||day<1)
   {
     try
     {
       throw new DayException("Invalid date for the month of October");
     }
     catch(Exception e)
     {
       System.out.println(e);
     }
   }
   break;
   case 11:
   if(day>30||day<1)
   {
     try
     {
       throw new DayException("Invalid date for the month of November");
     }
     catch(Exception e)
     {
       System.out.println(e);
     }
   }
   break;
   case 12:
   if(day>31||day<1)
   {
     try
     {
       throw new DayException("Invalid date for the month of December");
     }
     catch(Exception e)
     {
       System.out.println(e);
     }
   }
   break;
 }
     System.out.println(year+"/"+month+"/"+day);
  }
}
