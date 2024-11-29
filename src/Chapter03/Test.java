package Chapter03;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * This is the first app!
 */
public class Test {

    /**
     * This is the Main-Class
     * @param args arguments
     */
    public static void main(String[] args) {

        // print to console
        System.out.println("Arguments: " + String.join("," , args));


        Date current = new Date();
        var sdf = new SimpleDateFormat("dd.MM.yyyy", Locale.getDefault());
        System.out.println("Datum: " + sdf.format(current));
    }
}