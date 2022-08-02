package RailwayReservationSystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ticket{
    private int pnr;
    private List<UserDetails>userDetails;
    private static Scanner sc=new Scanner(System.in);

    public void reserve(int numbers){
        userDetails=new ArrayList<UserDetails>();
        for(int i=0;i<numbers;i++){
            System.out.println("Give user Details:");
        
        System.out.println("Enter name-");
        String name=sc.nextLine();

        System.out.println("Enter age-");
        int age=sc.nextInt();

        System.out.println("Enter gender(M/F)-");
        String gender=sc.next();

        System.out.println("Enter BerthPreference(LB/UB/MB)-");
        String berthpreference=sc.next();

      UserDetails user=new UserDetails(name , age, gender, berthpreference);
      userDetails.add(user);
        }
    }
        public int getPnr() {
            return pnr;
        }
    
        public void setPnr(int pnr) {
            this.pnr = pnr;
        }
  
}

