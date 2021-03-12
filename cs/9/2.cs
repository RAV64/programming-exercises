using System;

class Katseluloki
{
    static void Main()
    {
        bool init = true;

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
                    Console.WriteLine("\rLisää Leffa");
                    break;
                case 2:
                    Console.WriteLine("\rPoista Leffa");
                    break;
                case 3:
                    Console.WriteLine("\rNäytä Raportti");
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