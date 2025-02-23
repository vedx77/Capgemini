import java.util.Scanner;
public class LotteryWinner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the ticket Id");
        long id = sc.nextLong();

        System.out.println("Enter unlucky code");
        int ul = sc.nextInt();

        int luck = 0;
        long temp = id, a;
        while (temp > 0){
            a = temp % 10;
            temp /= 10;
            if (a == ul){
                luck++;
            }
         }
        if (luck == 0){
            System.out.println(id + " is lucky ticket");
        } else if (luck < 3) {
            System.out.println(id + " is partially lucky");
        } else {
            System.out.println(id + " is unlucky ticket");
        }

    }
}