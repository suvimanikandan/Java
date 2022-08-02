package Reservation;

import java.util.ArrayList;

public class Train {

    ArrayList<Ticket> confrimedTicket=new ArrayList<Ticket>();
    ArrayList<Ticket> racTickets=new ArrayList<Ticket>();
    ArrayList<Ticket> waitingListTickets=new ArrayList<Ticket>();
    Berth berth=new Berth();

    public void bookTicket(Ticket ticket, ArrayList<Ticket> confirmedTickets){

        if(confirmedTickets.size()<2){
            berth.allocateBerth(ticket);
            confirmedTickets.add(ticket);
            }
            else if(racTickets.size()<1){
                ticket.setConfirmationStatus("IN RAC");
                racTickets.add(ticket);
                }
                else if(waitingListTickets.size()<1){
                    ticket.setConfirmationStatus("IN WAITING LIST TICKETS");  
                    waitingListTickets.add(ticket);
                    }
                    else{
                        System.out.println("NO TICKETS ARE AVAILABLE");
                    return;
                }
                displayTicket(ticket);
                
    }
    public void cancelTicket(Ticket ticket){
        if(removeTicket(ticket,confirmedTickets))
        {
            
        }
    }

   
}
