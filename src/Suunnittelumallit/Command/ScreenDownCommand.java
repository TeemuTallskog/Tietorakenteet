package Suunnittelumallit.Command;

public class ScreenDownCommand implements Command{
    private SilverScreen screen;
    public ScreenDownCommand(SilverScreen screen){
        this.screen = screen;
    }
    @Override
    public void execute() {
        screen.rollDown();
    }
}
