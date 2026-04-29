// User-defined exception

import java.util.*;

class User_Defined_Exception 
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter your age : ");
        int age = sobj.nextInt();

        try
        {
            if(age<18)
            {
                throw new AgeInvalid("You are underage");
            }
            else
            {
                System.out.println("You are allowed iniside");
            }
        }
        catch(AgeInvalid aobj)
        {
            System.out.println("Inside catch "+ aobj);
        }
    }
}

class AgeInvalid extends Exception
{
    public AgeInvalid (String str)
    {
        super(str);
    }
}
