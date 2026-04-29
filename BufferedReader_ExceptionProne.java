// BufferedReader may generate an checked exception in this file - IOException.
//  Its a checked exception which has to handled, else compiler will generate an error
// It is handled in the file BufferedReader_Exception_Handling.java

import java.io.*;

class BufferedReader_ExceptionProne 
{
    public static void main(String A[])
    {
        BufferedReader bobj = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the name : ");
        String name = bobj.readLine();       //IOException //Checked exception 

        System.out.println("Enter your Roll No: ");
        int RollNo = Integer.parseInt(bobj.readLine());     //Checked exception
        

        System.out.println("Hello"+name);
    }
}
