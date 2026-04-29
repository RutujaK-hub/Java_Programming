// This is exception prone code - if we give value for b as 0 it will throw an exception 
// which willl be tried to be handled in next file  Exception_Handling.java

import java.util.*;
class Exception_Prone_Code 
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int No1 = 0, No2 = 0, Ans = 0;

        System.out.println("Enter first number : ");
        No1 = sobj.nextInt();

        System.out.println("Enter second number : ");
        No2 = sobj.nextInt();

        Ans = No1 / No2;

        System.out.println("Division is : "+Ans);
    }
}
