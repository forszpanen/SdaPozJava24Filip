package dodatkowe;

public class Fibo {
    public static void main(String[] args) {
        fibo(50);
    }

    static void fibo(int n) {

        System.out.println(1);
        System.out.println(1);

        long a = 1;
        long b = 1;
        for (int i = 2; i <= n; i++) {
            long sum = a + b;
            a = b;
            b = sum;
            System.out.println(b);
        }

    }
}
// 0 1 2 3 4 5 6
// 1 1 2 3 5 8 13 21 34 55 89 144 233 377 610 987 1597 2584 4181 6765