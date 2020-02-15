package zadania_2020_02_15.Zadania_tabs_pdf;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Zadanie1 {
    public static void main(String[] args) {
//        Zadania Tablice i pętle 1.
//        Napisz program symulujący grę w Lotto:
//        a.Użytkownik typuje 6 cyfr
//        b.Program losuje 6 cyfr z liczb od 1 do 49
//        c.Program wypisuje na ekranie wytypowane przez użytkownika cyfry
//        d.Program wypisuje na ekranie wylosowane cyfry
//        e.Program wyświetla wynik użytkownika w poniższej formie:
//        i.Trafiono n z 6 cyfr
//        f.*Upewnij się że użytkownik podaje 6 różnych liczb
//        g.*Upewnij się, że maszyna losująca generuje 6 różnych liczb
//        h.! Skorzystaj z klasy java.util.Random

        Scanner scanner = new Scanner(System.in);


        int[] liczbyOdUzytkownika = new int[6];
        int[] liczbyWylosowane = new int[6];
        int zakresLosowania = 49;

        System.out.println("Podaj kolejno 6 liczb");
        for (int i = 0; i < 6; i++) {
            pobierzUnikalnaLiczbeOdUzytkownika(scanner, liczbyOdUzytkownika, i);
        }

        losujUnikalneLiczby(liczbyWylosowane, zakresLosowania);

        drukujTablice("LiczbyUzytkownika", liczbyOdUzytkownika);
        drukujTablice("LiczbyWylosowane", liczbyWylosowane);

        wypiszIleTrafionoLiczb(liczbyOdUzytkownika, liczbyWylosowane);
    }

    private static void wypiszIleTrafionoLiczb(int[] liczbyOdUzytkownika, int[] liczbyWylosowane){
        int zliczenia = 0;

        for (int i = 0; i < liczbyOdUzytkownika.length; i++) {
            for (int j = 0; j < liczbyWylosowane.length; j++) {
                if (liczbyOdUzytkownika[i] == liczbyWylosowane[j]) {
                    zliczenia++;
                }
            }
        }
        System.out.println("Trafiono " + zliczenia + " z 6 liczb");
    }

    private static void losujUnikalneLiczby(int[] liczbyWylosowane, int zakres) {
        Random r = new Random();
        int wylosowanaLiczba = 0;
        for (int i = 0; i < liczbyWylosowane.length; i++) {
            wylosowanaLiczba = r.nextInt(zakres) + 1;
            while (!czyLiczbaJestUnikalna(liczbyWylosowane, wylosowanaLiczba)) {
                wylosowanaLiczba = r.nextInt(zakres) + 1;
            }
            liczbyWylosowane[i] = wylosowanaLiczba;
        }
    }

    private static void drukujTablice(String tytul, int[] tablica) {
        System.out.println(tytul + " | " + Arrays.toString(tablica) + "\n");
    }

    public static void pobierzUnikalnaLiczbeOdUzytkownika(Scanner scanner, int[] dowolnaTablica, int index) {
        int liczbaOdUZytkownika = scanner.nextInt();
        while (!czyLiczbaJestUnikalna(dowolnaTablica, liczbaOdUZytkownika)) {
            liczbaOdUZytkownika = scanner.nextInt();
        }
        dowolnaTablica[index] = liczbaOdUZytkownika;
    }

    public static boolean czyLiczbaJestUnikalna(int[] dowolnaTablica, int liczbaDoSprzawdzenia) {
        for (int i = 0; i < dowolnaTablica.length; i++) {
            if (dowolnaTablica[i] == liczbaDoSprzawdzenia) {
                System.out.println("Liczba nie jest unikalna!");
                return false;
            }
        }
        return true;
    }
}