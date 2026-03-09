/*
Rule: EXP00-J
Description: Do not ignore values returned by methods
Source: SEI CERT Oracle Coding Standard for Java
*/
import java.io.DataInputStream;
import java.io.IOException;

public class R03_NUM03_J {

    public static void main(String[] args) {
        System.out.println("Example of proper integer handling.");
    }

    // Noncompliant
    public static int getIntegerBad(DataInputStream is) throws IOException {
        return is.readInt();
    }

    // Compliant
    public static long getIntegerGood(DataInputStream is) throws IOException {
        return is.readInt() & 0xFFFFFFFFL;
    }
}
