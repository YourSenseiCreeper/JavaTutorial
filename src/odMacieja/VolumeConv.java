package odMacieja;

public class VolumeConv {
	/**
	 * metoda zamiany litr�w  na galony
	 * @param number
	 */
	public static void LitryNaGalony(double number) {
        double converted;
        converted = number * 0.264172;
        System.out.println(number + " l to " + converted + " gallony");
    }
	
}
