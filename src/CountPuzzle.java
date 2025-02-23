import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class CountPuzzle {
    public static void main(String[] args) {
        File file = new File("veda.txt");

        int counter = 0;

        try(Scanner scf = new Scanner(file)){
            while(scf.hasNextLine()){
                String input = scf.nextLine();
                String[] words = input.split("\\s+");

                for (String word : words) {
                    if (word.equals("knowledge")) {
                        counter++;
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(counter);
    }
}