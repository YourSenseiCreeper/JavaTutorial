package pl.gastherr.wyjatki;

import javax.swing.*;

// èrÛd≥o
// https://personales.unican.es/corcuerp/java/Labs/LAB_15.htm
// Po co potrzebne sπ wyjπtki?
//	W podejúciu Model-View-Controller pozwalajπ na separacjÍ dzia≥ania od prezentacji!
// 	Jak wyobraøasz sobie, øeby twÛrcy javy mieli przewidzieÊ w jaki sposÛb stworzyÊ swÛj program i tak dostosowali wyjπtki akurat do niego?
// 	Impossible!

// StwÛrz NegativeValueEnteredException

//Stworzony przez nas wyjπtek
class InvalidHexException extends RuntimeException {
}

public class HexToDec {

 // Metoda rzuca stworzonym przez nas wyjπtkiem InvaildHexException - po to aby z poziomu okienka obs≥uøyc ten wyjπtek w odpowiedni sposÛb
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
    
     // Pobieramy wartoúÊ w HEX od uøytkownika
     hex = JOptionPane.showInputDialog(null, "Input hex: ");
     try {
        
         // convertToInt() wyrzuci Exception jeøeli wartoúÊ nie jest w poprawnym formacie
         intEq = convertToInt(hex);
        
         Integer dec = new Integer(convertToDec(intEq));
        
         // Wyúwietl wynik
         JOptionPane.showMessageDialog(null, dec);
         System.exit(0);
     } catch (InvalidHexException e) {
         // Pozwala nam zareagowaÊ na sytuacjÍ przez wybrany przez nas sposÛb. Moøemy to teø zignrowaÊ. Ale tak nie powinniúmy robiÊ :/
    	 JOptionPane.showMessageDialog(null, "InvalidHexException is caught: Enter valid hex value");
     }
     System.exit(0);
 }
}