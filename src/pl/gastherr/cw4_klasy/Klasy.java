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
	 * Stwórz klasê o nazwie Telefon, która bêdzie posiadaæ pola marka (String), model (String),
	 * rok_produkcji (int) oraz wlasciciel (String) oraz gettery do tych pól 
	 * @return
	 */
	public static Object zadanie1() {
		return new Telefon();
	}
	
	/**
	 * Do klasy Telefon dodaj metodê opis, która bêdzie zwracaæ String w nastêpuj¹cym formacie
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
