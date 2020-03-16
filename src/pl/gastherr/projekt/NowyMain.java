package pl.gastherr.projekt;

import java.util.Scanner;

public class NowyMain {

	public static void main(String[] args) {
		//fibonacci();
		DaneZPliku.menu();
	}
	
	public static void fibonacci() {
		boolean isOk = false;
		int tries = 3;
		Scanner sc = new Scanner(System.in);
		int length = 0;
		do {
			System.out.println("Wpisz liczb� wi�ksz� od 2: ");
			try {
				length = Integer.parseInt(sc.nextLine());
				isOk = true;
				Fibonacci.fibonacciList(length);
				Fibonacci.testString("xd");
			} catch(NumberFormatException e) {
				tries--;
				if (tries < 1) { return; }
				System.out.println("Nie wpisa�e� liczby! (Zosta�o Ci " + tries + " pr�b)");
			}
		} while(!isOk);
		sc.close();
	}
}