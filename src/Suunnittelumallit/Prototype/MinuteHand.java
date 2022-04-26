package Suunnittelumallit.Prototype;

public class MinuteHand extends ClockHand{
    private int time;

    public MinuteHand(int time){
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
        if(time == 59) time = 0;
        else time++;
    }
}
