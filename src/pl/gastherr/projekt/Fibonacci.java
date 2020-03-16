package pl.gastherr.projekt;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author YourSenseiCreeper
 */
public class Fibonacci {

	/**
	 * 
	 * @param length
	 */
	public static void fibonacci(int length) {
		if (length <= 2) {
			System.out.println("Minimum 2 elementy!");
			return;
		}
		int[] values = new int[length];
		values[0] = 1;
		values[1] = 1;
		for(int i = 2; i < (length); i++) {
			values[i] = values[i-1] + values[i-2];
		}
		for(int element : values) {
			System.out.println(element);
		}
	}
	
	public static void fibonacciList(int length) {
		if (length <= 2) {
			System.out.println("Minimum 2 elementy!");
			return;
		}
		ArrayList<Integer> values = new ArrayList<>();
		values.addAll(Arrays.asList(1, 1));
		for(int i = 2; i < length; i++) {
			values.add(values.get(i - 1) + values.get(i - 2));
		}
		
		for(int element : values) {
			System.out.println(element);
		}
	}
	/**
	 * Test komentarz
	 * @param input
	 * @return dane wejœciowe bez spacji z przodu i z ty³u
	 */
	public static String testString(String input) {
		return input.trim();
	}
}
