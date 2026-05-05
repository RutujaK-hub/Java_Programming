// static method calling
class Hello
{
  int i,j;
  public static void fun()
  {
    System.out.println("Inside fun of Hello);
  }

  public void gun()
  {
    System.out.println("Inside gun of Hello");
  }
}


public class Rough
{
  public static void main(String A[])
  {
    Hello hobj = null;
    System.out.println("Inside class main");
  }
}
