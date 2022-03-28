package Observer;

public class AnalogClock implements Observer{
    private ClockTimer timer;
    public AnalogClock(ClockTimer timer){
        this.timer = timer;
        timer.attach(this);
    }
    @Override
    public void update(Subject s) {
        if(s == timer){
            print();
        }
    }

    private void print(){
        int hour = timer.getHour();
        int minute = timer.getMinute();
        int second = timer.getSecond();
        System.out.println("Analog: " + hour + ":" + minute + ":" + second);
    }
}
