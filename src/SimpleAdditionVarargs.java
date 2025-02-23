public class SimpleAdditionVarargs {
    public static void main(String[] args) {
        //Args 2
        System.out.println("Total " + addition(10, 15));
        System.out.println("Total " + addition(10, 20, 30));
        System.out.println("Total " + addition(10, 30, 60, 100, 5, 15));
    }
    public static int addition(int... a){
        System.out.println("Number of arguments is " + a.length);
        int sum = 0;
        for (int num : a){
            sum += num;
        }
        return sum;
    }
}