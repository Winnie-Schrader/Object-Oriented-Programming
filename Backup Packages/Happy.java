package happy;
public class Happy
  {
    public int factorial(int n)
      {
        int r,s=0;
        while(n!=0)
          {
            r=n%10;
            s=s+r*r;
            n=n/10;
          }
            return(s);
       }
    }
