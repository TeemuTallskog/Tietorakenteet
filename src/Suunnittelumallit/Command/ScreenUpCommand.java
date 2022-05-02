package Suunnittelumallit.Command;

public class ScreenUpCommand implements Command{
    private SilverScreen screen;
    public ScreenUpCommand(SilverScreen screen){
        this.screen = screen;
    }
    @Override
    public void execute() {
        screen.rollUp();
    }
}
