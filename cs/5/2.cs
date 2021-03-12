using System;

class BiggerNumber
{
	static void Main()
	{
	Console.WriteLine("Syötä ensimmäinen numero: ");
	int num1 = Convert.ToInt32(Console.ReadLine());
	Console.WriteLine("Syötä toinen numero: ");
	int num2 = Convert.ToInt32(Console.ReadLine());
	if (num1 > num2) {
		Console.WriteLine("Numero 1 on suurempi kuin numero 2.");
		} else if (num1 < num2) {
		Console.WriteLine("Numero 2 on suurempi kuin numero 1.");
		} else {
		Console.WriteLine("Numerot ovat yhtä suuret.");
		}
	}
}