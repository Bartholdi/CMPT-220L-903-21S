package base;

import java.util.Arrays;
import java.util.Scanner;

class Main{

   public static void main(String[] args) {

      //Create the tree
      int[] a = {23,11,8,30,24,5,3,7,21};
      int arraySize = a.length-1;

      System.out.println("Array inputted: ");
      for( int b : a){
         System.out.print(b + " ");
      }

      BinarySearch newSearchTree = new BinarySearch();

      Scanner inputScanner = new Scanner(System.in);

      for(int n : a) {
         newSearchTree.insert(n);
      }

      System.out.println();
      System.out.println("Array in order:");
      newSearchTree.inOrderTraversal();

      System.out.println();

      boolean flag = true;
      boolean innerSwitch = true;

      do{

         System.out.println("Please input a valid int");
         System.out.println("0) Find the smallest element ");
         System.out.println("1) Search for an element");
         System.out.println("2) Get height");
         System.out.println("3) Find the Nth largest element");
         System.out.println("4) Find the largest element");
         System.out.println("5) Delete an element");
         System.out.println("6) Preorder");
         System.out.println("7) Ordered Array");
         System.out.println("8) Breath First Search");
         System.out.println("9) Depth First Search");
         System.out.println("10) Insert");
         System.out.println("11) Quit");

         int number = inputScanner.nextInt();

         switch (number) {

            case 0:
               System.out.println("The smallest element is " + newSearchTree.returnTheSmallest(2, newSearchTree.getRoot()).getValue());
               break;

            case 1:
               //search

               do{
                  System.out.println("Input a value to find");
                  int value = inputScanner.nextInt();

                  if(value >= 0){
                     innerSwitch = false;
                     String toPrint = "The value " + value + " does NOT exist";
                     if(newSearchTree.search(value)){
                        toPrint = "The value " + value + " exists";
                     }
                     System.out.println(toPrint);
                  }
               }while(innerSwitch);
               break;

            case 2:
               System.out.println("The height is  " + newSearchTree.height());
               break;

            case 3:
               System.out.println("Find the nth element");
               System.out.println(newSearchTree.returnNthLargest());

               break;

            case 4:
               //Largest Element
               System.out.println("The largest element is: " + newSearchTree.returnLargestElement());
               break;

            case 5:
               //delete
               System.out.println("Delete an element. ");
               arraySize = arraySize-1;

               int value = inputScanner.nextInt();
               newSearchTree.delete(value);
               System.out.println("Deleted value " + value);
               break;

            case 6:
               //preorder
               System.out.println("Pre-ordering array");
               newSearchTree.preOrderTraversal();
               break;

            case 7:
               //postorder
               System.out.println("Post order Array");
               newSearchTree.inOrderTraversal();
               break;

            case 8:
               //breath first
               do{
                  System.out.println("Breath First Search");
                  System.out.println("Input a value to find");
                  int nextValue = inputScanner.nextInt();

                  if(nextValue >= 0){
                     innerSwitch = false;
                     String toPrint = "The value " + nextValue + " exists";
                     if(newSearchTree.search(nextValue)){
                        toPrint = "The value " + nextValue + " exists";
                     }
                     System.out.println(toPrint);
                  }
               }while(innerSwitch);
               break;

            case 9:
               //depth first

               do{
                  System.out.println("Depth First Search");
                  System.out.println("Input a value to find");
                  int nextValue = inputScanner.nextInt();

                  if(nextValue >= 0){
                     innerSwitch = false;
                     String toPrint = "The value " + nextValue + " exists";
                     if(newSearchTree.search(nextValue)){
                        toPrint = "The value " + nextValue + " exists";
                     }
                     System.out.println(toPrint);
                  }
               }while(innerSwitch);
               break;

            case 10:
               //insert
               System.out.println("Insert a value");
               int newValue = inputScanner.nextInt();
               newSearchTree.insert(newValue);
               arraySize++;
               break;

            case 11:
               //Quit
               System.out.println("Quitting....");
               flag = false;
               break;

            default:
               System.out.println("Type another int....");
         }

         System.out.println();
      }while(flag);
//       the output should be 2

   }
}