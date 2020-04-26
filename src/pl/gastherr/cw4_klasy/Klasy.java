package pl.gastherr.cw4_klasy;

import pl.gastherr.cw0_runner.IRunner;

public class Klasy implements IRunner {

	@Override
	public String getDescription() { return "Klasy"; }
	
	@Override
	public void run() {
		// Skrypt o tworzeniu klas
		
	}

	/**
	 * Stw�rz klas� o nazwie Telefon, kt�ra b�dzie posiada� pola marka (String), model (String),
	 * rok_produkcji (int) oraz wlasciciel (String) oraz gettery do tych p�l 
	 * @return
	 */
	public static Object zadanie1() {
		return new Telefon();
	}
	
	/**
	 * Do klasy Telefon dodaj metod� opis, kt�ra b�dzie zwraca� String w nast�puj�cym formacie
	 * "Telefon: [marka,model,rok_produkcji,wlasciciel]"
	 * @return
	 */
	public static Object zadanie2() {
		return null;
	}

}

class Telefon {
	private String marka;
	private String model;
	private int rok_produkcji;
	private String wlasciciel;
	
	public Telefon() {}
	
	public String getMarka() { return marka; }
	public String getModel() { return model; }
	public int getRokProdukcji() { return rok_produkcji; }
	public String getWlasciciel() { return wlasciciel; }
}
