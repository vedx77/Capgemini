import java.util.Scanner;

public class SwapTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a,b;
        System.out.println("Enter the numbers");
        a = sc.nextInt();
        b = sc.nextInt();

        System.out.println("Before swapping\nfirst = " + a + " second = " + b);
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("After swapping\nfirst = " + a + " second = " + b);
    }
}
/*
import java.util.Scanner;

public class swapTwoNumbers{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a,b,swap;
        System.out.println("Enter the numbers");
        a = sc.nextInt();
        b = sc.nextInt();

        System.out.println("Before swapping\nfirst = " + a + " second = " + b);
        swap = a;
        a = b;
        b = swap;
        System.out.println("After swapping\nfirst = " + a + " second = " + b);
    }
}
 */