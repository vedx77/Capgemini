import java.util.Calendar;
import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;

public class CalculateExpiryDate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Manufacturing Date");
        String mDate = sc.nextLine();
        SimpleDateFormat obj = new SimpleDateFormat("dd/MM/yyyy");
        obj.setLenient(false);

        Date user = new Date();
        try {
            user = obj.parse(mDate);
        } catch (Exception e) {
            System.out.println(mDate + " is not a valid date");
            return;
        }

        System.out.println("Enter the month");
        int expMon = sc.nextInt();

        Calendar cal = Calendar.getInstance();
        cal.setTime(user);
        cal.add(Calendar.MONTH , expMon);

        Date expDate = cal.getTime();
        SimpleDateFormat desiredOp = new SimpleDateFormat("dd/MM/yyyy");
        String output = desiredOp.format(expDate);

        System.out.println(output + " is the expiry date");
    }
}