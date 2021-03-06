package zadanie_firma;

import java.util.Scanner;

public class Menu {
    /* pokazuje wszystkie dostepne akcje dla uzytkownika */
    public void pokazGlowneMenu(){
        System.out.println("Witamy w aplikacji Lista pracowników. Wybierz z menu co chciałbyś robić:");
        System.out.println("1 - Wypisywanie listy wszystkich pracowników (okrojone)");
        System.out.println("2 - Dodaj nowego pracownika");
        System.out.println("3 - Eksport danych");
        System.out.println("4 - Usuwanie pracowników");
        System.out.println("5 - Edycja danych");
        System.out.println("6 - Dodatkowe opcje");
        System.out.println("99 - Generowanie pracowników");
        System.out.println("e albo q - Zakończenie aplikacji");
    }

    public void subMenu6(){
        System.out.println("Wybierz akcje z submenu");
        System.out.println("a - Obliczanie liczby pracowników z pensją nie mniejszą niż podana");
    }

    // do obslugi menu
    public String pobierzAkcjeOdUzytkownika(){
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        return line.toLowerCase();
    }

}
