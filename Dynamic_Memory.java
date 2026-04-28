// Dynamic Memory Allocation in java

import java.util.Scanner;

class Dynamic_Memory
{
    public static void main(String []A)
    {
        Scanner sobj = new Scanner(System.in);

        int size = 0;

        System.out.println("Enter the number of Students : ");
        size = sobj.nextInt();

        //Dynamic Memory Allocation
        float Marks[] = new float [size];

        System.out.println("Enter the marks of Students : ");
        for(int i = 0 ; i < size; i++)
        {
            Marks[i] = sobj.nextFloat();
        }

        System.out.println("Entered marks are : ");
        for(int i = 0; i < size; i++)
        {
            System.out.println(Marks[i]);
        }

        Marks = null;

        System.gc();
    }
}