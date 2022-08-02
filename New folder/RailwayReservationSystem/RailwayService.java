package RailwayReservationSystem;

public  interface RailwayService {
    void book();
    String cancel();
    String printDetails(int pnr);
    String availability();
}
