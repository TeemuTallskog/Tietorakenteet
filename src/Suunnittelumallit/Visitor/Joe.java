package Suunnittelumallit.Visitor;

public class Joe {
    private CharacterState cs = null;
    private int exercisePoints = 0;

    public Joe(){
        cs = AwakeState.getInstance();
    }

    public void changeState(CharacterState cs){
        this.cs = cs;
    }

    public void exercise(){
        cs.exercise(this);
    }

    public void addPoints(int points){
        exercisePoints += points;
    }

    public void chill(){
        cs.chill(this);
    }

    public void sleep(){
        cs.sleep(this);
    }

    public void accept(Visitor v){
        cs.accept(v, this);
    }

    public void printPoints(){
        System.out.println("Current points: " + exercisePoints);
    }
}
