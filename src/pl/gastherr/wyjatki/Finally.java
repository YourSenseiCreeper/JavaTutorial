package pl.gastherr.wyjatki;

class MyException extends Exception {
}

public class Finally {
   
    static int count = 0;
   
    // Czy obie te metody powoduj¹ ten sam wydruk na konsolê?
    public static void main(String[] args) {
        tryCatchFinally();
        //tryCatchBezFinally();
    }
    
    // Finally to klauzula jest wykonywana zawsze po przejœciu przez blok try-catch 
    public static void tryCatchFinally() {
    	while (true) {
            try {
                // Post-increment is zero first time:
                if (count++ == 0)
                    throw new MyException();
                System.out.println("No exception");
            } catch (MyException e) {
                System.out.println("MyException");
            } finally {
            	System.out.println("In finally clause");
                if (count == 2)
                    break; // out of "while"
            }
        }
    }
    
    public static void tryCatchBezFinally() {
    	while (true) {
            try {
                // Post-increment is zero first time:
                if (count++ == 0)
                    throw new MyException();
                System.out.println("No exception");
            } catch (MyException e) {
                System.out.println("MyException");
            }
            
            System.out.println("In finally clause");
            if (count == 2)
                break; // out of "while"
        }
    }
}
