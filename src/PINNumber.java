import java.util.ArrayList;
import java.util.Scanner;
public class PINNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the total number of PIN numbers");
        int arr1Size = sc.nextInt();

        if (arr1Size < 1){
            System.out.println(arr1Size + " is an invalid number");
            return;
        }

        int[] arr1 = new int[arr1Size];

        System.out.println("Enter the PIN numbers");
        for (int i = 0; i < arr1Size; i++) {
            arr1[i] = sc.nextInt();
            if (arr1[i] < 1000 || arr1[i] > 9999){
                System.out.println(arr1[i] + " is an invalid PIN number");
                return;
            }
        }

        ArrayList<Integer> validPINs = new ArrayList<>();
        for (int i : arr1) {
            if (conditionMatch(i)) validPINs.add(i);
        }
        if (validPINs.isEmpty()) System.out.println("All these " + arr1Size + " numbers are not a valid PIN number");
        else{
            System.out.println("Valid PIN numbers are");
            for (Integer validPIN : validPINs) {
                System.out.println(validPIN);
            }
        }
    }

    public static boolean conditionMatch(int number){
        int first = number / 1000;
        int second = (number / 100) % 10;
        int third = (number / 10) % 10;
        int fourth = number % 10;

        return condition1(first) && condition2(second) && condition3(third) && condition4(fourth);
    }

    public static boolean condition1(int number){
        return number % 2 == 1;
    }
    public static boolean condition2(int number){
        return number % 2 == 0;
    }
    public static boolean condition3(int number){
        return isPrime(number);
    }
    public static boolean condition4(int number){
        return !isPrime(number);
    }
    public static boolean isPrime(int number){
        if (number == 0 || number == 1) return false;
        if (number == 2 || number == 3) return true;
        if (number % 2 == 0) return false;
        for (int i = 5; i * i <= number; i += 6){
            if (number % i == 0) return false;
        }
        return true;
    }

}