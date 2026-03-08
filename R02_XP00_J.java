import java.io.File;

public class R02_XP00_J {

    public static void main(String[] args) {
        deleteFile();
    }

    // Noncompliant code
    public static void deleteFileBad() {
        File someFile = new File("someFileName.txt");
        someFile.delete();  // ignoring return value
    }

    // Compliant code
    public static void deleteFile() {
        File someFile = new File("someFileName.txt");

        if (!someFile.delete()) {
            System.out.println("Failed to delete file.");
        }
    }
}
