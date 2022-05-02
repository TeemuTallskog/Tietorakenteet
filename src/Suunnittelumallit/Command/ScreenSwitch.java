package Suunnittelumallit.Command;

public class ScreenSwitch {
    Command cmd;
    public ScreenSwitch(Command cmd){
        this.cmd = cmd;
    }

    public void flip(){
        cmd.execute();
    }
}
