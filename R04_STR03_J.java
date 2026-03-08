import java.math.BigInteger;

public class R04_STR03_J {

    public static void main(String[] args) {

        // Noncompliant
        BigInteger x = new BigInteger("530500452766");
        byte[] byteArray = x.toByteArray();
        String s = new String(byteArray);
        byteArray = s.getBytes();
        x = new BigInteger(byteArray);

        // Compliant
        BigInteger y = new BigInteger("530500452766");
        String goodString = y.toString();
        byte[] goodBytes = goodString.getBytes();
        String newString = new String(goodBytes);
        y = new BigInteger(newString);

        System.out.println("Secure conversion example complete.");
    }
}
