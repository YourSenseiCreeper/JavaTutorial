package pl.gastherr.wyjatki;

import javax.swing.*;

// �r�d�o
// https://personales.unican.es/corcuerp/java/Labs/LAB_15.htm
// Po co potrzebne s� wyj�tki?
//	W podej�ciu Model-View-Controller pozwalaj� na separacj� dzia�ania od prezentacji!
// 	Jak wyobra�asz sobie, �eby tw�rcy javy mieli przewidzie� w jaki spos�b stworzy� sw�j program i tak dostosowali wyj�tki akurat do niego?
// 	Impossible!

// Stw�rz NegativeValueEnteredException

//Stworzony przez nas wyj�tek
class InvalidHexException extends RuntimeException {
}

public class HexToDec {

 // Metoda rzuca stworzonym przez nas wyj�tkiem InvaildHexException - po to aby z poziomu okienka obs�u�yc ten wyj�tek w odpowiedni spos�b
 static int [] convertToInt(String hex) throws InvalidHexException {
     char currChar;
     int intEq[] = new int[hex.length()];
     for (int i = 0; i < hex.length(); i++) {
         currChar = hex.charAt(i);
         if (currChar >= '0' && currChar <='9') {
             intEq[i] = currChar - '0';
         } else if (currChar >= 'a' && currChar <='f') {
             intEq[i] = currChar - 'a' + 10;
         } else if (currChar >= 'A' && currChar <='F' ) {
             intEq[i] = currChar - 'A' + 10;
         } else {
             throw new InvalidHexException();
         }
     }
     return intEq;
 }

 static int convertToDec(int intEq[]) {
     int result = 0;
     int mult = 1;    //multiplier
     for (int j = intEq.length - 1; j >= 0; j--) {
         result += intEq[j]*mult;
         mult *= 16;
     }
     return result;
 }

 public static void main(String args[]) {
     String hex;
     int intEq[];
    
     // Pobieramy warto�� w HEX od u�ytkownika
     hex = JOptionPane.showInputDialog(null, "Input hex: ");
     try {
        
         // convertToInt() wyrzuci Exception je�eli warto�� nie jest w poprawnym formacie
         intEq = convertToInt(hex);
        
         Integer dec = new Integer(convertToDec(intEq));
        
         // Wy�wietl wynik
         JOptionPane.showMessageDialog(null, dec);
         System.exit(0);
     } catch (InvalidHexException e) {
         // Pozwala nam zareagowa� na sytuacj� przez wybrany przez nas spos�b. Mo�emy to te� zignrowa�. Ale tak nie powinni�my robi� :/
    	 JOptionPane.showMessageDialog(null, "InvalidHexException is caught: Enter valid hex value");
     }
     System.exit(0);
 }
}