import java.util.Scanner;
public class NumberPlay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        byte num = sc.nextByte();
        if (num < 10 || num > 99){
            System.out.println("Inavlid number");
            return;
        }
        if (num > 50){
            byte temp = num, a = 0;
            int diff = 0;
            a = (byte) (num % 10);
            num /= 10;
            diff = num - a;
            System.out.println(diff);
        } else {
            byte a = 0, b = 0;
            a  = (byte) (num % 10);
            num /= 10;
            b = (byte) (a - num);
            System.out.println(b);
        }
    }
}