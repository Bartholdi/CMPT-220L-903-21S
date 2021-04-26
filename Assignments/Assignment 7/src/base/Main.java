package base;

public class Main {

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        int x = 0;
         for(int i=0; i < n; i++){
                 for(int j=1; j < (n-i); j++){
                          if(arr[j-1] > arr[j]){
                                 x = arr[j-1];
                                 arr[j-1] = arr[j];
                                 arr[j] = x;
                         }
                 }
         }
    }
    public static void main(String[] args) {
                int array[] ={4,32,40,1,1000,99,211,22222};

                System.out.println("Before Bubble Sort");
                for(int i=0; i < array.length; i++){
                        System.out.print(array[i] + " ");
                }
                System.out.println();

                bubbleSort(array);

                System.out.println("After Bubble Sort (Final Array)");
                for(int i=0; i < array.length; i++){
                        System.out.print(array[i] + " ");
                }

        }
}