using System;

class Aanioikeus
{
	static void Main()
	{
	Console.WriteLine("Syötä ikäsi, ole hyvä: ");
	int ika = Convert.ToInt32(Console.ReadLine());
	if (ika >= 18)
		{
		Console.WriteLine("Voit äänestää!");
		}
	}
}