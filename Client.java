/* Here, we are creating a package named PPA which includes files such as Marvellous.java, 
Infosystems.java and in subpackage called LB which contains Pune.java
Marvellous.java file contains fun() method , Infosystems.java contains gun() method and Pune.java contains a sun() method
I have created a file Client.java to use this user defined package and imported them in Client.java 
And i have called all three fun(),gun()and sun() method in Client.java file */

//User defined package import
import PPA.Marvellous;
import PPA.Infosystems;
import PPA.LB.Pune;

class Client
{
    public static void main(String A[])
    {
        Marvellous mobj = new Marvellous();
        Infosystems iobj = new Infosystems();
        Pune pobj =  new Pune();

        System.out.println("Inside main of Client");

        mobj.fun();
        iobj.gun();
        pobj.sun();
    }
}