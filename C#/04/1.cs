using System;

class Tietotyypit
{
    static void Main()
    {
        short var1 = 0;
        byte var2 = 0;
        float var3 = 0;
        char var4 = (char) 0;
        bool var5 = true;
        ulong var6 = 0;
        decimal var7 = 0;

        Console.WriteLine("Var1 on tyyppiä " + var1.GetType());
        Console.WriteLine("Var2 on tyyppiä " + var2.GetType());
        Console.WriteLine("Var3 on tyyppiä " + var3.GetType());
        Console.WriteLine("Var4 on tyyppiä " + var4.GetType());
        Console.WriteLine("Var5 on tyyppiä " + var5.GetType());
        Console.WriteLine("Var6 on tyyppiä " + var6.GetType());
        Console.WriteLine("Var7 on tyyppiä " + var7.GetType());

    }
}