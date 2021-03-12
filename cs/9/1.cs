using System;
using System.Collections.Generic;

class Program
{
    static void Main()
    {
        List<Leffa> leffat = new List<Leffa>() { };
        leffat.Add(new Leffa("Robocop", 102, 1987));
        leffat.Add(new Leffa("Robocop 2", 117, 1990));
        leffat.Add(new Leffa("Robocop 3", 104, 1993));

        foreach (var leffa in leffat)
        {
            Console.Write("Nimi :" + leffa.Nimi + ", kesto: " + leffa.Kesto + "min, vuosi: " + leffa.Vuosi + "\n\r");
        }
    }
}

internal class Leffa
{
    public Leffa(string nimi, int kesto, int vuosi)
    {
        this.Nimi = nimi;
        this.Kesto = kesto;
        this.Vuosi = vuosi;
    }

    public string Nimi { get; }
    public int Kesto { get; }
    public int Vuosi { get; }
} //Serializable