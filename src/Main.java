import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Teretulemast
		
		Scanner input = new Scanner(System.in);
		
		Pesukone olio1 = new Pesukone(true, 1, 2);
		
		// Käynnistää ohjelmaan, milloin tulostuu myös mitä ohjelmia tarjolla, sitten terminaaliin vaan 1 tai 2 ja enter
		olio1.kaynnista();
		int ohjelma = input.nextInt();
		
		// Valitsee ohjelman, mutta taas vaan pitää tietää et syöttää numeron, en keksi pitäskö tähän mainiin laittaa et se
		// tulostaa "Valitse ohjelma" mut se ei ois oikein, sit mietin oisko jos laittaa tohon käynnistä tai valitseohjlema metodiin sen
		olio1.valitseOhjelma(ohjelma);
		int lampotila = input.nextInt();
		olio1.valitseLampotila(lampotila);
		
		olio1.kaynnistaOhjelma();
		
		
		input.close();

	}

} // Main - luokan lopetus

class Pesukone {
	
	public boolean kaynnista;
	int ohjelma;
	int lampotila;
	
	public Pesukone(boolean kaynnista, int ohjelma, int lampotila)
	{
		this.kaynnista = kaynnista;
		this.ohjelma = ohjelma;
		this.lampotila = lampotila;
	}
	
	public void kaynnista()
	{
		if (kaynnista == true)
		{
			System.out.println("Pesukone käynnistetty ♪♫♪♫");
			System.out.println("Valitse ohjelma kirjoittamalla '1' tai '2' ");
			System.out.println("Ohjelma 1 = puuvillapesu");
			System.out.println("Ohjelma 2 = vauvan vaatteet");
		}
		else
		{
			System.out.println("Pesukone sammutettu ♪♫♪♫");
		}
		
	}
	
	public void valitseOhjelma(int ohjelma)
	{
		
		String ohjelma1 = "Puuvillapesu";
		String ohjelma2 = "Vauvan vaatteet";
		
		if (ohjelma < 1 || ohjelma > 2)
		{
			System.out.println("Invalid number");
		}
		else if (ohjelma == 1)
		{
			System.out.println("Valittu ohjelma on " + ohjelma1 + ".");
			System.out.println("Valitse lämpötila kirjoittamalla 1 tai 2\nLämpötila 1 = 30°\nLämpötila 2 = 40°");
		}
		else if (ohjelma == 2)
		{
			System.out.println("Valittu ohjelma on " + ohjelma2 + ".");
			System.out.println("Valitse lämpötila kirjoittamalla 1 tai 2");
		}
		
		
	}
	
	public void valitseLampotila(int lampotila)
	{
		String lampotila1 = "30°";
		String lampotila2 = "40°";
		
		if (lampotila < 1 || lampotila > 3)
		{
			System.out.println("Invalid number");
		}
		else if (lampotila == 1)
		{
			System.out.println("Valittu lämpötila on " + lampotila1 + ".");
		}
		else if (lampotila == 2) 
		{
			System.out.println("Valittu lämpötila on " + lampotila2 + ".");
		}
		
		//System.out.println("Valintasi ovat " + lampotila);
		// HALUSIN TULOSTAA MINKÄ OHJELMAN SE LÄHTEE TEKEMÄÄN MUTTA EN ONNISTUNUT tähän hätään
	}
	
	void kaynnistaOhjelma() 
	{
		String ohjelma1 = "Puuvillapesu";
		String ohjelma2 = "Vauvan vaatteet";
		String lampotila1 = "30°";
		String lampotila2 = "40°";
		
		if (ohjelma == 1)
		{
			System.out.println("Ohjelma " + ohjelma1 + " käynnistyy.");
		}
		else if (ohjelma == 2)
		{
			System.out.println("Ohjelma " + ohjelma2 + " käynnistyy.");
		}
		
		if (lampotila == 1)
		{
			System.out.println("Pesun lämpötila on " + lampotila1);
		}
		else if (lampotila == 2)
		{
			System.out.println("Pesun lämpötila on " + lampotila2);
		}
		
	}
	
}
