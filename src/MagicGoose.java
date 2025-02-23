import java.util.Scanner;
public class MagicGoose {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the day");
        int day = sc.nextInt();
        if (day < 1 || day > 30){
            System.out.println(day + " is invaild day");
        }else {
            if (day == 1) {
                System.out.println("Number of eggs in 1th day is " + 1);
//                System.out.println("Number of eggs in 1st day is " + 1);
                return;
            } else if (day == 2) {
                System.out.println("Number of eggs in 2nd day is " + 2);
                return;
            } else if (day == 3) {
                System.out.println("Number of eggs in 3rd day is " + 5);
                return;
            } else {
                int a = 2, b = 5, c = 0, i;
                for (i = 3; i < day; i++) {
                    c = 2 * b + a;
                    a = b;
                    b = c;
                }
                System.out.println("Number of eggs in " + day + "th day is " + c);
            }
        }
    }
}