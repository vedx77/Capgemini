import java.util.Scanner;
public class MiddleNumberGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int arr1size = sc.nextInt();
        if (arr1size > 10 || arr1size < 1){
            System.out.println("Please enter a valid number");
            return;
        }else if (arr1size % 2 == 0){
            System.out.println("Please enter an odd number");
            return;
        } else System.out.println("Enter the elements");

        int[] arr1 = new int[arr1size];
        for (int i = 0; i < arr1size; i++) {
            arr1[i] = sc.nextInt();
            if (arr1[i] > 10 || arr1[i] < 1){
                System.out.println("Please enter valid elements in the array");
                return;
            }
        }

        int middleNumber = arr1size / 2;
        int sum = 0, product = 1;

        if (arr1[middleNumber] % 2 == 0){
            for (int i = 0; i < arr1size / 2; i++) {
                sum += arr1[i];
            }
            for (int i = arr1size / 2 + 1; i < arr1size; i++) {
                product *= arr1[i];
            }
        }else{
            for (int i = 0; i < arr1size / 2; i++) {
                product *= arr1[i];
            }
            for (int i = arr1size / 2 + 1; i < arr1size; i++) {
                sum += arr1[i];
            }
        }
        if(arr1size == 1){
            System.out.println("The sum of the values is " + sum
                    + "\nThe product of the values is " + 0);
        } else System.out.println("The sum of the values is " + sum
                + "\nThe product of the values is " + product);

    }
}
