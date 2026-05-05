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
    hobj = new Hello();
    Hello.fun();
    hobj.gun();

    hobj.i;
    hobj.j;
    
    System.out.println("Inside class main");
  }
}
