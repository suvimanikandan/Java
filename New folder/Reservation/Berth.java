package Reservation;

public class Berth {
    private int LowerBerth=21;
    private int UpperBerth=21;
    private int MidleBerth=21;

    public void allocateBerth(Ticket ticket){
        if(LowerBerth!=0 && ticket.getBerthpreference().equals("LOWER BERTH")){
          LowerBerth--;
        ticket.setConfirmationStatus("Booked LOWER BERTH");
        }
        else if(UpperBerth!=0 && ticket.getBerthpreference().equals("UPPER BERTH")){
            UpperBerth--;
          ticket.setConfirmationStatus("Booked UPPER BERTH");
          }
         else if(MidleBerth!=0 && ticket.getBerthpreference().equals("MIDDLE BERTH")){
            MidleBerth--;
          ticket.setConfirmationStatus("Booked MIDDLE BERTH");
          }

          else{
              if(LowerBerth!=0){
                  ticket.setConfirmationStatus("Booked Lower Berth");
              }
              else if(UpperBerth!=0){
                ticket.setConfirmationStatus("Booked upper Berth");
            }
            else{
                ticket.setConfirmationStatus("Booked Midle Berth");
            }

          }
        

    }
    
}
