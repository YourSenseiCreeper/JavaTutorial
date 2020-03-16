package pl.gastherr;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// Paradygmaty jêzyka Java - wieloparadygmatowy
		// OBIEKTOWE - (Object Oriented Programming OOP)
		// Podstawowe za³o¿enia OOP
		
		// 1. Abstrakcja 
		// Tworzenie obiektów na podstawie klas - instancja klasy - klasa jest wzorem jak piecz¹tka - instancja jest kolorem
		Vehicle boat = new Vehicle("Motorówka", 4);
		Vehicle car = new Vehicle("Volksvagen Passat", 5);
		
		// 2. Hermetyzacja
		// Przejdz do klasy Vehicle - metody getType() oraz getMaxPassangers()
		// Kontrola nad dostêpem do danych
		// Mo¿emy pobieraæ dane, ale (w tym wypadku) nie mo¿emy ich modyfikowaæ
		String boatType = boat.getType();
		
		// 3. Polimorfizm - poli - wiele - morfizm - postaæ = wielopostaciowoœæ
		// Metody o tej samej nazwie, ale ró¿nych argumentach
		System.out.println();
		System.out.println("");
		System.out.println(new byte[1]);
		System.out.println(true);
		System.out.println(Float.MAX_VALUE);
		
		// 4. Dziedziczenie - nie trzeba redefiniowaæ ca³ej funkcjonalnoœci, ale tylko tê, której nie ma obiekt ogólniejszy
		Car alfaRomeo = new Car(4, "Alfa Romeo Gulia GTA", "Antoni Wiliñski");
		System.out.println(alfaRomeo.getType());
		alfaRomeo.getModel();
		
		// IMPERATYWNE
		// Programy imperatywne sk³adaj¹ siê z ci¹gu komend do wykonania przez komputer
		
		// FUNKCYJNE
		// W programowaniu funkcyjnym raz zdefiniowana funkcja zawsze zwraca tê sam¹ wartoœæ dla danych wartoœci argumentów.
		
		// Rzeczy prawdopodobnie problematyczne
		// Sortowanie b¹belkowe
		double[] arr = new double[] { 13.2, 19.6, 11, -5, 22, -15 };
		int n = arr.length;  
		double temp = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 1; j < (n - i); j++) {
				if (arr[j - 1] > arr[j]) {
					// swap elements
					temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp;
				}

			}
		}
		
		// Szukanie minimum i maksimum
		double[] tablicaMinMax = new double[] { -14, -3.14, 22.81, 4, 28.69, 11.9, -5.12 };
		double min = Double.MAX_VALUE; // lub tablicaMinMax[0];
		double max = Double.MIN_NORMAL; // lub tablicaMinMax[0];
		for (int i = 0; i < tablicaMinMax.length; i++) {
			if (tablicaMinMax[i] > max) max = tablicaMinMax[i];
			if (tablicaMinMax[i] < min) min = tablicaMinMax[i];
		}
		
		// Je¿eli zadanie nie wymaga korzystania z elementów wczeœniejszych i tych do przodu
		// warto zastosowaæ for-each
		for(double element : tablicaMinMax) {
			if (element > max) max = element;
			if (element < min) min = element;
		}
		
		
		// Mo¿na tak i tak, ale wg mnie lepiej stosowaæ wersjê pierwsz¹ - jest bardziej rozpowszechniona
		int[] tab1 = new int[1];
		int tab2[] = new int[1];
		
		// Statycznie sortuje tablicê double / int / float itd
		Arrays.sort(tablicaMinMax);
		
		
		// U¿ywanie tablic vs u¿ywanie list
		String[] wyrazy = new String[5];
		wyrazy[0] = "Witajcie";
		wyrazy[1] = "Przybysze";
		
		String[] lepszeWyrazy = new String[] { "Witajcie", "Przybysze" };
		System.out.println(wyrazy.length);
		System.out.print(lepszeWyrazy.length);
		
		// U¿ycie listy - nie trzeba martwiæ siê o indeksy ani o rozmiar :)
		ArrayList<String> najlepszeWyrazy = new ArrayList<>();
		najlepszeWyrazy.addAll(Arrays.asList("Witajcie", "Przybysze"));
		
		
		// Materia³y dodatkowe:
		// Ksi¹¿ka "Czysty Kod" Robert C. Martin (rozdzia³y przede wszystkim 2, potem 5, 10, 12, 14, 16)  
		// Java OOP tutorial na W3Schools: https://www.w3schools.com/java/java_oop.asp
	}

}
