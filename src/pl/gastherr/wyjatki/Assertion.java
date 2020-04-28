package pl.gastherr.wyjatki;

import javax.swing.*;

public class Assertion {
   
    static void printDiamond(int size) {
        String diamond = "";
        /* print upper triangle */
        for (int r = 1, a = 1; r <= size; r++, a+=2) {
            /* print spaces */
            for (int i = size - r; i >= 1; i--) {
                diamond += " ";
            }
            /* print *'s */
            for (int j = 1; j <= a; j++) {
                diamond += "*";
            }
            diamond += "\n";
        }
        /* print lower triangle */
        for (int r = size - 1, a = 2*(size-1)-1; r >= 1; r--, a-=2) {
            /* print spaces */
            for (int i = size - r; i >= 1; i--) {
                diamond += " ";
            }
            /* print *'s */
            for (int j = 1; j <= a; j++) {
                diamond += "*";
            }
            diamond += "\n";
        }
        JOptionPane.showMessageDialog(null, diamond);
        System.out.println(diamond);
    }
   
    public static void main(String args[]) {
        String strSize;
        // Pobierz rozmiar diamentu kt�ry chcemy narysowa�
        strSize = JOptionPane.showInputDialog(null, "Enter diamond size:");
        int size = Integer.parseInt(strSize);
       
        strSize = JOptionPane.showInputDialog(null, "Enter diamond size:");
        int rozmiarButa = Integer.parseInt(strSize);
        // Sprawdz czy rozmiar jest wi�kszy od 0. W przeciwnym razie wygeneruje si� wyj�tek asercji AssertionError
        try {
            assert(size > 0);	// ten wy�apujemy
            printDiamond(size);
        } catch (AssertionError e) {
            JOptionPane.showMessageDialog(null, "AssertionError is captured: Size should be > 0.");
        }
        assert(rozmiarButa > 0); // ten spowoduje zatrzymanie programu, nie wy�apany
        // aby w�aczy� asercj� musimy dopisa� -ea do parametr�w kompilacji.
        System.exit(0);
    }
}
