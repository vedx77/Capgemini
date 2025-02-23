import java.util.InputMismatchException;
import java.util.Scanner;

public class ArrayManipulationMultiCatch {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the size of an array");
            int arr1Size = sc.nextInt();
            if (arr1Size < 1){
                throw new NegativeArraySizeException();
            }

            System.out.println("Enter the array elements");
            int[] arr1 = new int[arr1Size];
            for (int i = 0; i < arr1Size; i++) {
                arr1[i] = sc.nextInt();
            }
            System.out.println("Enter the position of the element to be replicated");
            int replicate = sc.nextInt();
            if (replicate > arr1Size) throw new ArrayIndexOutOfBoundsException("Array Of Bound");


            int[] arr2 = new int[arr1Size + 1];

            for (int i = 0; i < arr1Size; i++) {
                if (i == replicate){
                    arr2[i] = arr1[i];
                    arr2[i + 1] = arr1[i];
                }else{
                    arr2[i] = arr1[i];
                }
            }
            System.out.print("The array elements are ");

            for (int i : arr2) {
                System.out.print(i + " ");
            }

        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        } catch (InputMismatchException e){
            System.out.println("Input was not in the correct format");
        } catch (NegativeArraySizeException e){
            System.out.println("Array size should be positive");
        }
    }
}