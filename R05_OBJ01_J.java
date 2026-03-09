/*
Rule: OBJ01-J
Description: Limit exposure of mutable objects
Source: SEI CERT Oracle Coding Standard for Java
*/
import java.util.Date;

public class R05_OBJ01_J {

    private Date date = new Date();

    // Noncompliant
    public Date getDateBad() {
        return date;
    }

    // Compliant
    public Date getDate() {
        return new Date(date.getTime());
    }

    public static void main(String[] args) {
        R05_OBJ01_J obj = new R05_OBJ01_J();
        System.out.println(obj.getDate());
    }
}
