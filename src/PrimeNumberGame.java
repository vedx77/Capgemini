import java.util.HashSet;
import java.util.Scanner;

public class PrimeNumberGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of first array");
        int size1 = sc.nextInt();
        if (size1 < 1){
            System.out.println(size1 + " is an invalid array size");
            return;
        }

        int[] arr1 = new int[size1];
        System.out.println("Enter the array elements");
        for (int i = 0; i < size1; i++){
            arr1[i] = sc.nextInt();
            if (arr1[i] < 0){
                System.out.println(arr1[i] + " is an invalid input");
                return;
            }
        }
        System.out.println("Enter the size of second array");
        int size2 = sc.nextInt();
        if (size2 < 1){
            System.out.println(size2 + " is an invalid array size");
            return;
        }
        if (size2 != size1){
            System.out.println("Both array size is different");
            return;
        }

        int[] arr2 = new int[size2];
        System.out.println("Enter the array elements");
        for (int i = 0; i < size2; i++){
            arr2[i] = sc.nextInt();
            if (arr2[i] < 0){
                System.out.println(arr2[i] + " is an invalid input");
                return;
            }
        }

        int[] arr3 = new int[size2];
        for (int i = 0; i < size1; i++){
            arr3[i] = arr1[i] + arr2[i];
        }

        int sum = 0;
        int[] arr4 = new int[size2];
        for (int i = 0; i < size1; i++){
            arr4[i] = arr3[i] % 10;
        }
        for (int num : arr4){
            sum += num;
        }
        int[] arr5 = {2,3,5,7,11,13,17,19,23,29,31,37,41,43,47};
        HashSet<Integer> set1 = new HashSet<>();
        for (int num : arr5){
            set1.add(num);
        }
        if (set1.contains(sum)){
            System.out.println(sum + " is a prime number");
        }else{
            System.out.println(sum + " is not a prime number");
        }
    }
}