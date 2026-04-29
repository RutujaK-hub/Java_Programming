// Array initialization techniques in java - One dimensional array

class Array_Initialisation 
{
    public static void main(String []A)
    {
        int Arr[] = {10,20,30,40,50};

        int []Brr = {10,20,30,40,50};

        int Crr[] = new int[5];

        Crr[0] = 10;
        Crr[1] = 20;
        Crr[2] = 30;
        Crr[3] = 40;
        Crr[4] = 50;

        System.out.println(Arr.length);
        System.out.println(Brr.length);
        System.out.println(Crr.length);
    }
}
