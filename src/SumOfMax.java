import java.util.Arrays;
import java.util.Scanner;
public class SumOfMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int arrSize = sc.nextInt();

        if (arrSize < 1){
            System.out.println(arrSize + " is an invalid array size");
            return;
        } else if (arrSize % 2 != 0) {
            System.out.println(arrSize + " is an odd number. Please enter even number");
            return;
        }

        System.out.println("Enter the number");
        int[] arr = new int[arrSize];
        for(int i = 0; i < arrSize; i++){
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);
        int[] sum = new int[arrSize / 2];

        int max = sum[0];
        for (int i = 0; i < arrSize / 2; i++) {
            sum[i] = arr[i] + arr[arrSize - 1 - i];
        }
        for (int element : sum){
            if (max < element){
                max = element;
            }
        }

        System.out.println("The maximum number is " + max);
    }
}