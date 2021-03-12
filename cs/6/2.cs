using System;

class Summing
{
	static void Main()
	{
		int summa = 0;
		while (summa < 200)
		{
			Console.Write("Summa on nyt " + summa + ". Syöte: ");
			summa += Convert.ToInt32(Console.ReadLine());
		}
		Console.WriteLine("Saavutettiin 200. Summa oli " + summa + ".");
	}
}