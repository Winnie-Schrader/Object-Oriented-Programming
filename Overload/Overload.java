import java.io.*;
 class Area
  {
      int l,b,area;
      public  Area()
        {
          l=0;
          b=0;
          area=0;
        }
  public  Area(int x,int y)
        {
          l=x;
          b=y;
        }

      void rectangle()
        {
         area=l*b;
         System.out.println("The area of rectangle is: "+area);
        }

    }
      public class Overload
        {
            public static void main(String args[])
              {
                  Area a =new Area(4,2);
                  a.rectangle();

              }
        }
