public class FibonacciRecursivaTradicional {
    static long fibo(int n) {
        if (n < 2) {
            return n;
        } else {
            return fibo(n - 1) + fibo(n - 2);
        }
    }
    public static void main(String[] args) {
        // Imprime os 45 primeiros termos
        for (int i = 0; i < 45; i++) {
            System.out.print("(" + i + "):" + FibonacciRecursivaTradicional.fibo(i) + "\n");
        }
    }
}