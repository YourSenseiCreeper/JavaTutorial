package pl.gastherr.cw3_pêtle;

import java.util.Scanner;

import pl.gastherr.cw0_runner.IRunner;

public class Petle implements IRunner {

	@Override
	public String getDescription() { return "Pêtle"; }
	
	@Override
	public void run() {
		// Jest kilka rodzajów pêtli: for, for-each, while oraz do-while
		// Najpopularniejszym rodzajem jest pêtla FOR
		int start = 1;
		int koniec = 11;
		int suma = 0;
		for(int i = start; i < koniec; i++) {
			suma += start;
		}
		System.out.println("Suma od 1 do 10 to: "+suma);
		
		// Pêtli FOR-EACH lub FOREACH u¿ywamy do operacji na tablicach/listach, w których nie potrzebujemy
		// odwo³ywaæ siê do poprzednich lub kolejnych elementów
		String[] imiona = new String[] { "Dawid", "Nikola", "Julia", "Patryk", "Dominika" };
		for(String imie : imiona) {
			System.out.println(imie);
		}
		
		// Pêtla WHILE
		// Obie pêtle WHILE oraz DO-WHILE zaliczaj¹ siê do niebezpiecznych - je¿eli warunek wyjœcia z pêtli
		// tutaj np. input != "exit" zawsze bêdzie spe³niony (tzn. u¿ytkownik nigdy nie wpisze "exit") pêtla
		// bêdzie siê obracaæ w nieskoñczonoœæ - ze¿re du¿o ramu, cpu, a program siê zetnie. Dlatego ostro¿nie!
		// Stosujemy j¹ do wczytywania zasobów z pliku tekstowego - czytamy tak d³ugo a¿ warunek hasNextLine()
		// jest spe³niony - jest kolejna linia tekstu, któr¹ nale¿y wczytaæ
		Scanner sc = new Scanner(System.in);
		String input = "";
		while(input != "exit") {
			System.out.println("Start: "+start+" Koniec: "+koniec);
			System.out.println("Wpisz 'exit' aby wyjœæ");
			input = sc.nextLine();
		}
		
		// Pêtla DO-WHILE
		// Najczêœciej stosujê j¹ do tworzenia menu - wtedy kiedy zanim przejdziemy przez pêtlê trzeba
		// coœ zrobiæ - wyœwietliæ ca³e menu, a potem czekaæ na odpowiedz u¿ytkownika
		boolean exit = false;
		do {
			System.out.println("Menu:");
			System.out.println("1. Suma");
			System.out.println("2. Ró¿nica");
			System.out.println("3. Iloczyn");
			System.out.println("4. Iloraz");
			System.out.println("5. Wyjdz");
			input = sc.nextLine();
			switch(input) {
				case "1": System.out.println("Suma"); break;
				case "2": System.out.println("Ró¿nica"); break;
				case "3": System.out.println("Iloczyn"); break;
				case "4": System.out.println("Iloraz"); break;
				case "5": exit = true; break;
				default: System.out.println("Nie ma opcji: "+input);
			}
		} while (!exit);
		
	}

	/**
	 * Stwórz 10-elementow¹ tablicê typu String, gdzie ka¿dy element bêdzie wygl¹daæ nastêpuj¹co
	 * "pêtla_nr" i do³¹czony do tego numer obiegu pêtli np. "pêtla_nr3" 
	 * @return
	 */
	public static String[] zadanie1() {
		return new String[10];
	}
	
	/**
	 * Do ka¿dego z wyrazów z tablicy wyrazy dodaj numer obiegu pêtli np. "ma³y0" i zwróæ w postaci tablicy
	 * @return
	 */
	public static String[] zadanie2() {
		String[] wyrazy = new String[] { 
				"ma³y", "z¹b", "zeszyt", "kolano", "twaróg", 
				"telefon", "okulary", "myszka", "pies", "list"
		};
		return wyrazy;
	}
	
	/**
	 * Podaj ile jest liczb podzielnych przez 7 w zakresie od 1 do 150
	 * @return
	 */
	public static int zadanie3() {
		return 0;
	}
	
	/**
	 * Zsumuj iloœæ liczb podzielnych przez 7 oraz podzielnych przez 13 w zakresie od 1 do 150 w³¹cznie
	 * @return
	 */
	public static int zadanie4() {
		return 0;
	}
	
	/**
	 * Zmodyfikuj pêtle tak, aby wykona³a siê tylko 5 razy
	 * @return
	 */
	public static int zadanie5() {
		int value = 29;
		for(int i = 5; i<90; i+=2) {
			value += 11;
			value = value << 1;
		}
		return value;
	}
	
}
