// Use of this and super keyword

class Base
{
    public int i;
    
    public Base()
    {
        System.out.println("Inside Base constructor");
        this.i = 11;
    }

}

class Derived extends Base
{
    public int i;
   
    public Derived()
    {
        System.out.println("Inside Derived Constructor");
        this.i = 21;
    }

    public void gun()
    {
        System.out.println("Inside gun of Derived");
        System.out.println("Value of i : "+ this.i);            //Derived i
        System.out.println("Value of i from Base :" +  super.i); //Base i
    }

}

class This_Super
{
    public static void main(String A[])
    {
       Derived dobj = new Derived();

       dobj.gun();
    }
}
