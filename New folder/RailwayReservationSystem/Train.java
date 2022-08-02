package RailwayReservationSystem;

import java.util.ArrayList;
import java.util.List;

public class Train {
    private int  train_id;
     private final int berth=63;
    private final int rac=18;
    private final int waitingList=10;

    private int available_berth;
    private int available_rac;

  private List<Ticket>ticketDetails;
private static int ticket_number=1000;
  private int booked;

  public Train(int id) {
      train_id=id;
        available_berth=berth;
        available_rac=rac;
    ticketDetails=new ArrayList<Ticket>();
      }
      public int reserve(int numbers){
          Ticket ticket=new Ticket();
          ticket.setPnr(ticket_number++);
          ticket.reserve(numbers);
          ticketDetails.add(ticket);
          

          return ticket.getPnr();


      }
}
