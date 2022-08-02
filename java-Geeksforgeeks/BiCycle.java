//base class
public class BiCycle {
    public int gear;
    public int speed;
    
    public BiCycle(int gear,int speed){
        this.gear=gear;
        this.speed=speed;
    }
    //the bicycle class has three methods
    public void applyBrake(int decrement){
        speed-=decrement;   
     }
     public void speedUp(int increment){
        speed+=increment;
     }
     public String toString(){
        return("No of geras are"+gear+"\n" +"the speed of bicycle"+speed);

     }
}
//derived class
class MountainBike extends BiCycle{
    public int seatHeight;

    public MountainBike(int gear,int speed,int starHeight){
        super(gear,speed);
        seatHeight=starHeight;
    }
    

}
