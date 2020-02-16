package zadanie_firma;

import java.util.Scanner;

public class ListaPracownikow {
    private Pracownik[] listaPracownikow = new Pracownik[100];
    private int licznikPracownikow = 0;


    public ListaPracownikow() {
        Pracownik pracownik1 = new Pracownik("Filip", "Forszpaniak", 'M',
                1, 200, 31, 0, true);
        listaPracownikow[licznikPracownikow++] = pracownik1;

        Pracownik pracownik2 = new Pracownik("Janusz", "Nowak", 'M',
                1, 100, 56, 2, true);
        listaPracownikow[licznikPracownikow++] = pracownik2;
    }

    public void dodajNowegoPracownika() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Imię: ");
        String imie = scanner.nextLine();

        System.out.print("Nazwisko: ");
        String nazwisko = scanner.nextLine();

        System.out.print("Płeć: ");
        char plec = scanner.nextLine().charAt(0);

        System.out.print("Numer działu: ");
        int numerDzialu = Integer.parseInt(scanner.nextLine());

        System.out.print("Płaca: ");
        float placa = Float.parseFloat(scanner.nextLine());

        System.out.print("Wiek: ");
        int wiek = Integer.parseInt(scanner.nextLine());

        System.out.print("Dzieci: ");
        int dzieci = Integer.parseInt(scanner.nextLine());

        System.out.print("Stan cywilny: ");
        boolean aa = Boolean.parseBoolean(scanner.nextLine());

        Pracownik nowyPracownik = new Pracownik(imie, nazwisko, plec, numerDzialu, placa,
                wiek, dzieci, aa);
        listaPracownikow[licznikPracownikow++] = nowyPracownik;
    }

    public void usunPracownika() {
        int ileMamyPracownikow = ileMamyPracownikow();
        if (ileMamyPracownikow > 0) {
            int index = pobierzIndexPracownika();
            listaPracownikow[index] = null;

            System.out.println("Usunięto pracownika");
        } else {
            System.out.println("Masz pustą listę pracowników");
        }
    }

    private int ileMamyPracownikow() {
        int suma = 0;
        for (int i = 0; i < listaPracownikow.length; i++) {
            if (listaPracownikow[i] != null) {
                suma++;
            }
        }
        return suma;
    }

    private int pobierzIndexPracownika() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj index pracownika do usunięcia:");
        int index = Integer.parseInt(scanner.nextLine());
        return index;
    }

    public void wypiszWszystkichPracownikow() {
        for (int i = 0; i < listaPracownikow.length; i++) {
            if (listaPracownikow[i] != null) {
                listaPracownikow[i].wypiszOkrojoneDane(i);
            }
        }
    }
}
