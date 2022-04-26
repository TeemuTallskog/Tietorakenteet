package Suunnittelumallit.Prototype;

public class HourHand extends ClockHand{
    private int time;

    public HourHand(int time){
        this.time = time;
    }

    @Override
    public int getTime() {
        return time;
    }

    @Override
    public void setTime(int hour) {
        this.time = hour;
    }

    @Override
    public void tickTime() {
        if(time == 23) time = 0;
        else time++;
    }
}
