import java.util.*;
class a
{
public void r()
{
    System.out.println("Hello");
}
}
class b extends a
{
public void r1()
{
    super.r();
    System.out.println("Hii");
}
}
public class Super
{
    public static void main(String args[])
    {
        b n=new b();
        n.r1();
    }
}