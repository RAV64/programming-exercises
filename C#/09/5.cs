using System;
using System.Collections.Generic;
using System.IO;
using System.Xml.Serialization;

class Katseluloki
{
    static void Main()
    {
        bool init = true;
        List<Leffax> leffat = new List<Leffax>() { };
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
            int totalMovies = 0;
            int totalDur = 0;
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
                    leffat.Add(new Leffax(nimi, kesto, vuosi));
                    break;

                case 2:
                    Console.WriteLine("\rPoista Leffa:");
                    foreach (var leffa in leffat)
                    {
                        totalMovies++;
                        Console.Write(totalMovies + ") " + leffa.Nimi + " (" + leffa.Vuosi + "), " + leffa.Kesto + " minuuttia.  \n");
                    }
                    Console.Write("Syöte: ");
                    int toDel = Convert.ToInt32(Console.ReadLine()) - 1;
                    leffat.RemoveAt(toDel);
                    break;

                case 3:
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
                    List<Leffa> objList = new List<Leffa>();
                    foreach (var leffa in leffat)
                    {
                        Leffa obj = new Leffa();
                        obj.Nimi = leffa.Nimi;

                        obj.Kesto = leffa.Kesto;

                        obj.Vuosi = leffa.Vuosi;



                        objList.Add(obj);
                    }

                    XmlSerializer serialiser = new XmlSerializer(typeof(List<Leffa>));
                    TextWriter Filestream = new StreamWriter("tietokanta.xml");
                    serialiser.Serialize(Filestream, objList);
                    Filestream.Close();
                    Console.WriteLine("\rTietokanta tallennettu.");

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
public class Leffax
{
    public Leffax(string nimi, int kesto, int vuosi)
    {
        this.Nimi = nimi;
        this.Kesto = kesto;
        this.Vuosi = vuosi;
    }
    public string Nimi { get; set; }
    public int Kesto { get; set; }
    public int Vuosi { get; set; }
}
public class Leffa
{
    public string Nimi { get; set; }
    public int Kesto { get; set; }
    public int Vuosi { get; set; }
}