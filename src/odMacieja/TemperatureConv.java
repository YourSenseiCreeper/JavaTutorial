package odMacieja;

/**
 * Klasa zawieraj¹ce metody do konwersji temperatur
 * @author Maciej Piankowski
 */
public class TemperatureConv {
	
	/**
	 * metoda zamiany stopni celsjusza  na stopnie fahrenheita
	 * @param number
	 */
    public static void cNaFahr(double number) {
        double converted;
        converted = (number * 9 / 5) + 32;
        System.out.println(number + " Celsius to " + converted + " Fahrenheit");
    }
   
}
