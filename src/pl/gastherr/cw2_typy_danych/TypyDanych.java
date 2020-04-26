package pl.gastherr.cw2_typy_danych;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

import pl.gastherr.cw0_runner.IRunner;

/**
 * @author PIOTR
 *
 */
public class TypyDanych implements IRunner {

	@Override
	public String getDescription() { return "Typy danych"; }
	
	@Override
	public void run() {
		
		long duzaZmiennaLiczbowa = 382919203;			//Zakres od -9,223,372,036,854,775,808	do 9,223,372,036,854,775,807
		int zmiennaLiczbowa = 15; 						//Zakres od -2,147,483,648				do 2,147,483,647
		short mniejszaZmiennaLiczbowa = 32000;			//Zakres od -32,768 					do 32,767
		byte najmniejszaZmiennaLiczbowa = (byte) 100;	//Zakres od -128						do 127
		
		float malaPrecyzja = 92.3192f;
		double duzaPrecyzja = 3819292.39291;
		
		boolean prawdaFalsz = true;
		Boolean.parseBoolean("true"); // konwertuje tekst na zmienn¹ logiczn¹
		
		String zmiennaTekstowa = "Zdanie";
		zmiennaTekstowa.charAt(0);			//Zwraca literê na danej pozycji
		zmiennaTekstowa.concat(" jakieœ");	//Dodaje tekst do koñca zmiennej
		zmiennaTekstowa.endsWith("nie");	//Je¿eli wartoœæ zmiennej koñczy siê na "nie" zwróci true, inaczej false
		zmiennaTekstowa.equalsIgnoreCase("zdanie"); //Sprawdza czy zawartoœæ zmiennej jest równa argumentowi. Wielkoœæ liter nie ma znaczenia
		zmiennaTekstowa.equals("zdanie"); 	//Sprawdza czy zawartoœæ zmiennej jest równa argumentowi. WIELKOŒÆ LITER MA ZNACZENIE!
		zmiennaTekstowa.indexOf("an");    	//Zwraca indeks miejsca w którym zaczyna siê fraza "an"
		zmiennaTekstowa.length();		  	//Zwraca d³ugoœæ zmiennej
		zmiennaTekstowa.replace("e" , "a"); //Zamienia wszystkie elementy które pasuj¹ do filtra w pierwszym arg. na drugi element
		zmiennaTekstowa.split("n");			//Dzieli zmienn¹ wg "n" na elementy, które zwracane s¹ w postaci tablicy Stringów
		zmiennaTekstowa.startsWith("Zd");	//Je¿eli wartoœæ zmiennej zaczyna siê na "Zd" zwróci true, inaczej false
		zmiennaTekstowa.toLowerCase();		// Zamienia wszystkie du¿e litery na ma³e
		zmiennaTekstowa.toUpperCase();		// Zamienia wszystkie ma³e litery na du¿e
		
		// Przydatne metody klasy String
		String przeformatowane = String.format("%d, %s", zmiennaLiczbowa, zmiennaTekstowa);
		System.out.println(przeformatowane);
		
		String polaczone = String.join(", ", new String[] {"Tylko", "dwa", "wyrazy"});
		System.out.println(polaczone);
		
		// Tablice
		String[] tablicaTekstu = new String[] { "Zdanie", "rozbite", "na", "wyrazy" };
		
		System.out.println(tablicaTekstu.toString());	// To nie ma sensu - nic nie mówi o elementach
		System.out.println(Arrays.toString(tablicaTekstu)); // Teraz widaæ zawartoœæ tablicy!
		System.out.println(tablicaTekstu.length);
		
		
		// Listy
		ArrayList<String> listaTekstu = new ArrayList<String>();
		
		// Mapy
		HashMap<Integer, String> dziennik = new HashMap<Integer, String>();
	}
	
	/**
	 * Zamieñ wejœciow¹ zmienn¹ tak, by na wyjœciu zawsze by³a pisana ma³ymi literami
	 * @param input
	 * @return
	 */
	public static String zadanie1(String input) {
		return input.toLowerCase();
	}
	
	/**
	 * Zamieñ wejœciow¹ zmienn¹ tak, by na wyjœciu zawsze by³a pisana wielkimi literami, 
	 * wszystkie litery "a" by³y zamienione na "X", a na do zmiennej doklejony na koñcu "ero"
	 * @param input
	 * @return
	 */
	public static String zadanie2(String input) {
		return input;
	}
	
	/**
	 * Zamieñ wejœciow¹ zmienn¹ tak, by na wyjœciu wszystkie litery e by³y zamienione na u 
	 * a nastêpnie podziel zmienn¹ wed³ug litery u
	 * @param input
	 * @return
	 */
	public static String[] zadanie3(String input) {
		return new String[] { input };
	}

}
