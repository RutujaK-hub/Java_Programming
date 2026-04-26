// The other use of super keyword - when there is a parameterized constructor in base class 
// and default in its derived class, when we create the object of derived class error generates
// for that we have to use super to give parameters to the base class constructor

class Base
{
    public int i;
    public Base(int value1)
    {
        value1 = this.i;
    }
}

class Derived extends Base
{
    public int x;
    public Derived()
    {
        super(10);      // passing parameter in base class constructor
        this.x = 20;
    }
}

class Super_Use2 
{
    public static void main(String A[])
    {
        Derived dobj = new Derived();

        System.out.println(dobj.x);
    }
}

