using System;
using System.IO;

class FileReader
{
    static void Main(string[] args)
    {
        try
        {
            if (File.Exists(args[0]))
            {
                Console.WriteLine(File.ReadAllText(args[0]));
            }
            else
            {
                Console.WriteLine("Tiedostoa ei löytynyt!");
            }
        }
        catch
        {
            {
                Console.WriteLine("Ei tiedostonimeä!");
            }
        }
    }
}