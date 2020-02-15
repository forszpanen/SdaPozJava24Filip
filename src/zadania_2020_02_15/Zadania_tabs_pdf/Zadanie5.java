package zadania_2020_02_15.Zadania_tabs_pdf;

import java.util.Random;
import java.util.Scanner;

public class Zadanie5 {
    public static void main(String[] args) {
        String mojaLicza = "5555";
        int suma = 0;
        for (int i = 0; i<mojaLicza.length();i++){
            char c = mojaLicza.charAt(i);
            suma += Integer.valueOf(String.valueOf(c));
        }
        System.out.println(suma);
    }
}
