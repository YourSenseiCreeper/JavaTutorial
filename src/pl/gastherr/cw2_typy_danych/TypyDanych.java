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
		Boolean.parseBoolean("true"); // konwertuje tekst na zmienn� logiczn�
		
		String zmiennaTekstowa = "Zdanie";
		zmiennaTekstowa.charAt(0);			//Zwraca liter� na danej pozycji
		zmiennaTekstowa.concat(" jakie�");	//Dodaje tekst do ko�ca zmiennej
		zmiennaTekstowa.endsWith("nie");	//Je�eli warto�� zmiennej ko�czy si� na "nie" zwr�ci true, inaczej false
		zmiennaTekstowa.equalsIgnoreCase("zdanie"); //Sprawdza czy zawarto�� zmiennej jest r�wna argumentowi. Wielko�� liter nie ma znaczenia
		zmiennaTekstowa.equals("zdanie"); 	//Sprawdza czy zawarto�� zmiennej jest r�wna argumentowi. WIELKO�� LITER MA ZNACZENIE!
		zmiennaTekstowa.indexOf("an");    	//Zwraca indeks miejsca w kt�rym zaczyna si� fraza "an"
		zmiennaTekstowa.length();		  	//Zwraca d�ugo�� zmiennej
		zmiennaTekstowa.replace("e" , "a"); //Zamienia wszystkie elementy kt�re pasuj� do filtra w pierwszym arg. na drugi element
		zmiennaTekstowa.split("n");			//Dzieli zmienn� wg "n" na elementy, kt�re zwracane s� w postaci tablicy String�w
		zmiennaTekstowa.startsWith("Zd");	//Je�eli warto�� zmiennej zaczyna si� na "Zd" zwr�ci true, inaczej false
		zmiennaTekstowa.toLowerCase();		// Zamienia wszystkie du�e litery na ma�e
		zmiennaTekstowa.toUpperCase();		// Zamienia wszystkie ma�e litery na du�e
		
		// Przydatne metody klasy String
		String przeformatowane = String.format("%d, %s", zmiennaLiczbowa, zmiennaTekstowa);
		System.out.println(przeformatowane);
		
		String polaczone = String.join(", ", new String[] {"Tylko", "dwa", "wyrazy"});
		System.out.println(polaczone);
		
		// Tablice
		String[] tablicaTekstu = new String[] { "Zdanie", "rozbite", "na", "wyrazy" };
		
		System.out.println(tablicaTekstu.toString());	// To nie ma sensu - nic nie m�wi o elementach
		System.out.println(Arrays.toString(tablicaTekstu)); // Teraz wida� zawarto�� tablicy!
		System.out.println(tablicaTekstu.length);
		
		
		// Listy
		ArrayList<String> listaTekstu = new ArrayList<String>();
		
		// Mapy
		HashMap<Integer, String> dziennik = new HashMap<Integer, String>();
	}
	
	/**
	 * Zamie� wej�ciow� zmienn� tak, by na wyj�ciu zawsze by�a pisana ma�ymi literami
	 * @param input
	 * @return
	 */
	public static String zadanie1(String input) {
		return input.toLowerCase();
	}
	
	/**
	 * Zamie� wej�ciow� zmienn� tak, by na wyj�ciu zawsze by�a pisana wielkimi literami, 
	 * wszystkie litery "a" by�y zamienione na "X", a na do zmiennej doklejony na ko�cu "ero"
	 * @param input
	 * @return
	 */
	public static String zadanie2(String input) {
		return input;
	}
	
	/**
	 * Zamie� wej�ciow� zmienn� tak, by na wyj�ciu wszystkie litery e by�y zamienione na u 
	 * a nast�pnie podziel zmienn� wed�ug litery u
	 * @param input
	 * @return
	 */
	public static String[] zadanie3(String input) {
		return new String[] { input };
	}

}
