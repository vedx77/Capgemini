import java.util.Scanner;
public class UI_NW {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name");
        String name = sc.nextLine();

        System.out.println("Enter the age");
        int age = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter the gender");
        String gender = sc.nextLine();
        System.out.println("Enter the blood group");
        String bloodGroup = sc.nextLine();
        System.out.println("Enter the phone no");
        long phoneNumber = sc.nextLong();

        BloodworksNorthwest obj = new BloodworksNorthwest(name, age, gender, bloodGroup, phoneNumber);
        displayBW(obj);
    }

    public static void displayBW(BloodworksNorthwest obj){
        System.out.println("Name:" + obj.getName()
                + "\nAge:" + obj.getAge()
                + "\nGender:" + obj.getGender()
                + "\nBlood group:" + obj.getBloodGroup()
                + "\nPhone no:" + obj.getPhoneNumber());
    }
}