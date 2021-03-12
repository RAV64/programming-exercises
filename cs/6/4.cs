using System;

class Lajittelu
{
	static void Main(String[] args)
	{
		foreach (string arg in args)
		{
			for (int i = 0; i < args.Length-1; i++)
			{
				if (Convert.ToInt32(args[i]) > Convert.ToInt32(args[i+1]))
				{
					string newi = args[i+1];
					string newip = args[i];
					args[i] = newi;
					args[i+1] = newip;
				}
			}
		}
		foreach (string arg in args)
		{
			Console.Write(arg + " ");
		}
	}
}