package base;
class Main {
    //Linear
    public static int fibonaccilinear(int number) {
        if (number == 0) {
            return 0;
        }
        if (number == 1 || number == 2) {
            return 1;
        }
        return fibonaccilinear(number - 2) + fibonaccilinear(number - 1);
    }


    static int fib(int n) {

        if (n == 1 || n == 2) {
            return 1;
        }
        return fib(n - 1) + fib(n - 2);
    }


    // A tail recursive function to
// calculate n th fibnacci number
    static int fib(int n, int a, int b) {

        if (n == 0)
            return a;
        if (n == 1)
            return b;
        return fib(n - 1, b, a + b);
    }

    public static void main(String[] args) {
        int n = 9;
        System.out.println("fib(" + n + ") = " +
                fib(n, 0, 1));

        int maxint = 15;
        System.out.println("Fibonacci Series of numbers:(" + maxint + " numbers) ");
        for (int i = 0; i < maxint; i++) {
            System.out.print(fibonaccilinear(i) + " ");
        }

        int b = 9;
        System.out.println("fib(" + n + ") = " +
                fib(n));
    }
}

