import java.util.Scanner;
public class UI_VC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the choice\n1.Find the volume of Cylinder\n2.Find the volume of Cuboid");
        int choice = sc.nextInt();
        VolumeCalculator vol = new VolumeCalculator();

        if (choice == 1){
            System.out.println("Enter the radius");
            double radius = sc.nextDouble();
            System.out.println("Enter the height");
            double height = sc.nextDouble();
            double volume = vol.calculateVolume(radius, height);
            System.out.printf("Volume of the Cylinder is %.2f", volume);

        } else if (choice == 2) {
            System.out.println("Enter the length");
            int length = sc.nextInt();
            System.out.println("Enter the breadth");
            int breadth = sc.nextInt();
            System.out.println("Enter the height");
            int height = sc.nextInt();
            double volume = vol.calculateVolume(length, breadth, height);
            System.out.printf("Volume of the Cuboid is %.2f", volume);
        }
    }
}