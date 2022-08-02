package RailwayReservationSystem;

import java.util.Scanner;
public class RailwayServiceImpl implements RailwayService {
  private Booking bookingObject;

  private static Scanner sc = new Scanner(System.in);

  public RailwayServiceImpl() {
    bookingObject = new Booking();
  }

  public void book() {
    System.out.println("Currently only one train available");
    bookingObject.book();
  }

  public String cancel() {
    return null;
  }

  public String printDetials(int pnr) {
    return null;
  }

  public String availability() {
    return "Available-";
  }

  @Override
  public String printDetails(int pnr) {
    // TODO Auto-generated method stub
    return null;
  }

}