using System;
using System.IO;

class FileMaker
{
    static void Main(string[] args)
    {
        string path = ".";
        string[] dirList = Directory.GetFiles(path);

        foreach (string file in dirList)
        {
            Console.WriteLine(file);
        }
    }
}