package zadania_do_domu;

import java.util.Random;
import java.util.Scanner;

public class Szyfrolamacz {
    Scanner scanner = new Scanner(System.in);
    int zycia = 5;
    int sekretneHaslo = 1234;
    boolean podpowiedz = true;
    public static void main(String[] args) {

        Szyfrolamacz szyfrolamacz = new Szyfrolamacz();
        szyfrolamacz.odgadujSzyfr();
    }

    public void odgadujSzyfr(){
        while(true){
            String haslo = podajHaslo();
            if(sprawdzCzyPokazacPodpowiedz(haslo)){
                pokazPodpowiedz();
                continue;
            }
            if(sprawdzHaslo(haslo)){
                System.out.println("Brawo odgadłeś hasło - " + haslo);
                break;
            }
            else {
                zycia--;
            }
            if(zycia == 0){
                if(czyGracOdNowa()){
                    reset();
                }
                else {
                    return;
                }
            }
        }
    }

    private void pokazPodpowiedz(){
        Random random = new Random();
        int nextInt = random.nextInt(4);
        char[] tab = String.valueOf(sekretneHaslo).toCharArray();
        for (int i = 0; i < tab.length; i++) {
            if(i != nextInt){
                System.out.print("*");
            }
            else {
                System.out.print(tab[i]);
            }
        }
        System.out.println();
    }

    private boolean sprawdzCzyPokazacPodpowiedz(String line){
        if(podpowiedz && line != null && line.equalsIgnoreCase("P")){
            podpowiedz = false;
            return true;
        }
        return false;
    }

    private boolean sprawdzHaslo(String haslo){
        if(haslo != null && haslo.length() == 4){
            int hasloLiczba = Integer.parseInt(haslo);
            if(hasloLiczba == sekretneHaslo){
                return true;
            }
            else if(hasloLiczba > sekretneHaslo){
                System.out.println("Podane hasło jest większe");
            }
            else {
                System.out.println("Podane hasło jest mniejsze");
            }
        }
        return  false;
    }

    private String podajHaslo(){
        System.out.println("Liczba żyć: " + zycia + "| Proszę podać 4 cyfrowe hasło albo wcisnąc P o podpowiedź");
        String line = getLine();
        if(line.equalsIgnoreCase("P")){
            return line;
        }
        if(line != null && line.length() != 4){
            System.out.println("Podana hasło w zym formacie. Musi miec 4 cyfry.");
            return null;
        }
        return line;
    }

    private boolean czyGracOdNowa(){
        System.out.println("Czy grać od nowa? t/n");
        String line = getLine();
        return line.equals("t");
    }

    private void reset(){
        Random random = new Random();
        sekretneHaslo = random.nextInt(8999) + 1000;
        zycia = 5;
        podpowiedz = true;
    }

    private String getLine(){
        return scanner.nextLine();
    }


}
