package pl.gastherr.wyjatki;

class MyParentException extends Exception {
}

class MyChildException extends MyParentException {
}

public class Heritage {
   
//    public static void main(String[] args) {
//        try {
//            throw new MyChildException();
//        } catch (MyParentException s) {
//            System.err.println("Caught MyParentException");
//        } catch (MyChildException a) {   // Tutaj pojawia siê b³¹d kompilacji - MyChildException jest ju¿ wy³apywany w MyParentException
//            System.err.println("Caught MyChildtException");
//        }
//    }
}
