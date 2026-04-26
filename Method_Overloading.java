// Method Overloading

class Overload 
{
    public int Addition(int i,int j)                // Mangled name - Addition@2ii
    {
        return i+j;
    }
    public double Addition(double i,double j)       //overloading By changing data types of arguments   // Mangled name - Addition@2dd
    {
        return i+j;         
    }
    public float Addition(float i,float j,float k)   //overloading By changing number of arguments  // Mangled name - Addition@3fff
    {
        return i+j+k;
    }
}

class Mehtod_Overloading 
{
    public static void main(String A[])
    {
        Overload obj = new Overload();

        System.out.println(obj.Addition(10,20));
        System.out.println(obj.Addition(10.0,20.0));
        System.out.println(obj.Addition(10.0f,20.0f,30.0f));
    }
}
