/*
Rule: IDS03-J
Description: Do not log unsanitized user input
Source: SEI CERT Oracle Coding Standard for Java
*/

import java.util.logging.Logger;
import java.util.regex.Pattern;

public class R00_IDS03_J {

    static Logger logger = Logger.getLogger(R00_IDS03_J.class.getName());

    public static void main(String[] args) {

        String username = "user<script>";
        boolean loginSuccessful = false;

        // Noncompliant code
        if (loginSuccessful) {
            logger.severe("User login succeeded for: " + username);
        } else {
            logger.severe("User login failed for: " + username);
        }

        // Compliant code
        if (loginSuccessful) {
            logger.severe("User login succeeded for: " + sanitizeUser(username));
        } else {
            logger.severe("User login failed for: " + sanitizeUser(username));
        }
    }

    public static String sanitizeUser(String username) {
        return Pattern.matches("[A-Za-z0-9]+", username)
                ? username
                : "unauthorized user";
    }
}
