// This file contains an exception prone code which can lead to ArrayOutOfBoundException
//This will tried to be handled in file Array_Index_Exception_Handling.java

import java.util.*;

class Array_Index_Exception 
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int Arr[] = {10,20,30,40};

        System.out.println("Enter the index of array :");
        int index = sobj.nextInt();

        System.out.println("Element at that index is : "+Arr[index]);

        System.out.println("End of application");
    }
}
