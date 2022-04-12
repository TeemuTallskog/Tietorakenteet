package Suunnittelumallit.Visitor;

public abstract class CharacterState {

    public void exercise(Joe joe){}

    public void sleep(Joe joe){}

    public void chill(Joe joe){}

    public void changeState(Joe joe, CharacterState state){
        joe.changeState(state);
    }

    public void accept(Visitor v, Joe joe){}

}
