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
