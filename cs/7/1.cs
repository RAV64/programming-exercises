using System;
using System.Collections.Generic;

class Program
{
	static void Main()
	{
		int syote;
		//
		List<int> numerot = new List<int>();
		do
		{
			Console.Write("Syötä numero:");
			syote = Convert.ToInt32(Console.ReadLine());
			if (syote > -1)
			{
				numerot.Add(syote);
			}
		} while (syote > -1);
		//
		Console.Write("Syöttämäsi numerot: ");
		foreach (int numero	in numerot)
		{
			Console.Write(numero + " ");
		}
	}
}