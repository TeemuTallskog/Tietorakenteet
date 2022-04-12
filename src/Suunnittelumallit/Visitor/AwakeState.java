package Suunnittelumallit.Visitor;

import java.util.concurrent.TimeUnit;

public class AwakeState extends CharacterState {
    private static AwakeState instance = null;

    private AwakeState(){}

    public static AwakeState getInstance(){
        if(instance == null){
            instance = new AwakeState();
        }
        return instance;
    }

    public void exercise(Joe joe){
        System.out.println("Joe is now exercising...");
        try {
            TimeUnit.SECONDS.sleep(1);
        }catch (Exception ignored){}
        System.out.println("After exercising joe falls to tired state.");
        joe.changeState(TiredState.getInstance());
    }

    public void sleep(Joe joe){
        System.out.println("Joe goes for a nap...");
        try {
            TimeUnit.SECONDS.sleep(1);
        }catch (Exception ignored){}
        System.out.println("Joe wakes up and is now in Hyper state");
        joe.changeState(HyperState.getInstance());
    }

    public void chill(Joe joe){
        System.out.println("Joe sits down and relaxes for a bit");
        try {
            TimeUnit.SECONDS.sleep(1);
        }catch (Exception ignored){}
    }

    public void accept(Visitor v, Joe joe){
        v.visit(this, joe);
    }
}
