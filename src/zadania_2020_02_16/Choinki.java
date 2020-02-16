package zadania_2020_02_16;

import java.util.Scanner;

public class Choinki {
    public static void main(String[] args) {
        System.out.println("Podaj liczbe wierszy");
        Scanner scanner = new Scanner(System.in);
        int wiersze = scanner.nextInt();
        drukujChoinka4(wiersze);
        drukujChoinka2(wiersze);
        drukujChoinka3(wiersze);
        drukujChoinka4(wiersze);
        drukujChoinka3b(wiersze);
        drukujChoinka4b(wiersze);

    }

    static void drukujChoinka1(int wiersze){
        for (int i = 0; i < wiersze; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("# " + "{i:" + i +"|j:" + j +"}");
            }
            System.out.println();
        }
    }

    private static void drukujChoinka2(int wiersze){
        for (int i = 0; i < wiersze; i++) {
            for (int j = 0; j < wiersze-i; j++) {
                //System.out.print("# ");
                System.out.print("# " + "{i:" + i +"|j:" + j +"}");
            }
            System.out.println();
        }
    }

    private static void drukujChoinka3(int wiersze){
        // zewnetrzna petla
        for (int i = 0; i < wiersze; i++) {

            // wewnwtrzna petla
            for (int j = 0; j < wiersze; j++) {
                if(j>=i){
                    System.out.print("# ");
                }
                else {
                    System.out.print("  ");
                }
            }
            ///////////////////////////

            System.out.println();
            ///////////////////
        }
    }


    private static void drukujChoinka4(int wiersze){
        for (int i = 0; i < wiersze+1; i++) {
            for (int j = 0; j < wiersze; j++) {
                if(j>=wiersze-i){
                    System.out.print("# ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    private static void drukujChoinka3b(int wiersze){
        for (int i = 0; i < wiersze; i++) {
            for (int j = 0; j < wiersze; j++) {
                if(j>=i){
                    System.out.print("# ");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    private static void drukujChoinka4b(int wiersze){
        for (int i = 0; i < wiersze+1; i++) {
            for (int j = 0; j < wiersze; j++) {
                if(j>=wiersze-i){
                    System.out.print("# ");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
}
