import java.util.Scanner;

import pl.piotrwereszczyns.menucreator.MenuCreator;
import pl.piotrwereszczyns.menucreator.MenuElement;

public class Main {

	public static void main(String[] args) {
		program();
	}
	
	public static void program() {
		System.out.println("Program moja wizytówka");

        Scanner sc = new Scanner(System.in);
    	Wizytowka wizytowka = new Wizytowka();

    	MenuCreator.menu(sc, "Opcja spoza mozliwosci!", true, new MenuElement[] { 
    			new MenuElement("MENU: ", null),
    			new MenuElement("dodaj wizytowke", () -> wizytowka.dodaj_wizytowke()),
    			new MenuElement("wyswietl wizytowki", () -> wizytowka.wyswietl_wizytowki()),
    			new MenuElement("analizuj", () -> CryptoAnalyse.analyse(sc))
    	});
    	sc.close();
	}
	
	
}
