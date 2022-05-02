package Suunnittelumallit.Facade;

public class CPU {
    private long pos;
    public void freeze(){
        pos = 0;
    }
    public void jump(long pos){
        this.pos = pos;
    }
    public void execute(){
        char c = Character.MAX_SURROGATE;
        while(c != Character.MIN_VALUE){
            pos++;
            System.out.println(c);
            c = Memory.access(pos);
        }
    }
}
