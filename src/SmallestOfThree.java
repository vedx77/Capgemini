import java.util.*;

public class SmallestOfThree {
    public static void main(String [] args){
        int a,b,c,smallest;

        Scanner scn = new Scanner(System.in);
        System.out.println("Enter three numbers:");

        a = scn.nextInt();
        b = scn.nextInt();
        c = scn.nextInt();

        if (a == b && b == c){
            System.out.println("All numbers are equal");}
        else{
            smallest = (a < b) ? (Math.min(a, c)) : (Math.min(b, c));
            System.out.println("The smallest number is " + smallest);
        }
    }
}