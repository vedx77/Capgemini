import java.util.Scanner;

public class Practise01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true){
            System.out.println("Enter the String");
            String str = sc.nextLine();

            if (str.contains(" ")) System.out.println("Blank space detected!!");
            else System.out.println("No Blank Space");

        }
    }
}