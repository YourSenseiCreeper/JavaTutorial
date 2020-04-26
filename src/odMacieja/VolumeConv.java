package odMacieja;

public class VolumeConv {
	/**
	 * metoda zamiany litrów  na galony
	 * @param number
	 */
	public static void LitryNaGalony(double number) {
        double converted;
        converted = number * 0.264172;
        System.out.println(number + " l to " + converted + " gallony");
    }
	
}
