using System;

class Coords
{
	static void Main()
	{
		Console.WriteLine("Löydä xy-akseleilla olevan pisteen kvadrantti:");
		Console.Write("X-koordinaatti: ");
		int x = Convert.ToInt32(Console.ReadLine());
		Console.Write("Y-koordinaatti: ");
		int y = Convert.ToInt32(Console.ReadLine());

		if ((x > 0) && (y > 0)) {
			Console.WriteLine("Koordinaattipiste (" + x + "," + y + ") on kvadrantissa 1.");
			} else if ((x > 0) && (y < 0)) {
            Console.WriteLine("Koordinaattipiste (" + x + "," + y + ") on kvadrantissa 4.");
            } else if ((x < 0) && (y > 0)) {
            Console.WriteLine("Koordinaattipiste (" + x + "," + y + ") on kvadrantissa 2.");
            } else if ((x < 0) && (y < 0)) {
            Console.WriteLine("Koordinaattipiste (" + x + "," + y + ") on kvadrantissa 3.");
            } else {
                Console.WriteLine("Koordinaattipiste (0,0) on origossa.");
            }
	}
} // Koodi väittää tilanteiden joissa toinen arvo on 0 olevan aina origossa, tämä ei ole totta.