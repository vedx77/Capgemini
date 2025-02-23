import java.util.HashSet;
import java.util.Scanner;
public class NumberGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of chances");
        int chance = sc.nextInt();
        if (chance < 1 || chance > 5){
            System.out.println("Your chance " + chance + " is out of range(1-5)");
            return;
        }
        int input = chance * 2;
        System.out.println("Enter the number");
        int[] num = new int[input];
        for (int i = 0; i < input; i++){
            num[i] = sc.nextInt();
            if (num[i] > 10 || num[i] < 1){
                System.out.println(num[i] + " is an invalid number");
                return;
            }
        }

        int[] primeArr = {2,3,7,11,13,17,19,23,29,31,37,41,43,47};
        HashSet<Integer> primeSet = new HashSet<>();
        for (int no : primeArr) {
            primeSet.add(no);
        }
        int sum = 0;

        for (int i = 0; i < input; i++) {
            sum += num[i];
        }

        boolean exist;
        exist = primeSet.contains(sum);

        if (exist){
            System.out.println("The sum " + sum + " is a prime number.You won the game");
        } else {
            System.out.println("The sum " + sum + " is not a prime number.Better luck next time");
        }
    }
}