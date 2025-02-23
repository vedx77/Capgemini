import java.util.Scanner;
public class SumOfTen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number");
        int num = sc.nextInt();

        if (num < 0){
            System.out.println(num + " is a negative number");
        } else {
            int sum = num, i, a = 0;
            //System.out.print("Number : " + num + "\nSum = ");
            for (i = 0 ; i < 10 ; i++){
                /*
                System.out.print(sum);
                if (i < 9){
                    System.out.print("+");
                } else {
                    System.out.print(" = ");
                }
                 */
                 a += sum;
                 sum++;
            }
            System.out.print("Sum of ten numbers is " + a);
        }
    }
}