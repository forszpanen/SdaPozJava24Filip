package zadania_2020_02_15;

public class temp {
    public static void main(String[] args) {
        String mojeLiczba = "55551";
        int suma = 0;
        for (int i = 0; i < mojeLiczba.length(); i++) {
            char c = mojeLiczba.charAt(i);
            String wartosc = String.valueOf(c);
            suma += Integer.valueOf(wartosc);
        }
        System.out.println(suma);
    }
}
