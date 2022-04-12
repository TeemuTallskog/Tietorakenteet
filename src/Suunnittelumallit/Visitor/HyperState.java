package Suunnittelumallit.Visitor;

import java.util.concurrent.TimeUnit;

public class HyperState extends CharacterState {

    private static HyperState instance = null;

    private HyperState(){}

    public static HyperState getInstance(){
        if(instance == null){
            instance = new HyperState();
        }
        return instance;
    }

    public void exercise(Joe joe){
        System.out.println("Joe is exercising over his limits...");
        try {
            TimeUnit.SECONDS.sleep(1);
        }catch (Exception ignored){}
        System.out.println("Joe is now done with exercising and he crashes hard and falls into tired state.");
        joe.changeState(TiredState.getInstance());
    }

    public void sleep(Joe joe){
        System.out.println("Joe is too hyped up to sleep.");
    }

    public void chill(Joe joe){
        System.out.println("Joe calms down and chills for a bit.");
        try {
            TimeUnit.SECONDS.sleep(1);
        }catch (Exception ignored){}
        System.out.println("Joe has calmed down and is not in Awake state");
        joe.changeState(AwakeState.getInstance());
    }

    public void accept(Visitor v, Joe joe){
        v.visit(this, joe);
    }

}
