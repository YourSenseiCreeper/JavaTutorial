package day_5_01_18;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.stream.Stream;

public class zawody {

	public static void main(String[] args) {
		
		// ZADANIE
		// Wczytaj plik dziennik.txt i przeszukaj - znajdz minimum, maksimum, œredni¹ oraz ile liczb jest w serii rosn¹cej wiêkszej od 3
		// Tzn. 411, 421, 428, 411 (1 liczba w serii)
		// Lub np. 411, 421, 428, 429, 411 (2 liczby w serii)
		// Podaj d³ugoœæ najd³u¿szej serii rosn¹cej
		
		Path p = Paths.get("D:\\Eclipse\\workspace\\Fakultety\\src\\day_5_01_18\\dziennik.txt");
		BufferedReader bf = null;
		try {
			bf = Files.newBufferedReader(p);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ArrayList<Integer> liczby = new ArrayList<>();
		Stream<String> stream = bf.lines();
		String one;
		StringBuilder onne;
		for(Object o : stream.toArray()){
			one = (String) o;
			onne = new StringBuilder();
			for(char c : one.toCharArray()){
				if(c == ' ') break;
				onne.append(c+"");
			}
			liczby.add(Integer.parseInt(onne.toString().replace(" ", "")));
		}
		int l_serii = 0;
		int seria = 1;
		int ostatni = liczby.get(0);
		for(Integer i : liczby){
			//System.out.println(i+" ");
			if(i > ostatni){
				ostatni = i;
				seria++;
			}
			else
			{
				if(seria > 3) l_serii++;
				seria = 1;
				ostatni = i;
			}
		}
		
		System.out.println("Liczba serii dluzszych od 3 dni to: "+l_serii);
	}

}
