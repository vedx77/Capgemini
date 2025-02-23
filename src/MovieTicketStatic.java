public class MovieTicketStatic{
    private int ticketId;
    private int price;
    private static int availableTickets;

    //GETTERS
    public int getTicketId() { return ticketId; }
    public int getPrice() { return price; }
    public static int getAvailableTickets() { return availableTickets; }

    //SETTERS
    public void setTicketId(int ticketId) {
        this.ticketId = ticketId; }
    public void setPrice(int price) {
        this.price = price; }
    public static void setAvailableTickets(int availableTickets) {
        MovieTicketStatic.availableTickets = availableTickets; }

    public int calculateTicketCost(int nooftickets){
        if (availableTickets < nooftickets) {
            return -1; }

        int totalAmount = nooftickets * price;
        availableTickets -= nooftickets;

        return totalAmount;
    }
}