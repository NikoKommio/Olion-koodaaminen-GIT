import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Teretulemast
		
		Pesukone olio1 = new Pesukone();
		
		olio1.kaynnista();
		

	}

} // Main - luokan lopetus

class Pesukone{
	Scanner input = new Scanner(System.in);
	String ohjelma1 = "puuvillapesu";
	String ohjelma2 = "vauvan vaatteet";
	int lampotila1 = 40;
	int lampotila2 = 30;
	
	public void kaynnista()
	{
		System.out.println("Pesukone käynnistetty");
		System.out.println();
		kaynnistaOhjelma();
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
