package pl.gastherr.cw1_paradygmaty;

import pl.gastherr.cw0_runner.IRunner;

public class Paradygmaty implements IRunner {

	@Override
	public void run() {
		pytanie1();
	}

	@Override
	public String getDescription() { return "Paradygmaty"; }

	public static String pytanie1() {
		// Jak nazywa si� paradygmat odpowiadaj�cy za Klasy?
		return "Obiektowo��";
	}
}
