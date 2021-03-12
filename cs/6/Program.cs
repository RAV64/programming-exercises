using System;

class Peli
{
	static void Main()
	{
		bool keepPlaying = true;
		bool wrongInput = true;
		int input = 0;
		while (keepPlaying)
		{
			Console.WriteLine("Torakka-Jalka-Ydinase. Valitse 1-4.");
			Console.WriteLine("1) Torakka 2) Jalka 3) Ydinase 4) Poistu");
			try
			{
				input = Convert.ToInt32(Console.ReadLine());
			} catch (FormatException)
			{
				Console.WriteLine("Input must be a whole number");
				input = 0;
				break;
			}

			switch (input)
			{
				case 1:
					Console.WriteLine("Torakka!");
					break;
				case 2:
					Console.WriteLine("Jalka!");
					break;
				case 3:
					Console.WriteLine("Ydinase!");
					break;
				case 4:
					keepPlaying = false;
					break;
				default:
					Console.WriteLine("Valitse 1-4");
					wrongInput = false;
					break;
			}

			Random random = new Random();
			int computer = random.Next(1, 4);
			if (keepPlaying && wrongInput)
			{
				switch (computer)
				{
					case 1:
						if (input == 1) {
							Console.WriteLine("Tietokone valitsi: Torakka. Tasapeli!");
						} else if (input == 2) {
							Console.WriteLine("Tietokone valitsi: Torakka. Sinä voitit!");
						} else {
							Console.WriteLine("Tietokone valitsi: Torakka. Sinä hävisit.");
						}
						break;
					case 2:
						if (input == 1) {
							Console.WriteLine("Tietokone valitsi: Jalka. Sinä hävisit.");
						} else if (input == 2) {
							Console.WriteLine("Tietokone valitsi: Jalka. Tasapeli!");
						} else {
							Console.WriteLine("Tietokone valitsi: Jalka. Sinä voitit!");
						}
						break;
					case 3:
						if (input == 1) {
							Console.WriteLine("Tietokone valitsi: Ydinase. Sinä voitit!");
						} else if (input == 2) {
							Console.WriteLine("Tietokone valitsi: Ydinase. Sinä hävisit.");
						} else {
							Console.WriteLine("Tietokone valitsi: Ydinase. Tasapeli!");
						}
						break;
				}
			}
			Console.WriteLine("");
			wrongInput = true;

		}
	}
}