public class Throws 
{
    public static void main(String args[]) 
    {
        try {
            int a = 10;
            int b = 0;
            // Division by zero
            System.out.println(a / b);  
        } 
        catch (ArithmeticException e) 
        {
            System.out.println("Error: Cannot divide by zero.");
        }
    }
}
