import java.util.*;

public class SkyAirlines {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter name");
        String nam = s.nextLine();

        System.out.println("Enter source");
        String src = s.nextLine();

        System.out.println("Enter destination");
        String  dst = s.nextLine();

        System.out.println("Dear " + nam + ", welcome onboard with service from " + src + " to "  + dst + ". Thank you for choosing Sky Airlines. Enjoy your flight.");
    }
}