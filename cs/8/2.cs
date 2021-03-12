using System;
using System.IO;

class FileMaker
{
    static void Main(string[] args)
    {
        Console.Write("Tiedostonimi: ");
        var name = Console.ReadLine();
        Console.WriteLine("Sisalto tiedostolle " + name + ":");
        var content = Console.ReadLine();

        using (StreamWriter sw = new StreamWriter(name))
        {
            sw.Write(content);
            sw.Close();
        }
    }
}