import java.util.*;
  public class ArithmeticException
  {
    public static void a(int a,int b)
    {
      if(b==0)
      {
        throw new ArithmeticException("Cannot Divide");
      }
      System.out.println(a/b);
    }
      public static void main(String args[])
      {
        //try block
        try
        {
          a(10,0);
        }
        //catch block
        catch(ArithmeticException e)
        {
        System.out.println(e.getMessage());
        }
      }
    }
  