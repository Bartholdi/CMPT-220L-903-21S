package base;

public class Main {
    public static int summation(int[] num){
        int sum = 0;
        for(int i = 0; i < num.length; i++) {
            sum += i;
        }
        return sum;
    }
    public static void main(String[] args) {
        int[] x = {1, 2, 3, 4, 5, 6};
        System.out.print("The Summnation is "+ summation(x));
    }
}