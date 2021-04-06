using System;

class Program
{
    static void Main()
    {
        int x = 3;
        int y = 1;
        int z = 2;
        string s = "C";
        
        if (((x >= y) && (y < z)) || ((x > y) && (s == "A")) )
        {
            if (s == "C")
            {
                Console.WriteLine("Onnistui!");
            }
            else
            {
                Console.WriteLine("Melkein!");
            }
        }
        else
        {
            Console.WriteLine("Ei iha, yritä vielä!");
        }
    }
}