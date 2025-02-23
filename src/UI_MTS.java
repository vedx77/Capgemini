import java.util.Scanner;
public class UI_MTS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter movie name");
        String movie = sc.nextLine();
        System.out.println("Enter no of bookings");
        int bookings = sc.nextInt();
        System.out.println("Enter the available tickets");
        int availableTickets = sc.nextInt();
        MovieTicketStatic.setAvailableTickets(availableTickets);

        for (int i = 0; i < bookings; i++){
            MovieTicketStatic obj = new MovieTicketStatic();

            System.out.println("Enter the ticketid");
            int ticketId = sc.nextInt();
            obj.setTicketId(ticketId);

            System.out.println("Enter the price");
            int price = sc.nextInt();
            obj.setPrice(price);

            System.out.println("Enter the no of tickets");
            int nooftickets = sc.nextInt();

            System.out.println("Available Tickets:" + MovieTicketStatic.getAvailableTickets());

            int totalAmount = obj.calculateTicketCost(nooftickets);

            if (totalAmount == -1){
                System.out.println("Tickets are not available");
            } else {
                System.out.println("Total amount: " + totalAmount);
                if (MovieTicketStatic.getAvailableTickets() == 0){
                    System.out.println("Housefull");
                    break;
                } else {
                    System.out.println("Available ticket after booking: " + MovieTicketStatic.getAvailableTickets());
                }
            }
        }
        sc.close();
    }
}