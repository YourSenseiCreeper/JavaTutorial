import java.util.Scanner;

import pl.piotrwereszczyns.menucreator.MenuCreator;
import pl.piotrwereszczyns.menucreator.MenuElement;
import pl.wereszczyns.cw3wizytowka.CryptoAnalyse;
import pl.wereszczyns.cw3wizytowka.Wizytowka;

public class Main {

	public static void main(String[] args) {
		program();
	}
	
	public static void program() {
		System.out.println("Program moja wizytówka");

        Scanner sc = new Scanner(System.in);
    	Wizytowka wizytowka = new Wizytowka();

    	/**
    	 * Metoda pozwalajaca na uporzadkowanie menu i tworzenie ich w prosty sposob
    	 * @param sc - potrzebny wyboru opcji w menu
    	 * @param wrongOption - tekst ktory wyswietli sie uzytkownikowi kiedy wybierze opcje spoza zakresu
    	 * @param escapeProgramme - czy program ma sie zakonczyc po wybraniu ostatniej opcji, jezeli nie - program poza metoda menu() bedzie dalej wykonywany
    	 * @param inputMenuElements - tablica elementow menu - opis jak tworzyc elementy znajdziesz po najechaniu na klase MenuElement
    	 */
    	MenuCreator.menu(sc, "Opcja spoza mozliwosci!", true, new MenuElement[] { 
    			new MenuElement("MENU: ", null),
    			new MenuElement("dodaj wizytowke", () -> wizytowka.dodaj_wizytowke()),
    			new MenuElement("wyswietl wizytowki", () -> wizytowka.wyswietl_wizytowki()),
    			new MenuElement("analizuj", () -> CryptoAnalyse.analyse(sc))
    	});
    	sc.close();
	}
	
	/**
	 * MenuElement - Element menu posiadajacy pola <b>description</b> oraz <b>function</b>. <br>
	 * Opcja wyjscia automatycznie dodaje sie do istniejacych elementow menu <br>
	 * Przykladowa implementacja <br>
	 * <pre>
	 * Obiekt1 obiekt = new Obiekt1();
	 * menu(sc, "Opcja spoza mozliwosci!", true, new MenuElement[] { 
	 * 	new MenuElement("MENU: ", null),
	 * 	new MenuElement("Opcja1", () -> obiekt.metoda()),
	 * 	new MenuElement("Opcja2", () -> KlasaStatyczna.metodaStatyczna(sc))
	 * });
	 * </pre>
	 * 
	 * @author Piotr Wereszczynski
	 * @version 1.0
	 * @since 2020-04-26
	 */
	
}
