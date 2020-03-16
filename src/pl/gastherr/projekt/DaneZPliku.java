package pl.gastherr.projekt;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;

import pl.gastherr.Car;

public class DaneZPliku {

	public static void sumowanie() {
		ArrayList<String> lines = pobierzDane();
		int result = 0;
		for(String element : lines) {
			result += Integer.parseInt(element);
		}
		System.out.println("Wynik to: "+result);
	}
	
	public static void sortowanie() {
		ArrayList<String> lines = pobierzDane();
		int[] integerTable = new int[lines.size()];
		for(int i = 0; i<lines.size(); i++) {
			integerTable[i] = Integer.parseInt(lines.get(i));
		}
		Arrays.sort(integerTable);
		for(int element : integerTable) {
			System.out.println(element);
		}
	}
	
	public static void niewyplapywalneWyjatki() {
		ArrayList<Car> cars = new ArrayList<Car>();
		cars.add(new Car(4, "Volksvagen Golf IV", "Patryk Madej"));
		cars.add(new Car(4, "Laborghini Galliardo", "Piotr Wereszczyñski"));
		cars.add(null);
		
		for(Car element : cars) {
			try {
				System.out.println(element.getModel());
			} catch(NullPointerException e) {
				System.out.println("Obiekt jest nullem!");
			}
		}
		System.out.println("Koniec danych!");
	}
	
	public static void elementPozaRozmiarem() {
		ArrayList<Car> cars = new ArrayList<Car>();
		cars.add(new Car(4, "Volksvagen Golf IV", "Patryk Madej"));
		cars.add(new Car(4, "Laborghini Galliardo", "Piotr Wereszczyñski"));
		cars.add(null);
		
		try {
			System.out.println(cars.get(10).getModel());
		} catch(Exception e) {
			System.out.println("Nie ma elementu 10!");
		}
		System.out.println("Koniec danych!");
	}
	
	public static ArrayList<String> pobierzDane() {
		String path = "C:\\Users\\PIOTR\\eclipse-workspace\\JavaTutorial\\src\\liczby.txt";
		ArrayList<String> lines = new ArrayList<>();
		try {
			lines = (ArrayList<String>) Files.readAllLines(Paths.get(path));
		} catch(IOException e) {
			System.out.println(e);
		}
		return lines;
	}
}
