/*
Rule: FIO02-J
Description: Detect and handle file errors
Source: SEI CERT Oracle Coding Standard for Java
*/
import java.io.File;

public class R08_FIO02_J {

    public static void main(String[] args) {

        File file = new File("test.txt");

        // Noncompliant
        file.delete();

        // Compliant
        if (!file.delete()) {
            System.out.println("File deletion failed.");
        }
    }
}
