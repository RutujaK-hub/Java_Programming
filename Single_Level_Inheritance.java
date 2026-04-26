//Single Level Inheritance

class Base
{
    public int i,j;

    public Base()
    {
        this.i = 10;
        this.j = 20;
    }

    public void fun()
    {
        System.out.println("Inside fun of Base");
    }
}

class Derived extends Base
{
    public int x;

    public Derived()
    {
        this.x = 30;
        
    }

    public void gun()
    {
        System.out.println("Inside gun of Base");
    }
}


class Single_Level_Inheritance
{
    public static void main(String A[])
    {
        Derived dobj = new Derived();

        System.out.println(dobj.i);
        System.out.println(dobj.j);
        System.out.println(dobj.x);

        dobj.fun();
        dobj.gun();

    }
}