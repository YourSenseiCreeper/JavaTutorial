package pl.gastherr.projekt;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class PomocDawidowi {
	
	private static BazaPytan bazaPytan;
	private static Scanner sc;
	
	public static void main(String[] args) {
		menu();
	}
	
	public static void menu() {
		bazaPytan = new BazaPytan();
		
		boolean exit = false;
		sc = new Scanner(System.in);
		String input;
		
		// Tutaj mo¿esz potem daæ ³adowanie pytañ z pliku :)
		zaladujPytania();
		
		String[] menuOptions = new String[] {
				"Menu:",
				"1. Dodaj pytanie",
				"2. Usuñ pytanie",
				"3. Poka¿ pytanie",
				"4. Poka¿ wszystkie pytania",
				"5. Wyjdz"
		};
		
		do {
			for (String element : menuOptions) System.out.println(element);
			input = sc.nextLine();
			switch(input) {
				case "1": dodajPytanie(); break;
				case "2": usunPytanie(); break;
				case "3": pokazPytanie(); break;
				case "4": pokazWszystkiePytania(); break;
				case "5": exit = true; break;
				default:
					System.out.println("Nie ma opcji: " + input + "!");
			}
		} while (!exit);
	}
	
	private static void zaladujPytania() {
		Pytanie p1 = new Pytanie("Testowe pytanie", "Jakaœ odp A", "Jakaœ odp B", "Jakaœ odp C", "Jakaœ odp D", 3);
		Pytanie p2 = new Pytanie("Jak na imiê ma dziekan?", "Robert", "Grzegorz", "Micha³", "Rados³aw", 0);
		Pytanie p3 = new Pytanie("Ile dni trwa obieg Ziemi wokó³ S³oñca", "356 dni", "365 dni", "366 dni", "Pomiêdzy 366 a 367 dni", 3);
		bazaPytan.dodajPytanie(p1);
		bazaPytan.dodajPytanie(p2);
		bazaPytan.dodajPytanie(p3);
	}
	
	public static void dodajPytanie() {
		System.out.println("Podaj treœæ pytania: ");
		String description = sc.nextLine();
		
		System.out.println("Odpowiedz A: ");
		String answerA = sc.nextLine();
		
		System.out.println("Odpowiedz B: ");
		String answerB = sc.nextLine();
		
		System.out.println("Odpowiedz C: ");
		String answerC = sc.nextLine();
		
		System.out.println("Odpowiedz D: ");
		String answerD = sc.nextLine();
		
		System.out.println("Poprawna odpowiedz (0-3): ");
		int correctAnswer = Integer.parseInt(sc.nextLine());
		
		bazaPytan.dodajPytanie(new Pytanie(description, answerA, answerB, answerC, answerD, correctAnswer));
	}
	
	public static void usunPytanie() {
		// to ju¿ zostawiam dla Ciebie
	}
	
	public static void pokazPytanie() {
		System.out.println("Podaj indeks pytania które chcesz wyœwietliæ: ");
		int index = Integer.parseInt(sc.nextLine());
		if (!bazaPytan.pokazWszystkiePytania().containsKey(index)) {
			System.out.println("Nie ma pytania nr "+index);
			return;
		}
		
		bazaPytan.pokazPytanie(index).present();
	}
	
	public static void pokazWszystkiePytania() {
		System.out.println("Wszystkie pytania: ");
		for(Entry<Integer, Pytanie> element : bazaPytan.pokazWszystkiePytania().entrySet()) {
			System.out.println(element.getKey() + ". "+element.getValue().toString());
		}
	}
}

class BazaPytan {
	private HashMap<Integer, Pytanie> pytania;
	private static int nextIndex = 0;
	
	public BazaPytan() {
		pytania = new HashMap<Integer, Pytanie>();
	}
	
	public void dodajPytanie(Pytanie pytanie) {
		pytania.put(nextIndex++, pytanie);
	}
	
	// Je¿eli pytanie istnieje - usuñ i zwróæ prawdê - je¿eli nie - zwróæ fa³sz
	public boolean usunPytanie(int index) {
		if (pytania.containsKey(index)) {
			pytania.remove(index);
			return true;
		} else return false;
	}
	
	public Pytanie pokazPytanie(int index) {
		return pytania.get(index);
	}
	
	public HashMap<Integer, Pytanie> pokazWszystkiePytania(){
		return pytania;
	}
}

class Pytanie {
	// index pytania liczony od 0
	private int correctAnswer;
	
	private String description;
	private String answerA;
	private String answerB;
	private String answerC;
	private String answerD;
	
	public Pytanie() {}
	
	public Pytanie(String description, String answerA, String answerB, 
			String answerC, String answerD, int correctAnswer) {
		this.description = description;
		this.answerA = answerA;
		this.answerB = answerB;
		this.answerC = answerC;
		this.answerD = answerD;
		this.correctAnswer = correctAnswer;
	}

	public int getCorrectAnswer() { return correctAnswer; }
	public String getDescription() { return description; }
	public String getAnswerA() { return answerA; }
	public String getAnswerB() { return answerB; }
	public String getAnswerC() { return answerC; }
	public String getAnswerD() { return answerD; }
	
	@Override
	public String toString() {
		return String.format("[%s, A: %s, B: %s, C: %s, D: %s, Poprawna: %d]", 
				description, answerA, answerB, answerC, answerD, correctAnswer);
		
	}
	
	public void present() {
		System.out.println("Opis: " + description);
		System.out.println("Odpowiedz A: " + answerA);
		System.out.println("Odpowiedz B: " + answerB);
		System.out.println("Odpowiedz C: " + answerC);
		System.out.println("Odpowiedz D: " + answerD);
		System.out.println("Poprawna odpowiedz: " + correctAnswer);
	}
	
}
