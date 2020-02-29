package zadanie_firma;

import java.util.Random;
import java.util.Scanner;

public class ListaPracownikow {
    private Scanner scanner = new Scanner(System.in);
    private Pracownik[] listaPracownikow = new Pracownik[100];
    private String[] imiona = {"Filip", "Marek", "Jacek", "Anna", "Ewa", "Piotr"};
    private String[] nazwiska = {"Nowak", "Kamiński", "Kowalski", "Cichy", "Cebula", "Król"};
    private int licznikPracownikow;


    public ListaPracownikow() {
        Pracownik pracownik1 = new Pracownik("Filip", "Forszpaniak", 'M',
                1, 200, 31, 0, true);
        listaPracownikow[licznikPracownikow++] = pracownik1;

        Pracownik pracownik2 = new Pracownik("Janusz", "Nowak", 'M',
                1, 100, 56, 2, true);
        listaPracownikow[licznikPracownikow++] = pracownik2;
    }


    public void generujPracownikow() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ile pracownikow chcesz wygenerowac? Max 100. Wcześniejsi zostaną usunięci.");
        int ile = Integer.parseInt(getLine());
        if (ile > 100) {
            System.out.println("Za dużo pracowników!");
            return;
        }
        for (int i = 0; i < ile; i++) {
            Random random = new Random();
            int indexImie = random.nextInt(6);
            String imie = imiona[indexImie];
            int indexNazwisko = random.nextInt(6);
            String nazwisko = nazwiska[indexNazwisko];
            char plec = getPlec(imie);
            int nrDzialu = random.nextInt(10);
            int placa = random.nextInt(4000) + 1000;
            int wiek = random.nextInt(40) + 18;
            int dzieci = random.nextInt(5);
            boolean stanCywilny = random.nextBoolean();
            Pracownik pracownik = new Pracownik(imie, nazwisko, plec, nrDzialu, placa, wiek, dzieci, stanCywilny);
            listaPracownikow[licznikPracownikow++] = pracownik;
        }
    }

    private char getPlec(String imie) {
        return imie.charAt(imie.length() - 1) == 'a' ? 'K' : 'M';
    }

    public void dodajNowegoPracownika() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Imię: ");
        String imie = getLine();

        System.out.print("Nazwisko: ");
        String nazwisko = getLine();

        System.out.print("Płeć: ");
        char plec = getLine().charAt(0);

        System.out.print("Numer działu: ");
        int numerDzialu = Integer.parseInt(getLine());

        System.out.print("Płaca: ");
        float placa = Float.parseFloat(getLine());

        System.out.print("Wiek: ");
        int wiek = Integer.parseInt(getLine());

        System.out.print("Dzieci: ");
        int dzieci = Integer.parseInt(getLine());

        System.out.print("Stan cywilny: ");
        boolean aa = Boolean.parseBoolean(getLine());

        Pracownik nowyPracownik = new Pracownik(imie, nazwisko, plec, numerDzialu, placa,
                wiek, dzieci, aa);
        listaPracownikow[licznikPracownikow++] = nowyPracownik;
    }

    public void usunPracownika() {
        int ileMamyPracownikow = ileMamyPracownikow();
        if (ileMamyPracownikow > 0) {
            int index = pobierzIndexPracownika();
            listaPracownikow[index] = null;
            usunPrzerwyPomiedzyPracownikami();
            System.out.println("Usunięto pracownika");
        } else {
            System.out.println("Masz pustą listę pracowników");
        }
    }

    private void usunPrzerwyPomiedzyPracownikami() {
        Pracownik[] tablicaBezPrzerw = new Pracownik[listaPracownikow.length];
        int tempIndex = 0;
        for (int i = 0; i < listaPracownikow.length; i++) {
            if (listaPracownikow[i] != null) {
                tablicaBezPrzerw[tempIndex++] = listaPracownikow[i];
            }
        }
        listaPracownikow = tablicaBezPrzerw;
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
        int index = Integer.parseInt(getLine());
        return index;
    }

    public void wypiszWszystkichPracownikowOkrojone() {
        for (int i = 0; i < listaPracownikow.length; i++) {
            if (listaPracownikow[i] != null) {
                listaPracownikow[i].wypiszOkrojoneDane(i);
            }
        }
    }

    public void edytujPracownika() {
        wypiszWszystkichPracownikowAll();
        Pracownik pracownik = getPracownikDoEdycji();
        String jakiePoleEdytowac = jakiePoleEdytowac();
        String nowaWartosc = pobierzNowaWartoscDlaPola();
        edytujPole(pracownik, jakiePoleEdytowac, nowaWartosc);
    }

    private void edytujPole(Pracownik pracownik, String pole, String nowaWartosc) {
        switch (pole) {
            case "imie":
                pracownik.setImie(nowaWartosc);
                break;
            case "nazwisko":
                pracownik.setNazwisko(nowaWartosc);
                break;
            case "wiek":
                pracownik.setWiek(Integer.parseInt(nowaWartosc));
                break;
            default:
                System.out.println("Podano złą nazwę pola");
        }
    }

    private void wypiszWszystkichPracownikowAll() {
        for (int i = 0; i < listaPracownikow.length; i++) {
            if (listaPracownikow[i] != null) {
                System.out.println(String.format("Index: %s, %s", i, listaPracownikow[i].toString()));
            }
        }
    }

    private String pobierzNowaWartoscDlaPola() {
        System.out.println("Podaj nową wartość dla pola");
        return getLine();
    }

    private String jakiePoleEdytowac() {
        Pracownik.wypiszPolaDoEdycji();
        System.out.println("Wybierz pole do edycji");
        String wybranePole = getLine().toLowerCase();
        return wybranePole;
    }

    private Pracownik getPracownikDoEdycji() {
        System.out.println("Podaj index pracownika");
        int index = Integer.parseInt(getLine());
        return listaPracownikow[index];
    }

    private String getLine() {
        return scanner.nextLine();
    }

    public void ilePracownikowMaWyzszaPensjeNizPodana() {
        System.out.println("Podaj pensję");
        float pensja = Float.parseFloat(getLine());
        int licznik = 0;
        for (Pracownik pracownik : listaPracownikow) {
            if (pracownik != null && pracownik.getPlaca() > pensja) {
                licznik++;
            }
        }
        System.out.println(String.format("%s pracownikow ma nie mniejszą pensję nić %.2f", licznik, pensja));
    }

    public void printDebug() {
        for (int i = 0; i < listaPracownikow.length; i++)
            if (listaPracownikow[i] != null) {
                System.out.println(i + "|" + listaPracownikow[i].toString());
            } else {
                System.out.println(i + "|" + "null");
            }
    }
}
