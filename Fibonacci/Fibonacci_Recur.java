public class Fibonacci_Recur{
       public static int fibonacci(int n) {
        if (n < 2) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println(Fibonacci_Recur.fibonacci(i) +  " " );
            }
        }
    }