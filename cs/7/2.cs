using System;
using System.Collections.Generic;

class Program
{
    static void Main()
    {
        List<string> nimet = new List<string> {"Torvalds", "Musk", "Gates", "Buffet", "Dorsey"};
		//
		nimet.Clear();
		List<string> newnimet = new List<string> {"Jobs", "Musk", "McAfee", "Buffet", "Wozniak"};
		foreach (string nimi in newnimet)
		{
			nimet.Add(nimi);
		}
		//
        foreach (string nimi in nimet)
        {
            Console.WriteLine(nimi);
        }
    }
}