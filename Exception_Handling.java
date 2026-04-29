// Exception handling in the Exception_Prone_Code.java - use of specific catch block

import java.util.*;
class Exception_Handling
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int No1 = 0, No2 = 0, Ans = 0;

        System.out.println("Enter first number : ");
        No1 = sobj.nextInt();

        System.out.println("Enter second number : ");
        No2 = sobj.nextInt();

        try
        {
            System.err.println("Inside try block");
            Ans = No1 / No2;
        }
        catch(ArithmeticException eobj)
        {
            System.out.println("Inside catch block");
            System.out.println("Exception occured : " + eobj);
        }

        System.out.println("Division is : "+Ans);
    }
}
