package odMacieja;

public class WeightConv {

	/**
	 * metoda zamiany Kilogram�w na funty
	 * @param number
	 */
	public static void kgNaFunty(double number) {
        double converted;
        converted = number * 2.4419;
        System.out.println(number + " kg to " + converted + " funty");
    }
	
	/**
	 * metoda zamiany Kilogram�w na funty
	 * @param number
	 */
	public static void funtyNaKg(double number) {
        double converted;
        converted = number / 2.4419;
        System.out.println(number + " funt�w to " + converted + " kg");
    }
}
