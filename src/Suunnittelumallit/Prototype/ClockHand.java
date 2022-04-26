package Suunnittelumallit.Prototype;

public abstract class ClockHand implements Cloneable {
    abstract int getTime();

    abstract void setTime(int time);

    abstract void tickTime();

    public Object clone(){
        Object clone = null;

        try{
            clone = super.clone();
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        return clone;
    }
}
