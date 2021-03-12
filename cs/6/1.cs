using System;

class Numerot
{
	static void Main(string[] args)
	{
		for (var i = 0; i<Convert.ToInt32(args[0])+1; i++)
		{
			var print = "";
			for (int u = 0; u<i; u++)
			{
				print += u+1;
			}
			if (print.Length>0)
			{
				Console.Write(print + "\n\r");
			}
		}
	}
}