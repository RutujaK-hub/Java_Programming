// This file tries to handle the exception which might appear in file Array_Index_Exception.java

import java.util.Scanner;

class Array_Index_Exception_Handling 
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int Arr[] = {10,20,30,40};
        int index = sobj.nextInt();

        try
        {
            System.out.println("Enter the index of array :");
            System.out.println("Element at that index is : "+Arr[index]);
        }
        catch(ArrayIndexOutOfBoundsException aobj)
        {
            System.out.println("Exception Occured : "+ aobj);
        }


        System.out.println("End of application");
    }
}
