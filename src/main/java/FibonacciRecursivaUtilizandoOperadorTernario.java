public class FibonacciRecursivaUtilizandoOperadorTernario {
    static long fibo(int n) {
        return (n < 2) ? n : fibo(n - 1) + fibo(n - 2);
    }
    public static void main(String[] args) {
        // Imprime os 45 primeiros termos
        for (int i = 0; i < 45; i++) {
            System.out.print("(" + i + "):" + FibonacciRecursivaUtilizandoOperadorTernario.fibo(i) + "\n");
        }
    }
}