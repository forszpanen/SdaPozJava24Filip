package zadania_2020_02_15.program2012pdf;

import java.util.Scanner;

public class Firma {
    public static void main(String[] args) {

        Menu menu = new Menu();
        ListaPracownikow listaPracownikow = new ListaPracownikow();
        String akcja = "";
        // wyjscie z pentli po nacicsnieciu e
        while (!akcja.equals("e") && !akcja.equals("q")) {
            menu.pokazGlowneMenu();
            akcja = menu.pobierzWybranaAkcjePrzezUzytkowika();

            switch (akcja) {
                case "1":
                    listaPracownikow.pokazWszystkichPracownikow();
                    break;
                case "2":
                    listaPracownikow.dodajNowegoPracownika();
                    break;
                case "q":
                case "e":
                    System.out.println("KONIEC");
                    break;
                default:
                    System.out.println("Podano nieprawidłową akcję!!!");
            }

        }

    }


}
