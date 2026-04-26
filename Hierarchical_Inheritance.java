//Hierarchical Inheritance

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
        System.out.println("Inside gun of Derived");
    }
}

class Other extends Base
{
    public int a;

    public Other()
    {
        this.a = 50;
    }

    public void sun()
    {
        System.out.println("Inside sun of Other");
    }

}


class Hierarchical_Inheritance
{
    public static void main(String A[])
    {
        Derived dobj = new Derived();
        Other oobj = new Other();

        System.out.println(dobj.i);
        System.out.println(dobj.j);
        System.out.println(dobj.x);
        System.out.println(oobj.a);

        dobj.fun();
        dobj.gun();
        oobj.sun();

    }
}