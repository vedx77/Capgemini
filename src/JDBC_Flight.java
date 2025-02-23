public class JDBC_Flight {
    private int flightId;
    private String source;
    private String destination;
    private int noOfSeats;
    private double flightFare;

    //GETTERS
    public int getFlightId() { return this.flightId; }
    public String getSource() { return this.source; }
    public String getDestination() { return this.destination; }
    public int getNoOfSeats() { return this.noOfSeats; }
    public double getFlightFare() { return this.flightFare; }

    //SETTERS
    public void setFlightId(int flightId) { this.flightId = flightId; }
    public void setSource(String source) { this.source = source; }
    public void setDestination(String destination) { this.destination = destination; }
    public void setNoOfSeats(int noOfSeats) { this.noOfSeats = noOfSeats; }
    public void setFlightFare(double flightFare) { this.flightFare = flightFare; }

    JDBC_Flight(int flightId, String source, String destination, int noOfSeats, double flightFare){
        this.flightId = flightId;
        this.source = source;
        this.destination = destination;
        this.noOfSeats = noOfSeats;
        this.flightFare = flightFare;
    }
}
