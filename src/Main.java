import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Käynnistä pesukone valitsemalla 1");
		int kaynnista = Integer.parseInt(input.nextLine());
		
		// Creates an object with one parameter
		Pesukone olio1 = new Pesukone("LG", kaynnista);
		
		// Checks if you want to start the machine
		if (kaynnista == 1)
		{
			olio1.kaynnista();
			
			System.out.println("\nValitse ohjelma 1 (Puuvilla) tai 2 (Kirjopesu)");
			int ohjelma = Integer.parseInt(input.nextLine());
			
			// Saves the input to the class
			olio1.ohjelma = ohjelma;
			
			// Invokes the method with parameter which we got from the input
			olio1.valitseOhjelma(ohjelma);
			
			// Asks the input for the temperature
			System.out.println("\nValitse lämpötila 1 (30°) tai 2 (40°)");
			int lampotila = Integer.parseInt(input.nextLine());
			
			olio1.lampotila = lampotila;
		
			olio1.valitseLampotila(lampotila);
			olio1.tulostaTiedot();
		}
		else
		{
			System.out.println("Pesukone sammutettu. ♫♪");
		}
		
		
		input.close();

	}

} // Main - End of the class

class Pesukone {
	
	// Attributes
	public String merkki;
	public int kaynnista;
	public int ohjelma;
	public int lampotila;
	
	
	// Default constructor
	public Pesukone()
	{
		merkki = "";
		kaynnista = 0;
		ohjelma = 0;
		lampotila = 0;
	}
	
	// Parameterized constructor with one parameter
	public Pesukone (String merkki, int kaynnista)
	{
		this.merkki = merkki;
		this.kaynnista = kaynnista;
	}
	
	// Parameterized constructor with two parameters 
	public Pesukone(int ohjelma, int lampotila)
	{
		this.ohjelma = ohjelma;
		this.lampotila = lampotila;
	}
	
	// Method that starts the machine
	public void kaynnista()
	{
			System.out.println(merkki + " merkkinen pesukoneesi käynnistetty ♪♫♪♫");
	}
	
	// Method that prints out the selected program
	public void valitseOhjelma(int ohjelma)
	{
	
		if (ohjelma < 1 || ohjelma > 2)
		{
			System.out.println("Invalid number");
		}
		else if (ohjelma == 1)
		{
			System.out.println("Valittu ohjelma on puuvilla.");
		}
		else if (ohjelma == 2)
		{
			System.out.println("Valittu ohjelma on kirjopesu.");
		}
		
		
	}
	
	// Method that takes one parameter and prints out selected temperature
	public void valitseLampotila(int lampotila)
	{
			
		if (lampotila < 1 || lampotila > 3)
		{
			System.out.println("Invalid number");
		}
		else if (lampotila == 1)
		{
			System.out.println("Valittu lämpötila on 30°");
		}
		else if (lampotila == 2) 
		{
			System.out.println("Valittu lämpötila on 40°");
		}
		
	}
	
	// Prints out the choices user made
	public void tulostaTiedot()
	{
		int i = ohjelma;
		String pesu = Integer.toString(i);
		int j = lampotila;
		String lampo = Integer.toString(j);
		
		if (ohjelma == 1)
		{
			pesu = "puuvilla";
		}
		else if (ohjelma == 2)
		{
			pesu = "kirjopesu";
		}
		
		if (lampotila == 1)
		{
			lampo = "30°";
		}
		else if (lampotila == 2)
		{
			lampo = "40°";
		}
		System.out.println("-------------------------");
		System.out.println("Valittu ohjelma: " + pesu);
		System.out.println("Valittu lämpötila: " + lampo);
	}
	
	
}
