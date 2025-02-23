import java.util.Scanner;
public class HotelBooking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name");
        String name = sc.next();
        System.out.println("Enter the number of rooms you needed");
        byte num = sc.nextByte();
        while (num < 1){
            System.out.println("Please enter a valid number");
            num = sc.nextByte();
        }
        System.out.println("Enter the phone number");
        Long phone = sc.nextLong();
        int rent = 500, total = rent * num;
        System.out.println("Pay Rs. " + total + " for booking\nYour booking has been confirmed");
    }
}