package Suunnittelumallit.State;

public class Joe {
    private CharacterState cs = null;

    public Joe(){
        cs = AwakeState.getInstance();
    }

    public void changeState(CharacterState cs){
        this.cs = cs;
    }

    public void exercise(){
        cs.exercise(this);
    }

    public void chill(){
        cs.chill(this);
    }

    public void sleep(){
        cs.sleep(this);
    }
}
