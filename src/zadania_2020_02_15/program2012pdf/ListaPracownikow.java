package zadania_2020_02_15.program2012pdf;

import java.util.Scanner;

public class ListaPracownikow {
    private Pracownik[] pracownicy = new Pracownik[100];
    private int licznikPracownikow;

    public ListaPracownikow() {
        Pracownik pracownik1 = new Pracownik("Filip", "Forszpaniak", 'M',
                1, 200, 31, 0, true);
        pracownicy[licznikPracownikow++] = pracownik1;
        Pracownik pracownik2 = new Pracownik("Janusz", "Nowak", 'M',
                1, 100, 56, 2, true);
        pracownicy[licznikPracownikow++] = pracownik2;
    }

    public void pokazWszystkichPracownikow(){
        for (int i = 0; i < pracownicy.length; i++) {
            if(pracownicy[i] != null){
                pracownicy[i].wyswietlOkrojoneDane();
            }
        }
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
        boolean stanCywilny = Boolean.parseBoolean(scanner.nextLine());
        Pracownik nowyPracownik = new Pracownik(imie, nazwisko, plec, numerDzialu, placa, wiek, dzieci, stanCywilny);
        pracownicy[licznikPracownikow++] = nowyPracownik;
//        scanner.close();

    }
}
