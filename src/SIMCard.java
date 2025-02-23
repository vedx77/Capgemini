import java.util.Scanner;
public class SIMCard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the phone number");
        long num = sc.nextLong();
        int sumEven = 0, sumOdd = 0;
        while (num > 0) {
            int digit = (int) (num % 10);
            if (digit % 2 == 0) {
                sumEven += digit;
            } else {
                sumOdd += digit;
            }
            num /= 10;
        }
        if (sumEven == sumOdd){
            System.out.println("Sum of odd and even are equal");
        } else if (sumEven > sumOdd) {
            System.out.println("Sum of even is greater than sum of odd");
        }else {
            System.out.println("Sum of odd is greater than sum of even");
        }
    }
}