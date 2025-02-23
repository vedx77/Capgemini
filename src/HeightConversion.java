import java.util.Scanner;

public class HeightConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double cm, ft;
        System.out.println("Enter height in cm");
        cm = sc.nextDouble();
        ft = cm / 30.48;
        System.out.printf("Height in feet is %.2f feet", ft);
    }
}