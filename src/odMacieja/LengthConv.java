package odMacieja;

/**
 * Konwerter d�ugo�ci
 * @author Maciej Piankowski
 */
public class LengthConv {
	
	/**
	 * metoda zamiany centymetr�w na stopy
	 * @param number
	 */
    public static void CmNaStopy(double number) {
        double converted;
        converted = number;
        // Sprawdzenie czy stopy s� potrzebne
        if (converted >= 30.48){
            Double convertedFoot = converted / 30.48;
            System.out.println(number + " cm to " + convertedFoot + " stopy");
        }
        else {
            double convertedInch = converted % 30.48;
            double convertedInches = convertedInch / 2.54;
            System.out.println(number + " cm to" + convertedInches + " cale");
        }
    }
    /**
     * metoda zamiany kilometr�w  na mile
     * @param number
     */
    public static void kmNaMile(double number) {
        double converted;
        converted = number * 0.621371;
        System.out.println(number + " km to " + converted + " mile");
    }
    
    /**
     * metoda zamiany metr�w na jardy
     * @param number
     */
    public static void mNaJardy(double number) {
        double converted;
        converted = number * 1.09361;
        System.out.println(number + " metery to " + converted + " Jardy");
    }
    
}
