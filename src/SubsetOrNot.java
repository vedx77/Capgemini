import java.util.Scanner;
import java.util.HashSet;
public class SubsetOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //First Array
        System.out.println("Enter the first array size");
        int size1 = sc.nextInt();
        if (size1 < 1){
            System.out.println(size1 + " is an invalid array size");
            return;
        }
        System.out.println("Enter the numbers");
        int[] arr1 = new int[size1];
        for (int i = 0; i < size1; i++) {
            arr1[i] = sc.nextInt();
        }

        //Second Array
        System.out.println("Enter the second array size");
        int size2 = sc.nextInt();
        if (size2 < 1){
            System.out.println(size2 + " is an invalid array size");
            return;
        }

        if (size2 > size1){
            System.out.println(size2 + " is invalid as it is greater than the first array size " + size1);
            return;
        }

        System.out.println("Enter the numbers");
        int[] arr2 = new int[size2];
        for (int i = 0; i < size2; i++) {
            arr2[i] = sc.nextInt();
        }
        //Making a Hashset
        HashSet<Integer> set1 = new HashSet<>();
        for(int a : arr1){
            set1.add(a);
        }

        //Subset Check
        boolean check = true;
        for (int a : arr2){
            if (!set1.contains(a)){
                check = false;
                break;
            }
        }
        if (check){
            System.out.println("Array2 of size " + size2 + " is a subset of array1");
        } else {
            System.out.println("Array2 of size " + size2 + " is not a subset of array1");
        }
    }
}