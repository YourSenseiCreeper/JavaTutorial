package odMacieja;

/**
 * Konwerter d³ugoœci
 * @author Maciej Piankowski
 */
public class LengthConv {
	
	/**
	 * metoda zamiany centymetrów na stopy
	 * @param number
	 */
    public static void CmNaStopy(double number) {
        double converted;
        converted = number;
        // Sprawdzenie czy stopy s¹ potrzebne
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
     * metoda zamiany kilometrów  na mile
     * @param number
     */
    public static void kmNaMile(double number) {
        double converted;
        converted = number * 0.621371;
        System.out.println(number + " km to " + converted + " mile");
    }
    
    /**
     * metoda zamiany metrów na jardy
     * @param number
     */
    public static void mNaJardy(double number) {
        double converted;
        converted = number * 1.09361;
        System.out.println(number + " metery to " + converted + " Jardy");
    }
    
}
