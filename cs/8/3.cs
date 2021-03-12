using System;
using System.IO;

class FileMaker
{
    static void Main(string[] args)
    {
        Console.Write("Tiedosto johon lisätään: ");
        var tiedosto = Console.ReadLine();
        Console.WriteLine("Syötä tiedostoon " + tiedosto + " lisättävä sisältö:");
        var sisalto = Console.ReadLine();

        using (StreamWriter sw = new StreamWriter(tiedosto, true))
        {
            sw.WriteLine(sisalto);
            sw.Close();
        }
    }
}