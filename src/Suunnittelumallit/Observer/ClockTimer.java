package Suunnittelumallit.Observer;

public class ClockTimer extends Subject {
    private int hour;
    private int minute;
    private int second;

    public int getHour(){
        return hour;
    }
    public int getMinute(){
        return minute;
    }
    public int getSecond(){
        return second;
    }
    void tick(){
        if(second == 59){
            second = 0;
            if(minute == 59){
                minute = 0;
                hour++;
            }else minute ++;
        }else second++;
        aNotify();
    }
}
