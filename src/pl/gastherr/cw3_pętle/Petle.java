package pl.gastherr.cw3_p�tle;

import java.util.Scanner;

import pl.gastherr.cw0_runner.IRunner;

public class Petle implements IRunner {

	@Override
	public String getDescription() { return "P�tle"; }
	
	@Override
	public void run() {
		// Jest kilka rodzaj�w p�tli: for, for-each, while oraz do-while
		// Najpopularniejszym rodzajem jest p�tla FOR
		int start = 1;
		int koniec = 11;
		int suma = 0;
		for(int i = start; i < koniec; i++) {
			suma += start;
		}
		System.out.println("Suma od 1 do 10 to: "+suma);
		
		// P�tli FOR-EACH lub FOREACH u�ywamy do operacji na tablicach/listach, w kt�rych nie potrzebujemy
		// odwo�ywa� si� do poprzednich lub kolejnych element�w
		String[] imiona = new String[] { "Dawid", "Nikola", "Julia", "Patryk", "Dominika" };
		for(String imie : imiona) {
			System.out.println(imie);
		}
		
		// P�tla WHILE
		// Obie p�tle WHILE oraz DO-WHILE zaliczaj� si� do niebezpiecznych - je�eli warunek wyj�cia z p�tli
		// tutaj np. input != "exit" zawsze b�dzie spe�niony (tzn. u�ytkownik nigdy nie wpisze "exit") p�tla
		// b�dzie si� obraca� w niesko�czono�� - ze�re du�o ramu, cpu, a program si� zetnie. Dlatego ostro�nie!
		// Stosujemy j� do wczytywania zasob�w z pliku tekstowego - czytamy tak d�ugo a� warunek hasNextLine()
		// jest spe�niony - jest kolejna linia tekstu, kt�r� nale�y wczyta�
		Scanner sc = new Scanner(System.in);
		String input = "";
		while(input != "exit") {
			System.out.println("Start: "+start+" Koniec: "+koniec);
			System.out.println("Wpisz 'exit' aby wyj��");
			input = sc.nextLine();
		}
		
		// P�tla DO-WHILE
		// Najcz�ciej stosuj� j� do tworzenia menu - wtedy kiedy zanim przejdziemy przez p�tl� trzeba
		// co� zrobi� - wy�wietli� ca�e menu, a potem czeka� na odpowiedz u�ytkownika
		boolean exit = false;
		do {
			System.out.println("Menu:");
			System.out.println("1. Suma");
			System.out.println("2. R�nica");
			System.out.println("3. Iloczyn");
			System.out.println("4. Iloraz");
			System.out.println("5. Wyjdz");
			input = sc.nextLine();
			switch(input) {
				case "1": System.out.println("Suma"); break;
				case "2": System.out.println("R�nica"); break;
				case "3": System.out.println("Iloczyn"); break;
				case "4": System.out.println("Iloraz"); break;
				case "5": exit = true; break;
				default: System.out.println("Nie ma opcji: "+input);
			}
		} while (!exit);
		
	}

	/**
	 * Stw�rz 10-elementow� tablic� typu String, gdzie ka�dy element b�dzie wygl�da� nast�puj�co
	 * "p�tla_nr" i do��czony do tego numer obiegu p�tli np. "p�tla_nr3" 
	 * @return
	 */
	public static String[] zadanie1() {
		return new String[10];
	}
	
	/**
	 * Do ka�dego z wyraz�w z tablicy wyrazy dodaj numer obiegu p�tli np. "ma�y0" i zwr�� w postaci tablicy
	 * @return
	 */
	public static String[] zadanie2() {
		String[] wyrazy = new String[] { 
				"ma�y", "z�b", "zeszyt", "kolano", "twar�g", 
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
	 * Zsumuj ilo�� liczb podzielnych przez 7 oraz podzielnych przez 13 w zakresie od 1 do 150 w��cznie
	 * @return
	 */
	public static int zadanie4() {
		return 0;
	}
	
	/**
	 * Zmodyfikuj p�tle tak, aby wykona�a si� tylko 5 razy
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
