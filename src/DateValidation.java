import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.Date;

public class DateValidation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the date");
        String input = sc.nextLine();

        SimpleDateFormat obj = new SimpleDateFormat("dd/MM/yyyy");
        obj.setLenient(false);

        try {
            Date user = obj.parse(input);
            System.out.println(input + " is a valid date");
        } catch (Exception e) {
            System.out.println(input + " is not a valid date");
        }
    }
}