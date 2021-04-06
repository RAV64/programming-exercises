using System;

class Program
{
    static void Main()
    {
        int a = 2;
        int b = 3;
        int c = 1;

        if ( (a != b) && (a < b) )
        {
            if (a > c)
            {
                Console.WriteLine("Onnistui!");
            }
        }
        else
        {
            Console.WriteLine("Yritä uudestaan!");
        }
    }
}