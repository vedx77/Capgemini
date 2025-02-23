import java.util.Scanner;

public class TwoArraysGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size for the first array");
        int arr1size = sc.nextInt();
        if (arr1size < 1) {
            System.out.println(arr1size + " is an invalid array size");
            return;
        }
        System.out.println("Enter the elements for the first array");
        int[] arr1 = new int[arr1size];
        for (int i = 0; i < arr1size; i++){
            arr1[i] = sc.nextInt();
        }

        System.out.println("Enter the size for the second array");
        int arr2size = sc.nextInt();
        if (arr2size < 1) {
            System.out.println(arr2size + " is an invalid array size");
            return;
        }
        System.out.println("Enter the elements for the second array");
        int[] arr2 = new int[arr2size];
        for (int i = 0; i < arr2size; i++){
            arr2[i] = sc.nextInt();
        }
        if (arr1size != arr2size) {
            System.out.println("Both array size are not the same");
            return;
        }
        int[] arr3 = new int[arr1size];
        for (int i = 0; i < arr1size; i++) {
           if (i % 2 == 0){
               arr3[i] = arr1[i] + arr2[i];
           } else{
               arr3[i] = arr1[i] - arr2[i];
           }
        }
        System.out.println("The elements of the third array");
        for (int i : arr3) {
            System.out.println(i);
        }
    }
}