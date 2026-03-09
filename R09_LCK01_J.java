/*
Rule: LCK01-J
Description: Synchronize shared mutable data
Source: SEI CERT Oracle Coding Standard for Java
*/
public class R09_LCK01_J {

    private final Object lock = new Object();

    public void safeMethod() {

        // Compliant synchronized block
        synchronized (lock) {
            System.out.println("Thread-safe operation.");
        }
    }

    public static void main(String[] args) {
        R09_LCK01_J example = new R09_LCK01_J();
        example.safeMethod();
    }
}
