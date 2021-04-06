using System;
using System.Collections.Generic;

class Katseluloki
{
    static void Main()
    {
        bool init = true;
        List<Leffa> leffat = new List<Leffa>() { };
        while (init)
        {
            Console.Write("\n\r\n\r");
            Console.WriteLine("Leffojen Katseluloki");
            Console.WriteLine("====================");
            Console.WriteLine("1) Lisää Leffa");
            Console.WriteLine("2) Poista Leffa");
            Console.WriteLine("3) Näytä Raportti");
            Console.WriteLine("4) Lataa Tietokanta");
            Console.WriteLine("5) Tallenna Tietokanta");
            Console.WriteLine("6) Lopeta");
            Console.Write("Syöte: ");
            var syote = Convert.ToInt32(Console.ReadLine());
            Console.WriteLine("");

            switch (syote)
            {
                case 1:
                    Console.WriteLine("\rLisää Leffa:");
                    Console.Write("Nimi:");
                    string nimi = Console.ReadLine();
                    Console.Write("Kesto (min):");
                    int kesto = Convert.ToInt32(Console.ReadLine());
                    Console.Write("Vuosi:");
                    int vuosi = Convert.ToInt32(Console.ReadLine());
                    leffat.Add(new Leffa(nimi, kesto, vuosi));
                    break;

                case 2:
                    Console.WriteLine("\rPoista Leffa:");
                    break;

                case 3:
                    int totalDur = 0;
                    int totalMovies = 0;
                    Console.Write("\r");
                    foreach (var leffa in leffat)
                    {
                        Console.Write(leffa.Nimi + " (" + leffa.Vuosi + "), " + leffa.Kesto + " minuuttia.  \n");
                        totalDur += leffa.Kesto;
                        totalMovies++;
                    }
                    Console.Write("\n\rLeffoja katsottu yhteensä " + totalMovies + ", yhteiskesto " + totalDur + " minuuttia.\n");
                    break;

                case 4:
                    Console.WriteLine("\rLataa Tietokanta");
                    break;

                case 5:
                    Console.WriteLine("\rTallenna Tietokanta");
                    break;

                case 6:
                    Console.Write("\r");
                    init = false;
                    break;

                default:
                    break;
            }
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
}