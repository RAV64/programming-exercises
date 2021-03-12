using System;
using System.IO;

class FileMaker
{
    static void Main(string[] args)
    {
        string path = ".";
        int i = 0;
        string[] dirList = Directory.GetFiles(path, "*.dat");

        foreach (string file in dirList)
        {
            File.Delete(file);
            i++;
        }
        Console.WriteLine(i + " tiedosto(a) poistettu.");
    }
}