package pl.gastherr.cw0_runner;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

import pl.gastherr.cw2_typy_danych.TypyDanych;
import pl.gastherr.cw3_pêtle.Petle;
import pl.gastherr.cw4_klasy.Klasy;

public class Main {

	private static HashMap<Integer, IRunner> exercises;
	
	public static void main(String[] args) {
		load();
		menu();
	}
	
	private static void load() {
		int nextIndex = 0;
		
		class Exit implements IRunner {
			@Override
			public void run() { System.exit(0); }
			
			@Override
			public String getDescription() { return "Wyjœcie"; }	
		}
		
		exercises = new HashMap<Integer, IRunner>();
		exercises.put(nextIndex++, new TypyDanych());
		exercises.put(nextIndex++, new Petle());
		exercises.put(nextIndex++, new Klasy());
		exercises.put(nextIndex++, new Exit());
	}
	
	public static void menu() {
		boolean exit = false;
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("Menu:");
			
			for(Entry<Integer, IRunner> element : exercises.entrySet()) {
				System.out.printf("%d. %s\n", element.getKey(), element.getValue().getDescription());
			}
			
			String option = sc.nextLine();
			int optionInt = 0;
			try {
				optionInt = Integer.parseInt(option);
				if (!exercises.containsKey(optionInt)) {
					System.out.println("Nie ma opcji: " + option);
					continue;
				}
				exercises.get(optionInt).run();
			} catch (NumberFormatException e) {
				System.out.println("Nie ma opcji: " + option);
			}
		} while(!exit);
		sc.close();
	}

}
