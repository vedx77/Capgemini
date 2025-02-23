import java.util.Scanner;
public class OxygenPlants {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l, b, pcm, tp;
        float pm, op;
        System.out.println("Enter the length of the room(in m)");
        l = sc.nextInt();
        if (l<=0){
            System.out.println("Invalid length");
            return;
            //System.exit(1);
        }
        System.out.println("Enter the breadth of the room(in m)");
        b = sc.nextInt();
        if (b<=0){
            System.out.println("Invalid breadth");
            return;
            //System.exit(1);
        }
        System.out.println("Enter the plant area of a single plant(in cm2)");
        pcm = sc.nextInt();
        if (pcm<=0){
            System.out.println("Invalid plant area");
            return;
            //System.exit(1);
        }
        pm = (float) pcm /10000;
        tp = (int) ((l*b)/pm);
        tp = (tp/10)*10;
        System.out.println("Total number of plants is " + tp);
        op = (float) (tp * 0.9);
        System.out.printf("Total oxygen production is %.2f litres\n", op);
    }
}