package odMacieja;

import java.util.Scanner;

/**
 * Java app - Konwenter jednostek
 * @author Maciej Piankowski
 * @since 2020
 */
public class Konwerter {

    /**
     * Menu konwertera
     */
    public static void menu() {
    	System.out.println("Witam w Konwerterze, prosze wpisz liczbê jak¹ chcesz zamieniæ");

        Scanner sc = new Scanner(System.in);
        double convertedValue = sc.nextDouble();
        System.out.println("Number to convert is :" + convertedValue);
        
    	String[] menu = new String[] {
    			"Wybierz numer od 1 do 7.",
    			"MENU",
    			"1: kg na funty",
    			"2: funty na kg",
    			"3: litry na galony",
    			"4: cm na stopy",
    			"5: metry na jardy",
    			"6: kilometry na mile",
    			"7: Celciusz na Fahrenheit",
    			"8: Exit"
    	};
    	
    	boolean exit = false;
    	int option;
    	do {
    		for(String element : menu) {
        		System.out.println(element);
        	}
    		option = sc.nextInt();
            switch (option) {
                case 1: 
                	WeightConv.kgNaFunty(convertedValue);
                	break;
                case 2: 
                	WeightConv.funtyNaKg(convertedValue);
                	break;
                case 3:
                    VolumeConv.LitryNaGalony(convertedValue);
                    break;
                case 4:
                    LengthConv.CmNaStopy(convertedValue);
                    break;
                case 5:
                	LengthConv.mNaJardy(convertedValue);
                    break;
                case 6: 
                	LengthConv.kmNaMile(convertedValue);
                    break;
                case 7:
                    TemperatureConv.cNaFahr(convertedValue);
                    break;
                case 8:
                    System.out.println("Do zobaczenia!");
                    exit = true;
                    break;
                default:
                    System.out.println("Z³y numer :( !");
                    break;
            }
    	} while(!exit);
    }
    
}



