package Suunnittelumallit.State;

import java.util.concurrent.TimeUnit;

public class TiredState extends CharacterState{
    private static TiredState instance = null;

    private TiredState(){}

    public static TiredState getInstance(){
        if(instance == null){
            instance = new TiredState();
        }
        return instance;
    }

    public void exercise(Joe joe){
        System.out.println("Joe's too tired to exercise right now..");
    }
    public void sleep(Joe joe){
        System.out.println("Zzzzz...");
        try {
            TimeUnit.SECONDS.sleep(1);
        }catch (Exception ignored){}
        System.out.println("Joe slept well and is now awake.");
        changeState(joe, AwakeState.getInstance());
    }
    public void chill(Joe joe){
        System.out.println("Joe's just chilling for a bit...");
        try {
            TimeUnit.SECONDS.sleep(1);
        }catch (Exception ignored){}
    }
}
