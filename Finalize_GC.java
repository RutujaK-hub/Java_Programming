// Use of finalize() method and request to garbage collector

class Base
{
    public int i;

    public Base()
    {
        this.i = 10;
        System.out.println("Inside base constructor");
    }

    protected void finalize()
    {
        System.out.println("Inside finalize of Base");
    }
}
class Derived extends Base
{
    public int x;

    public Derived()
    {
        this.x = 20;
        System.out.println("Inside Derived constructor");
    }

    protected void finalize()
    {
        System.out.println("Inside finalize of Derived");
    }
}


class Finalize_GC 
{
    public static void main(String A[])
    {
        System.out.println("Inside main");

        Derived dobj = new Derived();

        System.out.println(dobj.i);
        System.out.println(dobj.x);

        dobj = null;    // reference variable becomes 0

        System.gc();      //request to garbage collector

        System.out.println("End of main");
    }
}
