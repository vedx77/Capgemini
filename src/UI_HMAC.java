//Happy Mart Array Class
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Collections;

public class UI_HMAC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the products count");
        int count = sc.nextInt();
        sc.nextLine();

        if (count < 1) {
            System.out.println("Invalid count");
            return;
        }
        List<HMAC_Product> productList = new ArrayList<>();
        System.out.println("Enter Product details");
        for (int i = 0; i < count; i++) {
            String input = sc.nextLine().trim();
            String[] parts =  input.split(":");
            int productId = 0;
            String productName = "";
            double productPrice = 0;
            try{
                productId = Integer.parseInt(parts[0]);
                productName = parts[1];
                productPrice = Double.parseDouble(parts[2]);
            } catch (Exception e){
                System.out.println(e.getMessage());
            }

            productList.add(new HMAC_Product(productId, productName, productPrice));
        }

        System.out.println("1.Sort by Id");
        System.out.println("2.Sort by Price");
        System.out.println("Enter your choice");
        int choice = sc.nextInt();

        if (choice == 1){
            Collections.sort(productList, new HMAC_SortById());
            System.out.println("After Sorting By Id");
        } else if (choice == 2) {
            Collections.sort(productList, new HMAC_SortByPrice());
            System.out.println("After Sorting By Price");
        } else System.out.println("Invalid choice");

        for (HMAC_Product hmacProduct : productList) {
            System.out.println(hmacProduct.getProductId() + " "
                    + hmacProduct.getProductName() + " "
                    + hmacProduct.getPrice());
        }

    }
}