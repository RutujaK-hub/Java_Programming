// BufferedReader exception Handling which occured in file BufferedReader_ExceptionProne.java

import java.io.*;

class BufferedReader_Exception_Handling
{
    public static void main(String A[]) throws IOException      //Handled by using throws keyword
    {
        BufferedReader bobj = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the name : ");
        String name = bobj.readLine();       //IOException 

        System.out.println("Enter your Roll No: ");
        int RollNo = Integer.parseInt(bobj.readLine());
        

        System.out.println("Hello "+name);
        System.out.println("Your RollNo is : "+RollNo);

    }
}
