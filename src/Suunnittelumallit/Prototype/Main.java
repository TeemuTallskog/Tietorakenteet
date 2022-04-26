package Suunnittelumallit.Prototype;

public class Main {
    public static void main(String[] args){
        HourHand hourHand = new HourHand(1);
        MinuteHand minuteHand = new MinuteHand(59);
        Clock clock = new Clock(hourHand, minuteHand);
        System.out.println(clock.getTime());
        Clock clock2 = clock.clone();
        System.out.println(clock2.getTime());

        clock2.ticktime();

        System.out.println(clock.getTime());
        System.out.println(clock2.getTime());

    }
}
