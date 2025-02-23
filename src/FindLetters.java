import java.util.Scanner;

public class FindLetters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the word");
        String word = sc.nextLine();
        int wlen = word.length();

        System.out.println("Enter two indices");
        int index1 = sc.nextInt();
        if (index1 >= wlen) {
            System.out.println(index1 + " is greater than the word length");
            return;
        }
        int index2 = sc.nextInt();
        if (index2 >= wlen){
            System.out.println(index2 + " is greater than the word length");
            return;
        }
        if (index2 < index1){
            System.out.println("Index2 should be greater than Index1");
            return;
        }
        String op = word.substring(index1, index2);
        System.out.println(op);

    }
}