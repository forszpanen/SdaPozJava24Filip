package zadanie_firma;

public class Firma {
    public static void main(String[] args) {
        Menu menu = new Menu();
        ListaPracownikow listaPracownikow = new ListaPracownikow();
        String akcja = "";
        while (!akcja.equals("e") && !akcja.equals("q")) {
            menu.pokazGlowneMenu();
            akcja = menu.pobierzAkcjeOdUzytkownika();

            switch (akcja) {
                case "1":
                    listaPracownikow.wypiszWszystkichPracownikowOkrojone();
                    break;
                case "2":
                    listaPracownikow.dodajNowegoPracownika();
                    break;
                case "4":
                    listaPracownikow.wypiszWszystkichPracownikowOkrojone();
                    listaPracownikow.usunPracownika();
                    break;
                case "5":
                    listaPracownikow.edytujPracownika();
                    break;
                case "6":
                    menu.subMenu6();
                    String subMenu = menu.pobierzAkcjeOdUzytkownika();
                    if (subMenu.equals("a")) {
                        listaPracownikow.ilePracownikowMaWyzszaPensjeNizPodana();
                    }
                    break;
                case "99":
                    listaPracownikow.generujPracownikow();
                    break;
                case "100":
                    listaPracownikow.printDebug();
                    break;
                case "e":
                case "q":
                    System.out.println("Koniec programu");
                    break;
                default:
                    System.out.println("Błędna akcja");
            }


        }

    }
}
