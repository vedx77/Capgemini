import java.util.Scanner;
public class LudoKing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Alex points");
        int alex = sc.nextInt();
        if (alex > 50 || alex < 0){
            System.out.println(alex + " is an invalid input");
            return;
        }
        System.out.println("Enter Nikil points");
        int nikil = sc.nextInt();
        if (nikil > 50 || nikil < 0){
            System.out.println(nikil + " is an invalid input");
            return;
        }
        System.out.println("Enter Sam points");
        int sam = sc.nextInt();
        if (sam > 50 || sam < 0){
            System.out.println(sam + " is an invalid number");
            return;
        }
        if (alex > nikil){
            if (alex > sam){
                System.out.println("Alex scored " + alex + " points and won the game");
            } else if (alex == sam) {
                System.out.println("The game is a tie");
            } else{
                System.out.println("Sam scored " + sam + " points and won the game");
            }
        } else if (alex < nikil) {
            if (nikil > sam){
                System.out.println("Alex scored " + nikil + " points and won the game");
            } else if (nikil == sam) {
                System.out.println("The game is a tie");
            } else{
                System.out.println("Sam scored " + sam + " points and won the game");
            }
        } else {
            System.out.println("The game is a tie");
        }
    }
}