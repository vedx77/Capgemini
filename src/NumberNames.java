import java.util.Scanner;
public class NumberNames {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        String num = sc.next();
        String[] names = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        StringBuilder result = new StringBuilder();
        for (char digit : num.toCharArray()) {
            result.append(names[digit - '0']).append(" ");
        }
        System.out.println(result);
    }
}