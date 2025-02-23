import java.util.ArrayList;
import java.util.Scanner;

public class MagicSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the array size");
        int arr1size = sc.nextInt();

        if (arr1size > 5 || arr1size < 1) {
            System.out.println(arr1size + " is an invalid array size");
            return;
        }

        int[] arr1 = new int[arr1size];

        System.out.println("Enter the numbers");
        for (int i = 0; i < arr1size; i++) {
            arr1[i] = sc.nextInt();
            if (arr1[i] > 99 || arr1[i] < 1) {
                System.out.println(arr1[i] + " is an invalid input");
                return;
            }
        }

        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> validNum = new ArrayList<>();

        for (int num : arr1){
            if (isPrime(num)){
                validNum.add(num);
            }
        }
        for (Integer i : validNum) {
            if (checkSum(i)) list.add(i);
        }

        if (list.isEmpty()) System.out.println("The " + arr1size + " numbers are not sum of prime numbers");
        else {
            System.out.println("The sum of prime numbers is");
            for (Integer i : list) {
                if (checkSum(i)) System.out.println(i);
            }
        }
    }
    public static boolean isPrime(int number){
        if (number == 0 || number == 1) return false;
        if (number == 2 || number == 3) return true;
        if (number % 2 == 0) return false;
        for (int i = 5; i * i <= number; i += 6) {
            if (number % i == 0) return false;
        }
        return true;
    }

    public static boolean checkSum(int number){
        ArrayList<Integer> primeList = primeListGenerator(number);
        int sum = 0;
        for (int i = 0; i < primeList.size(); i++) {
            sum = 0;
            for (int j = 0; j < primeList.size(); j++) {
                sum += primeList.get(j);
                if (sum == number) return true;
                if (sum > number) break;
            }
        }
        return sum == number;
    }
    public static ArrayList<Integer> primeListGenerator(int limit){
        ArrayList<Integer> primeList = new ArrayList<>();
        for (int i = 2; i < limit; i++) {
            if (isPrime(i))
            {
                primeList.add(i);
            }
        }
        return primeList;
    }
}