package zadania_2020_02_15.program2012pdf;

import java.util.Scanner;

public class Menu {

    public void pokazGlowneMenu(){
        System.out.println("Witamy w aplikacji Lista pracowników. Wybierz z menu co chciałbyś robić:");
        System.out.println("1 - Wypisywanie listy wszystkich pracowników (okrojone)");
        System.out.println("2 - Dodaj nowego pracownika");
        System.out.println("3 - Eksport danych");
        System.out.println("4 - Usuwanie pracowników");
        System.out.println("5 - Edycja danych");
        System.out.println("e albo q - Zakończenie aplikacji");
    }

    public String pobierzWybranaAkcjePrzezUzytkowika(){
        Scanner scanner = new Scanner(System.in);
        String akcja = scanner.nextLine();
//        scanner.close();
        return akcja.toLowerCase();
    }



}
