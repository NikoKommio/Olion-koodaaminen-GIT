import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Teretulemast
		
		Pesukone olio1 = new Pesukone();
		
		olio1.kaynnista(3);
		

	}

} // Main - luokan lopetus

class Pesukone {
	
	String ohjelma;
	int lampotila;
	
	public void kaynnista(int numero)
	{
		if (numero < 1 || numero > 3)
		{
			System.out.println("Invalid number");
		}
		else if (numero == 1) 
		{
			System.out.println("Pesukone käynnistetty");
		}
		else if (numero == 2)
		{
			System.out.println("Pesukone sammutettu");
		}
		
	}
	
	public void kaynnistaOhjelma()
	{
		Scanner input = new Scanner(System.in);
		int vastaus1;
		System.out.println("Valitse ohjelma kirjoittamalla '1' tai '2' ");
		System.out.println("Ohjelma 1 = puuvillapesu");
		System.out.println("Ohjelma 2 = vauvan vaatteet");
		vastaus1 = Integer.parseInt(input.nextLine());
		
		if (vastaus1==1)
		{
			System.out.println("Valittu ohjelma on " + ohjelma1 + ".");
		}
		else
		{
			System.out.println("Valittu ohjelma on " + ohjelma2 + ".");
		}
		System.out.println();
		valitseLampotila(vastaus1);
	}
	
	public void valitseLampotila(int vastaus1)
	{
		System.out.println("Valitse lämpötila kirjoittamalla '1' tai '2' ");
		System.out.println("Lämpötila 1 = 40c");
		System.out.println("Lämpötila 2 = 30c");
		int vastaus2 = Integer.parseInt(input.nextLine());
		
		if (vastaus2 == 1)
		{
			System.out.println("Valittu lämpötila on " + lampotila1 + ".");
		}
		else
		{
			System.out.println("Valittu lämpötila on " + lampotila2 + ".");
		}
		
		System.out.println("Valintasi ovat " + vastaus1 + vastaus2);
		// HALUSIN TULOSTAA MINKÄ OHJELMAN SE LÄHTEE TEKEMÄÄN MUTTA EN ONNISTUNUT tähän hätään
	}
	
	
	
}
