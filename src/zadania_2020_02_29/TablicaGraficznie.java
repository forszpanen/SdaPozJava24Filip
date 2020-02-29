package zadania_2020_02_29;

import java.util.Scanner;

public class TablicaGraficznie {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numItems;
        int[] items;
        do {
            System.out.print("Podaj liczbę elemetnów:");
            if (scanner.hasNextInt()) {
                numItems = scanner.nextInt();
                scanner.nextLine();
                break;
            } else {
                scanner.nextLine();
            }
        } while (true);
        items = new int[numItems];
        for (int i = 0; i < items.length; i++) {
            do {
                System.out.print("Podaj wartość dla elementu nr " + i +":");
                if (scanner.hasNextInt()) {
                    items[i] = scanner.nextInt();
                    scanner.nextLine();
                    break;
                } else {
                    scanner.nextLine();
                }
            } while (true);
        }
        for (int i = 0; i < items.length; i++) {
            System.out.print(i + ": " + "*".repeat(items[i]));
            System.out.println("("+ items[i] + ")");
        }
    }}
