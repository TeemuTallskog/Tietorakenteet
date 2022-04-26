package Suunnittelumallit.Prototype;

public class Clock implements Cloneable{
    private ClockHand hourhand;
    private ClockHand minuteHand;

    public Clock(ClockHand hourhand, ClockHand minuteHand){
        this.hourhand = hourhand;
        this.minuteHand = minuteHand;
    }

    public String getTime(){
        return hourhand.getTime() + ":" + minuteHand.getTime();
    }

    public void ticktime(){
        minuteHand.tickTime();
        if(minuteHand.getTime() == 0) hourhand.tickTime();
    }

    public Clock clone(){
        Clock c = null;
        try{
            c = (Clock) super.clone();
            c.hourhand = (ClockHand) hourhand.clone();
            c.minuteHand = (ClockHand) minuteHand.clone();
        }catch (CloneNotSupportedException e){
        }
        return c;
    }

}
