package wyrazenia_reglarne;

import java.util.Arrays;

public class Wyrazenia {
    public static void main(String[] args) {
        String zdanie = "Bardzo lubię uczyć się Javy, ale czasami wolę: JavaScript. Pythona, Scale.";
        String[] words = zdanie.split("[ .,:]+");
        System.out.println(words.length + "|" + Arrays.toString(words));

        String newZdanie = zdanie.replaceAll("a", "@");
        System.out.println(newZdanie);
    }
}
