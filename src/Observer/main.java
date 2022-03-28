package Observer;

public class main {
    public static void main(String[] args){
        ClockTimer timer = new ClockTimer();

        AnalogClock analogClock = new AnalogClock(timer);
        DigitalClock digitalClock = new DigitalClock(timer);

        while(timer.getHour() < 2){
            timer.tick();
        }
    }
}
