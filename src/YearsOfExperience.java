import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class YearsOfExperience {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the date of joining");
        String d1 = sc.nextLine();

        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
        sdf1.setLenient(false);

        Date date1 = new Date();

        try{
            date1 = sdf1.parse(d1);
        } catch (Exception e){
            System.out.println(d1 + " is not a valid date");
            return;
        }
        Date date2 = new Date();

        try{
            date2 = sdf1.parse("15/12/2020");
        } catch (Exception e){
            System.out.println(d1 + " is not a valid date");
        }

        long a = date2.getTime() - date1.getTime();

        long years = TimeUnit.MILLISECONDS.toDays(a) / 365;

        System.out.println(years + " years of experience");
    }
}