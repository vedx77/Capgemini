import java.util.Scanner;
public class ReverseAndExpand {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number");
        int num = sc.nextInt();

        if (num > 9999 || num <1000){
            System.out.println("Invaild input");
            return;
        }

        int rev = 0, temp = num;
        while (temp > 0){
            rev = rev * 10 + temp % 10;
            temp /= 10;
        }
        System.out.println("The reversed number is " + rev);

        StringBuilder exp = new StringBuilder();
        int place = 1;
        while (rev > 0){
            int d = rev % 10;
            if (d > 0){
                if (exp.length() > 0){
                    exp.insert(0, "+");
                }
                exp.insert(0, (d * place));
            }
            rev /= 10;
            place *= 10;
        }
        System.out.println(exp);
    }
}