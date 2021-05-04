package base;
class Main {
    public static int fibonaccilinear(int number){
        if(number == 0){
            return 0;
        }
        if(number == 1 || number == 2){
            return 1;
        }
        return fibonaccilinear(number-2) + fibonaccilinear(number-1);
    }
    public static void main(String args[]) {
        int maxint = 15;
        System.out.print("Fibonacci Series of numbers:("+maxint+" numbers) ");
        for(int i = 0; i < maxint; i++){
            System.out.print(fibonaccilinear(i) +" ");
        }
    }
}

