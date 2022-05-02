package Suunnittelumallit.Command;

public class TestScreen {

    public static void main(String[] args){
        SilverScreen screen = new SilverScreen();
        Command switchUp = new ScreenUpCommand(screen);
        Command switchDown = new ScreenDownCommand(screen);
        ScreenSwitch switch1 = new ScreenSwitch(switchUp);
        ScreenSwitch switch2 = new ScreenSwitch(switchDown);

        switch1.flip();
        switch2.flip();
    }
}
