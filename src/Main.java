import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Käynnistä pesukone valitsemalla 1 tai 2");
		int kaynnista = Integer.parseInt(input.nextLine());
		
		Pesukone olio1 = new Pesukone(kaynnista);
		
		
		olio1.kaynnista();
		int ohjelma = input.nextInt();
		olio1.ohjelma = ohjelma;
		
		olio1.valitseOhjelma(ohjelma);
		
		
		int lampotila = input.nextInt();
		olio1.lampotila = lampotila;
	
		olio1.valitseLampotila(lampotila);
		
		olio1.kaynnistaOhjelma();
		
		
		input.close();

	}

} // Main - luokan lopetus

class Pesukone {
	
	public int kaynnista;
	int ohjelma;
	int lampotila;
	
	public Pesukone()
	{
		kaynnista = 0;
		ohjelma = 0;
		lampotila = 0;
	}
	
	public Pesukone (int kaynnista)
	{
		this.kaynnista = kaynnista;
	}
	
	public Pesukone(int ohjelma, int lampotila)
	{
		this.ohjelma = ohjelma;
		this.lampotila = lampotila;
	}
	
	public void kaynnista()
	{
		if (kaynnista < 1 || kaynnista > 2)
		{
			System.out.println("Invalid number");
		}
		else if (kaynnista == 1) 
		{
			System.out.println("Pesukone käynnistetty ♪♫♪♫");
			System.out.println("Valitse ohjelma kirjoittamalla '1' tai '2' ");
			System.out.println("Ohjelma 1 = puuvillapesu");
			System.out.println("Ohjelma 2 = vauvan vaatteet");
		}
		else if (kaynnista == 2)
		{
			System.out.println("Pesukone sammutettu ♪♫♪♫");
		}
		
	}
	
	public void valitseOhjelma(int ohjelma)
	{
	
		if (ohjelma < 1 || ohjelma > 2)
		{
			System.out.println("Invalid number");
		}
		else if (ohjelma == 1)
		{
			System.out.println("Valittu ohjelma on puuvillapesu.");
			System.out.println("Valitse lämpötila kirjoittamalla 1 tai 2\nLämpötila 1 = 30°\nLämpötila 2 = 40°");
		}
		else if (ohjelma == 2)
		{
			System.out.println("Valittu ohjelma on vauvan vaatteet.");
			System.out.println("Valitse lämpötila kirjoittamalla 1 tai 2");
		}
		
		
	}
	
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
		
		//System.out.println("Valintasi ovat " + lampotila);
		// HALUSIN TULOSTAA MINKÄ OHJELMAN SE LÄHTEE TEKEMÄÄN MUTTA EN ONNISTUNUT tähän hätään
	}
	
	void kaynnistaOhjelma() 
	{
			System.out.println("Ohjelma " + ohjelma + " käynnistyy. Lämpötila on " + this.lampotila);
	}
		
	
	
}
