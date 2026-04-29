// Array initialization techniques in java - Multi dimensional Array
class Array_MultiDi_Initialization 
{
    public static void main(String []A)
    {
        int Arr[][] = {{10,20,30,63},{40,50,60,89},{70,80,90,36}};

        int [][]Brr = {{10,20,30},{40,50,60},{70,80,90}};

        int Crr[][] = new int[2][3];

        Crr[0][0] = 10;
        Crr[0][1] = 20;
        Crr[0][2] = 30;
        Crr[1][0] = 40;
        Crr[1][1] = 50;
        Crr[1][2] = 60;

        System.out.println(Arr.length);     //3
        System.out.println(Brr.length);     //3
        System.out.println(Crr.length);     //2

        System.out.println(Arr[0].length);     //4
        System.out.println(Arr[1].length);     //4
        System.out.println(Arr[2].length);     //4

        System.out.println(Brr[0].length);     //3
        System.out.println(Brr[1].length);     //3
        System.out.println(Brr[2].length);     //3

        System.out.println(Crr[0].length);     //3
        System.out.println(Crr[1].length);     //3

    }
}
