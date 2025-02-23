import java.util.*;

public class ReversedLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> li = new LinkedList<> (Arrays.asList(1,2,3,4,5));
        System.out.println(li);
        Collections.reverse(li);
        System.out.println(li);
    }
}