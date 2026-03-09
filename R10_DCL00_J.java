public class R10_DCL00_J {

    static int value;

    // Noncompliant
    static {
        value = initialize();
    }

    static int initialize() {
        return 42;
    }

    public static void main(String[] args) {
        System.out.println("Value: " + value);
    }
}
