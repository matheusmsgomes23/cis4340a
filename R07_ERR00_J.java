/*
Rule: ERR00-J
Description: Do not suppress exceptions
Source: SEI CERT Oracle Coding Standard for Java
*/
public class R07_ERR00_J {

    public static void main(String[] args) {

        try {
            int x = 10 / 0;
        }

        // Noncompliant: exception ignored
        catch (Exception e) {
        }

        // Compliant: handle the error
        catch (ArithmeticException e) {
            System.out.println("Error occurred: " + e.getMessage());
        }
    }
}
